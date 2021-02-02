package com.akash.models;

import java.util.List;


public class Employee {
	private int empId;
	private String empName;
	private int basicSalary;
	
	public Employee(){
		
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

	public int getBasicSalary() {
		return this.basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public int calculateGrossSalary() {
		int hra= this.basicSalary%50;
		int medical =5000;
		return (this.basicSalary+(int)(this.basicSalary*0.5)+4500);
	}

	public int calculateNetSalary() {
		int pt=200;
		int pf= this.basicSalary%12;
		return (calculateGrossSalary()-(int)(this.basicSalary*0.12)-200);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	public Employee(int empId, String empName, int basicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", BasicSalary=" + basicSalary + ", Gross Salary = " + calculateGrossSalary() +", Net Salary = " + calculateNetSalary() + "]";
	}
	

}
