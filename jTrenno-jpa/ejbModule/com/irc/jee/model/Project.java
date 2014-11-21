package com.irc.jee.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
@Table(name = "project")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private float budget;

	private String description;

	private String name;

	//bi-directional many-to-one association to Activity
	@OneToMany(mappedBy="project")
	private List<Activity> activities;

	//bi-directional many-to-one association to Employee
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="manager_id")
	private Employee employee;

	public Project() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBudget() {
		return this.budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Activity> getActivities() {
		return this.activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public Activity addActivity(Activity activity) {
		getActivities().add(activity);
		activity.setProject(this);

		return activity;
	}

	public Activity removeActivity(Activity activity) {
		getActivities().remove(activity);
		activity.setProject(null);

		return activity;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}