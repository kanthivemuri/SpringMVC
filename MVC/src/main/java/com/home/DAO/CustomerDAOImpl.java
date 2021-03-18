package com.home.DAO;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


import com.home.Entity.Customer;
import com.home.Entity.Login;

public class CustomerDAOImpl implements CustomerDAO {
	//@Autowired
	//public DataSource datasource;
	@Autowired
	public JdbcTemplate jdbctemplate;
	@Override
	public void register(Customer customer) {
		String sql =  "INSERT INTO Customer (username,first_name,last_name,password,emailadd,phone)VALUES(?,?,?,?,?,?)";
		
  		System.out.println("Reached SQL");
        jdbctemplate.update(sql, new Object[] {customer.getUsername(),     customer.getFirst_name(),
		customer.getLast_name(),customer.getPassword(),customer.getEmailadd(),customer.getPhone()
		});
	}

		
		


	@Override
	public Customer Validate(Login login) {
		//String sql = "select * from Customer where username='" + login.getUsername() 
		//+ "' and  password='" 
		//	+login.getPassword()+"'";
		
		String sql="select * from Customer where username=? and password=?";
		
	//Customer cust = new Customer();
		//return (Customer) jdbctemplate.query(sql, new Object[] {login.getUsername(),login.getPassword()}, new CustomerMapper());
	
	return jdbctemplate.queryForObject(sql, new Object[]{login.getUsername(), login.getPassword()}, new CustomerMapper());
	
			
		
		

		//return cus.size() > 0 ? cus.get(0) : null;
		

	}
}
		
		


			
		
	
		
		
		
		
		

