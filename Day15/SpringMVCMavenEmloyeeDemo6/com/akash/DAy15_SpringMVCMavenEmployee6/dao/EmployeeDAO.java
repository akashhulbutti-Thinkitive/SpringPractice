package com.akash.DAy15_SpringMVCMavenEmployee6.dao;

import java.util.List;

import com.akash.DAy15_SpringMVCMavenEmployee6.model.Employee;

public interface EmployeeDAO {
	
	public boolean addEmployee(Employee employee);
	public boolean deleteEmployee(Integer empId);
	public boolean updateEmployee(Employee employee);
	public Employee getOneEmployee(Integer empId);
	public List getAllEmployee();
}
