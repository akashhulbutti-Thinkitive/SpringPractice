package com.akash.services;

import java.util.ArrayList;
import java.util.List;

import com.akash.models.Employee;

public class EmployeeService {
	
	List<Employee> list = new ArrayList<>();
	
	public void saveEmployee(Employee emp) {
		list.add(emp);
	}
	
	public void updateEmployee(Employee emp) {
		list.set(list.indexOf(emp), emp);
	}
	
	public void deleteEmployee(Employee e) {
		list.remove(e);
	}

	public List<Employee> getAllEmployees() {
		return list;
	}

	public Employee getOneEmployee(Integer empid) {
		Employee emp = null;
		for (Employee e : list) {
			if (e.getEid() == empid)
				emp = e;
		}
		return emp;
	}

}
