package com.cpe.jee.dao;

import javax.ejb.Stateless;
import java.util.HashMap;
import java.util.Map;

import com.irc.jee.model.Employee;

@Stateless
public class EmployeeDAO extends GenericDAO<Employee> {

	 public EmployeeDAO() {
	  super(Employee.class);
	 }

	 public Employee findALLEmployee(){
	  Map<String, Object> parameters = new HashMap<String, Object>(); 

	  return super.findOneResult(Employee.FIND_ALL, parameters);
	 }
}
