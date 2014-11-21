package com.cpe.jee.beans;


import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.irc.jee.model.Employee;
import com.irc.jee.model.Project;

@ManagedBean (name="projectModelBean")
@RequestScoped
public class ActivityModelBean implements Serializable{

	private int workedTime;
	private Employee employee;
	private Project project;
	
	public ActivityModelBean() {
		super();
	}
	
	public ActivityModelBean(int workedTime, Employee employee, Project project) {
		super();
		this.workedTime = workedTime;
		this.employee = employee;
		this.project = project;
	}

	public int getWorkedTime() {
		return workedTime;
	}

	public void setWorkedTime(int workedTime) {
		this.workedTime = workedTime;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}
