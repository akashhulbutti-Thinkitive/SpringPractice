package com.akash.DAy15_SpringMVCMavenEmployee6.dao;

import java.util.ArrayList;
import java.util.List;

import com.akash.DAy15_SpringMVCMavenEmployee6.model.Employee;

public class EmployeeDaoImpl implements EmployeeDAO{
	public static List<Employee> list = new ArrayList<Employee>();
	
	public EmployeeDaoImpl(){
		
	}

	@Override
	public boolean addEmployee(Employee employee) {
			list.add(employee);
			return true;
	}

	@Override
	public boolean deleteEmployee(Integer empId) {
		Employee emp =getOneEmployee(empId);
		if(emp!=null) {
			list.remove(emp);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		if(deleteEmployee(employee.getEmpId())) {
			list.add(employee);
		}
		
	return false;	
	}

	@Override
	public Employee getOneEmployee(Integer empId) {
	
		if(list.size()>0) {
			for(Employee emp: list) {
				if(emp.getEmpId() == empId )
					return emp;
			}
		}
		return null;
	}

	@Override
	public List getAllEmployee() {
		
		return list;
	}

}
