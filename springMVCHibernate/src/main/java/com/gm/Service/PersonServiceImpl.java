package com.gm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.DAO.PersonDAO;
import com.gm.HibernateEntity.Person;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonDAO persondao;
	
    @Override
	@Transactional
	public void addPersonService(Person p) {
		
		
		persondao.addPerson(p);
		
	}

	@Override
	@Transactional
	public Person updatePersonService(Person p) {

		return persondao.updatePerson(p);
		
		
	}

	@Override
	@Transactional
	public int removePersonService(int id) {
         
		persondao.removePerson(id);
		
		return 0;
	}

	@Override
	@Transactional
	public Person findByIdService(int id) {
		Person p = null;
		try {
		 p = persondao.findById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return p;
		
	}

	@Override
	@Transactional
	public List<Person> ListPersonsService() {

		 return persondao.listPersons();
		
		
	}

}
