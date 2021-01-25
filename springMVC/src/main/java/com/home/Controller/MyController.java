package com.home.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
    @RequestMapping("/home")
	public String showMe() {
    	
    	System.out.println("Reached Home");
		return ("welcome-form");

    }
     
    @RequestMapping("/login")
    public String login() {
    	return ("Login");
    }
    
 /*   @RequestMapping("/sign-up")
    public String signUp(Model model) {
    	
String register = model.addAttribute(attributeValue)


return "sign-up";*/
    	
    	
   // }
   
  /*  @RequestMapping(value = "/registration", method = RequestMethod.GET)
    @ResponseBody
   public String doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	  String FirstName = request.getParameter("FirsttName");
	  String LastName = request.getParameter("LastName");
	  String Password = request.getParameter("password");
	  String Email = request.getParameter("email");
	  String Phone = request.getParameter("phone");
	  
	  if(FirstName.isEmpty() || LastName.isEmpty() || Password.isEmpty()|| Email.isEmpty()
	  || Phone.isEmpty())
	  {
	  return ("welcome-form.jsp");
	 // req.include(request, response);
	  }
	  else {
		 return ("success-form.jsp");*/
	 
		//req1.forward(request, response);
    
    
@RequestMapping(value="/login" ,  method= RequestMethod.POST)
public String LoginPage(Model model) {
	
	
return ("Login.jsp");
	}




}





   




