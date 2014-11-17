package com.cpe.jee.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.cpe.jee.facade.EmployeeManagerLocal;
import com.irc.jee.model.Employee;

/**
 * Session Bean implementation class EmployeeManager
 */
@Stateless
@LocalBean
public class EmployeeManager implements EmployeeManagerLocal {
	
	@EJB
	private EmployeeDAO employeeDAO;

    /**
     * Default constructor. 
     */
    public EmployeeManager() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Employee e) {
		isEmployeeWithAllData(e);
		employeeDAO.save(e);
	}

	@Override
	public Employee update(Employee e) {
		isEmployeeWithAllData(e);
		return employeeDAO.update(e);
	}

	@Override
	public void delete(Employee e) {
		employeeDAO.delete(e);
	}

	@Override
	public Employee find(int employeeID) {
		return employeeDAO.find(employeeID);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}
	
	private void isEmployeeWithAllData(Employee e) {
		boolean hasError = false;
		if(e == null) {
			hasError = true;
		}
		if(e.getFirstname() == null || "".equals(e.getFirstname().trim())) {
			hasError = true;
		}
		if(e.getLastname() == null || "".equals(e.getLastname().trim())) {
			hasError = true;
		}
		if(e.getUsername() == null || "".equals(e.getUsername().trim())) {
			hasError = true;
		}
		if(e.getBirthDate() == null) {
			hasError = true;
		}
		
		if(hasError) {
			   throw new IllegalArgumentException("The employee is missing data. Check the firstname, lastname, username and birthdate, they should have value.");
		}
		
	}

}
