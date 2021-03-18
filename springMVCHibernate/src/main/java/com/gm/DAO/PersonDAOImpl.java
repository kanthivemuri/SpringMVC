package com.gm.DAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gm.HibernateEntity.Person;

@Repository
public class PersonDAOImpl implements PersonDAO{
	
	
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public void addPerson(Person p) 
	{
    sessionfactory.getCurrentSession().persist(p);
  
  //  session.persist(p);
    System.out.println("session reached");
	}
	

	@Override
	public Person updatePerson(Person p) {
        Session session = sessionfactory.getCurrentSession();
        session.update(p);
        return p;
        
	}

	@Override
	public int removePerson(int id) {
    
		Session session = sessionfactory.getCurrentSession();
		Person person = (Person) session.load(Person.class, id);
	session.delete(person);
	
	if (person.getId() != 0) {
		
		return 0;
		}
		
	else
		
		return 1;
	}

	@Override
	public Person findById(int id) {
//String sql = "select name, country from Person where id=?";
	//	Person p1 = new Person();
		Session session = sessionfactory.getCurrentSession();
		Person p = (Person) session.get(Person.class, id);
		return p;
	}

	@SuppressWarnings( "unchecked")
	public List<Person> listPersons() {
		return sessionfactory.getCurrentSession().createQuery("from Person").list();

		
		/*String hql = "from Person";
	Session session = sessionfactory.getCurrentSession();
	List<Person> list = session.createQuery(hql).list();
	
	for(Person p : list) 
	{
	System.out.println("Person listed successfully, Persons Detail: " +p);
	}
	return list;
	}*/

	}
}

