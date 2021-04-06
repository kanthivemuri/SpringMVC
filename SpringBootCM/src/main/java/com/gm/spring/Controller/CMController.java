package com.gm.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gm.spring.Service.CustomerServiceImpl;
import com.gm.spring.model.Customer;

@RestController(value="/api")
public class CMController {

	@Autowired
	private CustomerServiceImpl customerserviceimpl;
	
	@PostMapping("/")
	public Customer addCustomer(@RequestBody Customer customer ) {
		
		System.out.println("reached");
		 return customerserviceimpl.addCustomerSer(customer);
	}
	
}
