package com.akash.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "demoemployee")
public class Employee {
	private int eid;
	private int salary;
	private String empName;
	
	public Employee(){
		
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + salary;
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
		if (eid != other.eid)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}


	public Employee(int eid, int salary, String empName) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.empName = empName;
	}


	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", empName=" + empName + "]";
	}
	
	

}
