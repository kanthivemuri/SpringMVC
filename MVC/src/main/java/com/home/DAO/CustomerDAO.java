package com.home.DAO;

import java.util.List;

import com.home.Entity.Customer;
import com.home.Entity.Login;

public interface CustomerDAO {

	public void register(Customer customer);
	public Customer Validate(Login login);
	
}
