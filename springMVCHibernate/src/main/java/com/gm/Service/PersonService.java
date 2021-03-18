package com.gm.Service;

import java.util.List;

import com.gm.HibernateEntity.Person;

public interface PersonService {
	
	public void addPersonService(Person p);
	public Person updatePersonService(Person p);
	public int removePersonService(int id);
	public Person findByIdService(int id);
	public List<Person> ListPersonsService();
}
