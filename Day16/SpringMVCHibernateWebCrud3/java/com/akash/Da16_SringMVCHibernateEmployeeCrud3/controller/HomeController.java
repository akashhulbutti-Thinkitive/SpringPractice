package com.akash.Da16_SringMVCHibernateEmployeeCrud3.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.akash.Da16_SringMVCHibernateEmployeeCrud3.dao.EmployeeDaoImpl;
import com.akash.Da16_SringMVCHibernateEmployeeCrud3.models.Employee;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/home")
	public ModelAndView getHome(){
		return new ModelAndView("home");
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(Employee employee) {
		ModelAndView model = new ModelAndView();
		EmployeeDaoImpl daiimpl = new EmployeeDaoImpl();
		daiimpl.saveEmployee(employee);
		model.addObject("list", daiimpl.showListEmployee());
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping("/getAllEmployees")
	public ModelAndView getAllEmployee() {
		ModelAndView model = new ModelAndView();
		model.addObject("list", new EmployeeDaoImpl().showListEmployee());
		model.setViewName("viewEmployee");
		return model;
	}
	
	@RequestMapping("/getOneEmployee")
	public ModelAndView getSingleEmployee(@RequestParam("empid") Integer empId) {
		ModelAndView model = new ModelAndView();
		System.out.println("Update Id: "+empId);
		model.addObject("emp", new EmployeeDaoImpl().getSingleRecords(empId));
		model.setViewName("update");
		return model;
	}
	
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(@RequestParam("empid") Integer empId) {
		ModelAndView model = new ModelAndView();
		System.out.println("Delete Id: "+empId);
		EmployeeDaoImpl daoEmp =  new EmployeeDaoImpl();
		daoEmp.deleteEmployee(empId);
		model.addObject("list",daoEmp.showListEmployee());
		model.setViewName("viewEmployee");
		return model;
	}
	
	
	@RequestMapping("/updateEmployee")
	public ModelAndView updateOneEmployee(Employee emp) {
		ModelAndView model = new ModelAndView();
		EmployeeDaoImpl daoEmp =  new EmployeeDaoImpl();
		daoEmp.updateEmployee(emp);
		model.addObject("list",daoEmp.showListEmployee());
		model.setViewName("viewEmployee");
		return model;
	}
}
