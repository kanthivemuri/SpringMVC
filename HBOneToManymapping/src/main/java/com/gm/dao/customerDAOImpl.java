package com.gm.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gm.model.address;
import com.gm.model.customer;

public class customerDAOImpl implements customerDAO{
	
	@Override
	public void save() {
		

		System.out.println("save method started");
		
		Configuration config = new Configuration().configure("com/gm/files/hibernate.cfg.xml");
	
		SessionFactory sessionfactory=config.buildSessionFactory();
		System.out.println("save ended");
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
  customer cus = new customer();		
  cus.setCname("kisore");
	cus.setCemail("kisore@sgmail.com");
	cus.setCphone("654321");
	
	System.out.println("Customer objs added");
	
	address addr1 = new address();
  //  addr1.setHouseno(6);
	addr1.setCity("irving");
  addr1.setState("texas");
  addr1.setZipcode("234123");
  

  
  address addr2 = new address();
 // addr1.setHouseno(7);
	addr2.setCity("plano");
  addr2.setState("texas1");
  addr2.setZipcode("54321");
	
  //adding child objs to set collection 
  Set set = new HashSet();
  
  set.add(addr1);
  set.add(addr2);
  
  //add child objs to parent
  
  cus.setAddr(set);
        session.save(cus);
        transaction.commit();
        System.out.println("Objects are saved");
		

}

	@Override
	public void delete(int id) {
		Configuration config = new Configuration().configure("com/gm/files/hibernate.cfg.xml");
		
		SessionFactory sessionfactory=config.buildSessionFactory();
		System.out.println("save ended");
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();	
		
		
		Object cus1 = session.get(customer.class, id);
		session.delete(cus1);
		transaction.commit();
		System.out.println("objects deleted");
		
	}
}
	
	
