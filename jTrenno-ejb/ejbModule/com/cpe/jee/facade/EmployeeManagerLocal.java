package com.cpe.jee.facade;

import java.util.List;

import javax.ejb.Local;

import com.irc.jee.model.Employee;

@Local
public interface EmployeeManagerLocal {
	
	public abstract void save (Employee e);
	public abstract Employee update (Employee e);
	public abstract void delete (Employee e);
	public abstract Employee find (int employeeID);	
	public abstract List<Employee> findAll();
}
