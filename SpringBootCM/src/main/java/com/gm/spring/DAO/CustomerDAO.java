package com.gm.spring.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gm.spring.model.Customer;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {
	
}
 