package com.cpe.jee.controllers;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.cpe.jee.beans.EmployeeModelBean;
import com.cpe.jee.facade.EmployeeManagerLocal;
import com.irc.jee.model.Employee;

@ManagedBean
@ApplicationScoped
public class EmployeeController {

	@Inject
	private EmployeeManagerLocal employeeManager;

	public void addEmployee(EmployeeModelBean e) throws Exception {
		try {
			employeeManager.createEmployee(e.getFirstname(), e.getLastname(),
					e.getUsername(), e.getEmail(), e.getBirthDate());
			FacesContext.getCurrentInstance().getExternalContext().redirect("users.xhtml");
		} catch (Exception ex) {
			String errorMessage = getRootErrorMessage(ex);
		}
	}

	private String getRootErrorMessage(Exception e) {
		// Default to general error message that registration failed.
		String errorMessage = "Registration failed. See server log for more information";
		if (e == null) {
			// This shouldn't happen, but return the default messages
			return errorMessage;
		}

		// Start with the exception and recurse to find the root cause
		Throwable t = e;
		while (t != null) {
			// Get the message from the Throwable class instance
			errorMessage = t.getLocalizedMessage();
			t = t.getCause();
		}
		// This is the root cause message
		return errorMessage;
	}
	
	public List<Employee> getEmployees() {
		return this.employeeManager.findAll();
	}
}