package com.cpe.jee.beans;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.irc.jee.model.Employee;

@SessionScoped
@Named
public class Login implements Serializable {

   private static final long serialVersionUID = 7965455427888195913L;

   @Inject
   private Credentials credentials;
   @Inject
   private EmployeeManager employeeManager;
   private Employee currentEmployee;

   public void login() throws Exception {
	  Employee employee = employeeManager.findEmployee(credentials.getUsername());

      if (employee != null) {
         this.currentEmployee = employee;
         FacesContext.getCurrentInstance().addMessage(null,
               new FacesMessage("Welcome, " + currentEmployee.getFirstname()));
      }
   }

   public void logout() {
      FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage("Goodbye, " + currentEmployee.getFirstname()));
      currentEmployee= null;
   }

   public boolean isLoggedIn() {
      return currentEmployee != null;
   }

   @Produces
   public Employee getCurrentEmployee() {
      return currentEmployee;
   }
}