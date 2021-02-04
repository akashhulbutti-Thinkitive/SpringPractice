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
	public ModelAndView myPageGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("My COntroller Called : Get ");

		System.out.println("Username : " + request.getParameter("username"));
		System.out.println("Password : " + request.getParameter("password"));
		ModelAndView model = new ModelAndView();
		model.addObject("modelObj", "GET : This is ModelandView Object Data");
		model.setViewName("welcome.jsp");
		return model;

	}

	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public ModelAndView myPagePost(String username, String password) {
		System.out.println("My COntroller Called : Post ");
		ModelAndView model = new ModelAndView();
		System.out.println("Username : " + username + " - Passowrd :" + password);
		if (username.equals("admin") && password.equals("admin")) {
			System.out.println("True");
			model.addObject("modelObj", "<h3>POST : This is ModelandView Object Data</h3>");
			model.setViewName("welcome.jsp");
		} else {
			System.out.println("False");
			model.addObject("modelObj", "<h3>POST : Username Or Password is Wrong</h3> \n");
			model.setViewName("index.jsp");

		}
		return model;
	}

}
