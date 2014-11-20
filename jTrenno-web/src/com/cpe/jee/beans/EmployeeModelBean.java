package com.cpe.jee.beans;


import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployeeModelBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date arrivalDate;
	private Date birthDate;
	private String email;
	private String firstname;
	private String lastname;
	private String username;
	
	public EmployeeModelBean() {
		super();
	}
	
	public EmployeeModelBean(Date arrivalDate, Date birthDate, String email,
			String firstname, String lastname, String username) {
		super();
		this.arrivalDate = arrivalDate;
		this.birthDate = birthDate;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "[firstname]:"+this.getFirstname()+",[LASTNAME]:"+this.getLastname()+",[MAIL]:"+this.getEmail()+",[USERNAME]:"+this.getUsername()+",[BD]:"+this.getBirthDate();
	}

}
