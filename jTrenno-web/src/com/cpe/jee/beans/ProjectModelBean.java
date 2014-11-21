package com.cpe.jee.beans;


import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="projectModelBean")
@RequestScoped
public class ProjectModelBean implements Serializable{

	
	private float budget;
	private String description;
	private String name;
	
	public ProjectModelBean() {
		super();
	}
	
	public ProjectModelBean(float budget, String description, String name) {
		super();
		this.budget = budget;
		this.description = description;
		this.name = name;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
