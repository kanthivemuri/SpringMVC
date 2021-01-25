package com.home.Service;

import com.home.Entity.Customer;
import com.home.Entity.Login;

public interface CustomerService {

	public void registerservice(Customer customer);
	public Customer validateservice(Login login);
}
