package com.cpe.jee.beans;

import java.util.List;

import com.irc.jee.model.Employee;

public interface EmployeeManager {
	public List<Employee> getEmployees() throws Exception;
	public String addEmployee() throws Exception;
	public Employee findEmployee(String username) throws Exception;
	public Employee getNewEmployee();
}
