package com.akash;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.akash.services.Calculator;

@Controller
public class MyController {
	
	@Autowired Calculator calculator;
	
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
	public ModelAndView myPagePost(String num1, String num2) {
		System.out.println("My COntroller Called : Post ");
		ModelAndView model = new ModelAndView();
		System.out.println("Num1 : " + num1 + " - Num2 :" + num2);
		model.addObject("modelObjAdd", "<h3>Addition is :"+calculator.add(Integer.parseInt(num1), Integer.parseInt(num2))+" </h3>");
		model.addObject("modelObjSub", "<h3>Subtraction is :"+calculator.add(Integer.parseInt(num1), Integer.parseInt(num2))+" </h3>");
		model.addObject("modelObjMul", "<h3>Multiplication is :"+calculator.add(Integer.parseInt(num1), Integer.parseInt(num2))+" </h3>");
		if (Integer.parseInt(num2)>0) {
			model.addObject("modelObjDiv", "<h3>Division is :"+calculator.div(Integer.parseInt(num1), Integer.parseInt(num2))+" </h3>");
		} else {
			model.addObject("modelObjDiv", "<h3>Cannot Divide By ZERO</h3>");
		}
		model.setViewName("welcome.jsp");
		return model;
	}

}
