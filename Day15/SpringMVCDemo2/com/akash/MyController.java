package com.akash;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ModelAndView myPageGet(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("My COntroller Called : Get ");
		
		System.out.println("Username : "+request.getParameter("username"));
		System.out.println("Password : "+request.getParameter("password"));
		ModelAndView model = new ModelAndView();
		model.addObject("modelObj", "GET : This is ModelandView Object Data");
		model.setViewName("welcome.jsp");
		return model;
		
	}
	
	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public ModelAndView myPagePost(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("My COntroller Called : Post ");

		System.out.println("Username : "+request.getParameter("username"));
		System.out.println("Password : "+request.getParameter("password"));
		ModelAndView model = new ModelAndView();
		model.addObject("modelObj", "POST : This is ModelandView Object Data");
		model.setViewName("welcome.jsp");
		return model;
	}

}
