package com.home.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.home.DAO.CustomerDAO;
import com.home.DAO.CustomerDAOImpl;
import com.home.Entity.Customer;
import com.home.Entity.Login;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
	public CustomerDAOImpl customerdao;
	@Override
	public void registerservice(Customer customer) {
		customerdao.register(customer);
	
	}

	@Override
	public  Customer validateservice(Login login) {

		System.out.println("cs level reached");
   	return customerdao.Validate(login);
		
	}

}
