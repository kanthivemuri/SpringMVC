package com.gm.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.spring.DAO.CustomerDAO;
import com.gm.spring.model.Customer;

@Service
public class CustomerServiceImpl{
	
	@Autowired
	private CustomerDAO customerdao;

	public Customer  addCustomerSer(Customer customer) {
		System.out.println("added");
        return customerdao.save(customer);
		
	}

	public Customer getByIdSer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getAllSer() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String deleteSer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
