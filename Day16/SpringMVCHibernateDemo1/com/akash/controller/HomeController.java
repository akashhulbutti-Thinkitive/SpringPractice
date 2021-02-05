package com.akash.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akash.dao.EmployeeDaoImpl;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		//System.out.println(new EmployeeDaoImpl().showListEmployee());
		return new ModelAndView("home");
	}
	
	@RequestMapping("/listEmployees")
	public ModelAndView showEmployees() {
		//System.out.println();
		ModelAndView model = new ModelAndView("home");
		model.addObject("list", new EmployeeDaoImpl().showListEmployee());
		return model;
	}
}
