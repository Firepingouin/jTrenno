package com.irc.jee.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the activity database table.
 * 
 */
@Entity
@Table(name = "activity")
@NamedQuery(name="Activity.findAll", query="SELECT a FROM Activity a")
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name="worked_time")
	private int workedTime;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	private Employee employee;

	//bi-directional many-to-one association to Project
	@ManyToOne
	private Project project;

	public Activity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getWorkedTime() {
		return this.workedTime;
	}

	public void setWorkedTime(int workedTime) {
		this.workedTime = workedTime;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}