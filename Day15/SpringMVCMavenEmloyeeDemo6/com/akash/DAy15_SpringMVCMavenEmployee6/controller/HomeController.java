package com.akash.DAy15_SpringMVCMavenEmployee6.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.akash.DAy15_SpringMVCMavenEmployee6.dao.EmployeeDaoImpl;
import com.akash.DAy15_SpringMVCMavenEmployee6.model.Employee;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/home")
	public ModelAndView returnHome() {
		return new ModelAndView("home");
	}

	@RequestMapping("/save")
	public ModelAndView saveEmployee(Employee employee) {
		ModelAndView model = new ModelAndView();
		EmployeeDaoImpl empDao = new EmployeeDaoImpl();
		if (empDao.addEmployee(employee)) {
			model.addObject("msg", "Employee Added SuccessFully");
		} else {
			model.addObject("msg", "Employee Cannot be Added");
		}
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value = "/updateEmployee",method = RequestMethod.GET)
	public ModelAndView updateEmployeePage(@RequestParam("empId") String empId) {
		ModelAndView model = new ModelAndView();
		model.setViewName("update");
		model.addObject("employee",  new EmployeeDaoImpl().getOneEmployee(Integer.parseInt(empId)));
		return model;
	}

	@RequestMapping(value = "/updateEmployee",method = RequestMethod.POST)
	public ModelAndView updateEmployee(Employee employee) {
		ModelAndView model = new ModelAndView();
		EmployeeDaoImpl empDao = new EmployeeDaoImpl();
		if (empDao.updateEmployee(employee)) {
			model.addObject("msg", "Employee Updated SuccessFully");
		} else {
			model.addObject("msg", "Employee Cannot be Updated");
		}
		model.addObject("list", new EmployeeDaoImpl().getAllEmployee());
		model.setViewName("viewList");
		return model;
	}
	
	
	@RequestMapping(value = "/deleteEmployee",method = RequestMethod.GET)
	public ModelAndView deleteEmployeePage(@RequestParam("empId") String empId) {
		ModelAndView model = new ModelAndView();
		if(new EmployeeDaoImpl().deleteEmployee(Integer.parseInt(empId))) {
			model.addObject("msg","Employee Deleted Successfuly");
		}else {
			model.addObject("msg","Employee COld Not Be Deleted");
		}
		model.addObject("list", new EmployeeDaoImpl().getAllEmployee());
		model.setViewName("viewList");
		return model;
	}
	
	
	@RequestMapping("/viewEmployee")
	public ModelAndView viewListEmployees() {
		ModelAndView model = new ModelAndView();
		EmployeeDaoImpl empDao = new EmployeeDaoImpl();
			model.addObject("list", empDao.getAllEmployee());

		model.setViewName("viewList");
		return model;
	}

}
