package com.gm.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.gm.HibernateEntity.Person;
import com.gm.Service.PersonService;

@Controller

public class HibernateController {
	
	//@SuppressWarnings("unused")
	//private static final Logger logger = LoggerFactory.getLogger(HibernateController.class);

	@Autowired
	private PersonService personservice;
	
	@RequestMapping(value = "/list")
	public ModelAndView  listPersons(ModelAndView model) {
	List<Person> listperson  =	personservice.ListPersonsService();
	model.addObject("listperson" ,listperson);
	model.setViewName("list");
	System.out.println("Controller done");
	return model;
}
	@RequestMapping(value="/newPerson", method=RequestMethod.GET)
	public ModelAndView newPerson(@ModelAttribute Person person) {
		
		ModelAndView mv = new ModelAndView("person-form");
        mv.addObject("person", person );
        return mv;
		
	}
	
	@RequestMapping(value="/savePerson", method=RequestMethod.POST)
	public ModelAndView AddPerson(@ModelAttribute ("person") Person person) {


if(person.getId() == 0) {
    	   personservice.addPersonService(person);
       }
    
       else {
    	    personservice.updatePersonService(person);
           
  
       }
		return new ModelAndView("redirect:/list");
	
	}
	
	
	/*@RequestMapping(value="/person/edit", method=RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
        int personid = Integer.parseInt(request.getParameter("id"));
        Person person = personservice.findByIdService(personid);
        ModelAndView model = new ModelAndView("person-form");
        model.addObject("person", person);
 
        return model;
	}*/
	
	
    @RequestMapping(value="/person/delete/{id}")
    public String delete(@PathVariable("id") int id ) {
    	personservice.removePersonService(id);
    	return "redirect:/"
    			+ "list";
	
}
    @RequestMapping(value="/{id}")
        public ModelAndView edit(@PathVariable("id") int id) {
    	Person person = personservice.findByIdService(id);
        ModelAndView mv = new ModelAndView("person-form");
	 try {

    	
    	if(person != null)
        	mv.addObject("person",person );
    	else
    	  throw new Exception("no person found");	
	   }
	  catch(Exception e)
	   {
		   e.printStackTrace();
	  }
	   
    	return mv;
    }
}




	
	

