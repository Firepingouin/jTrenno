package com.cpe.jee.beans;

import java.util.List;

import com.irc.jee.model.Employee;

public class EmployeeListBean {
	private List<Employee> employees;
	

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
