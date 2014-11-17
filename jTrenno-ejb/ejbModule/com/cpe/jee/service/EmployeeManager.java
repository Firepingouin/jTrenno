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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee update(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee find(int employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
