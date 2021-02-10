package com.akash.controller;

import java.util.List;

import javax.validation.Path.ReturnValueNode;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.models.Employee;
import com.akash.services.EmployeeService;

@RestController
public class MainController {

	EmployeeService empService = new EmployeeService();
	
	@GetMapping(value = "/getAllEmployee")
	public List<Employee> getAllEMployee(){
		return empService.getAllEmployees();
	}
	
	@GetMapping(value = "/getEmployee/{empid}")
	public Employee getSingleEmployee(@PathVariable("empid") Integer empid) {
		return empService.getOneEmployee(empid);
	}
	
	@PostMapping(value = "/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		empService.saveEmployee(emp);
		return emp;
	}
	
	@DeleteMapping(value = "/deleteEmployee")
	public List<Employee> deleteEmployee(@RequestBody Employee emp){
		empService.deleteEmployee(emp);
		return empService.getAllEmployees();
	}
	
	@PutMapping(value = "/updateEmployee")
	public List<Employee> updateEMployee(@RequestBody Employee emp){
		empService.updateEmployee(emp);
		return empService.getAllEmployees();
	}
	
	
}
