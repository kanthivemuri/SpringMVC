package com.gm.Service;

import java.util.HashSet;
import java.util.Set;


import com.gm.dao.customerDAO;
import com.gm.dao.customerDAOImpl;
import com.gm.model.address;
import com.gm.model.customer;

public class test {


public static void main(String []args) {
	
	customerDAO dao = new customerDAOImpl();
		
	
    dao.save();
  //dao.delete(6);
    
		
		
		
		
	}
	
	
}
