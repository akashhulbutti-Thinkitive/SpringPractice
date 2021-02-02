package com.akash;

import java.util.List;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	private List<String> projects;
	
	public Employee(){
		
	}
	
public Employee(int empId,String empName,int salary,List<String> projects){
		super();
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.projects = projects;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", projects=" + projects
				+ "]";
	}


	
	
}
