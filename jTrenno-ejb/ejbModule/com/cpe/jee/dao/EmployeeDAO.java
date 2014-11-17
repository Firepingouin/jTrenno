package com.cpe.jee.dao;

import javax.ejb.Stateless;

import com.irc.jee.model.Employee;

@Stateless
public class EmployeeDAO extends GenericDAO<Employee> {

	 public EmployeeDAO() {
	  super(Employee.class);
	 }

	 public Employee findALLEmployee(){

	  return (Employee) super.findAll();
	 }
}
