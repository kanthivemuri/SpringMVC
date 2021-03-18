package com.home.Controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.home.Entity.Customer;
import com.home.Entity.Login;
import com.home.Service.CustomerService;
import com.home.Service.CustomerServiceImpl;


@Controller
public class MyController {
	
	@Autowired
	public  CustomerServiceImpl customerservice;
	
    @RequestMapping(value = "/register" , method= RequestMethod.GET)
	public ModelAndView showMe(@ModelAttribute("customer") Customer cus) {
    	 System.out.println("register page");
    	 //Customer cus = new Customer();
    	ModelAndView mav = new ModelAndView("welcome-form");
    	System.out.println("request welcome to welcome jsp filee");
    	mav.addObject("customer", cus);
    	return mav;

    }
    
    
    
  @RequestMapping(value="/registerProcess", method=RequestMethod.POST)
    public ModelAndView registerprocess(@ModelAttribute("customer") Customer customer) 
  {
	  customerservice.registerservice(customer);
	   System.out.println("register process reached");
	   ModelAndView mv = new ModelAndView("registerprocess");
	   mv.addObject("first_name", customer.getFirst_name());           //// String uservalue =  resquest.getParameter("first_name");
	  System.out.println("Registration completed");
	   return mv;
   }  
	   
			       
  @RequestMapping(value="/login", method=RequestMethod.GET)
    //public ModelAndView showLogin(@ModelAttribute("login1") Login login) 
   public ModelAndView showLogin()
   {
	   
	  
	   ModelAndView mav1 = new ModelAndView("Login");
	   //mav1.addObject("login", new Login());
	   mav1.addObject("message", "Welcome to Login");
		System.out.println("showLogin method done");

				return mav1;
    }
    
    @RequestMapping(value="/loginProcess", method=RequestMethod.POST)
    public ModelAndView loginProcess(@ModelAttribute("Login") Login login) {
    	
    	
    	Customer customer = customerservice.validateservice(login);
    // customerservice.validateservice(login); 
System.out.println("loginp reached");
    	
    ModelAndView mv = null;
    
    if(null != customer) {
    	
    		mv = new ModelAndView("loginprocess");
        	
        	mv.addObject("first_name", customer.getFirst_name());
        	System.out.println("valid customer");

    }
    	 
   else 
    {
    	 mv = new ModelAndView("Login");
    mv.addObject("message", "username or password is wrong");
    System.out.println("Invalid Customer");
    }
		return mv;
    
    
    }
    
    @RequestMapping(value="/welcome/{city}/{username}", method=RequestMethod.GET)
   // public ModelAndView hello(@PathVariable ("username") String name, @PathVariable ("city") String city) OR
    
    public ModelAndView hello(@PathVariable Map<String,String> parameter){
    	
    	String name =parameter.get("username");
    	String city= parameter.get("city");
    ModelAndView mv = new ModelAndView("hellopage");
    mv.addObject("msg", "hello "+name+ ", "+ " you are from "+city);
    return mv;
    	
    }
    
}





   




