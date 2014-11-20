package com.cpe.jee.beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="employeeSignupBean")
@RequestScoped
public class EmployeeSignupBean extends EmployeeModelBean{
	public EmployeeSignupBean() {
	}
}
