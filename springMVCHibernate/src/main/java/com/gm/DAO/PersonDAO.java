package com.gm.DAO;

import java.util.List;

import com.gm.HibernateEntity.Person;

public interface PersonDAO {
	
	public void addPerson(Person p);
	public Person updatePerson(Person p);
	public int removePerson(int id);
	public Person findById(int id);
	public List<Person> listPersons();

}
