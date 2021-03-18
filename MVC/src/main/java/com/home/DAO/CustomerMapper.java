package com.home.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.home.Entity.Customer;

public  class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException
	{
	
		Customer customer = new Customer();
		customer.setUsername(rs.getString("username"));
		customer.setFirst_name(rs.getString("first_name"));
		customer.setLast_name(rs.getString("last_name"));
		customer.setPassword(rs.getString("password"));
		customer.setPhone(rs.getInt("phone"));
		customer.setEmailadd(rs.getString("emailadd"));
		return customer;
	}

	


}
