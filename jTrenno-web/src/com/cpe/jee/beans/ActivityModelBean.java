package com.cpe.jee.beans;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="activityModelBean")
@RequestScoped
public class ActivityModelBean implements Serializable{

	private int workedTime;
	private int employee;
	private int project;
	
	public ActivityModelBean() {
		super();
	}
	
	public ActivityModelBean(int workedTime) {
		super();
		this.workedTime = workedTime;
	}

	public int getWorkedTime() {
		return workedTime;
	}

	public void setWorkedTime(int workedTime) {
		this.workedTime = workedTime;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	public int getProject() {
		return project;
	}

	public void setProject(int project) {
		this.project = project;
	}

	
}
