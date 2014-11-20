package com.cpe.jee.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.irc.jee.model.Employee;

@SessionScoped
@Named
public class Signup implements Serializable {
	@Inject
	   private EmployeeManager employeeManager;
	   private Employee currentEmployee;
	   
	   public void signup() throws Exception {
			  Employee employee = new Employee();

		      if (employee != null) {
		         this.currentEmployee = employee;
		         FacesContext.getCurrentInstance().addMessage(null,
		               new FacesMessage("Welcome, " + currentEmployee.getFirstname()));
		      }
		   }
}
