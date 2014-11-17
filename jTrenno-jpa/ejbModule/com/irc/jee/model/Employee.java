package com.irc.jee.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="arrival_date")
	private Date arrivalDate;

	@Lob
	private byte[] avatar;

	@Temporal(TemporalType.DATE)
	@Column(name="birth_date")
	private Date birthDate;

	private String email;

	private String firstname;

	private String lastname;

	private String username;

	//bi-directional many-to-one association to Activity
	@OneToMany(mappedBy="employee")
	private List<Activity> activities;

	//bi-directional many-to-one association to Conversation
	@OneToMany(mappedBy="employee1")
	private List<Conversation> conversations1;

	//bi-directional many-to-one association to Conversation
	@OneToMany(mappedBy="employee2")
	private List<Conversation> conversations2;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="employee")
	private List<Project> projects;

	public Employee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getArrivalDate() {
		return this.arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public byte[] getAvatar() {
		return this.avatar;
	}

	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Activity> getActivities() {
		return this.activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public Activity addActivity(Activity activity) {
		getActivities().add(activity);
		activity.setEmployee(this);

		return activity;
	}

	public Activity removeActivity(Activity activity) {
		getActivities().remove(activity);
		activity.setEmployee(null);

		return activity;
	}

	public List<Conversation> getConversations1() {
		return this.conversations1;
	}

	public void setConversations1(List<Conversation> conversations1) {
		this.conversations1 = conversations1;
	}

	public Conversation addConversations1(Conversation conversations1) {
		getConversations1().add(conversations1);
		conversations1.setEmployee1(this);

		return conversations1;
	}

	public Conversation removeConversations1(Conversation conversations1) {
		getConversations1().remove(conversations1);
		conversations1.setEmployee1(null);

		return conversations1;
	}

	public List<Conversation> getConversations2() {
		return this.conversations2;
	}

	public void setConversations2(List<Conversation> conversations2) {
		this.conversations2 = conversations2;
	}

	public Conversation addConversations2(Conversation conversations2) {
		getConversations2().add(conversations2);
		conversations2.setEmployee2(this);

		return conversations2;
	}

	public Conversation removeConversations2(Conversation conversations2) {
		getConversations2().remove(conversations2);
		conversations2.setEmployee2(null);

		return conversations2;
	}

	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project addProject(Project project) {
		getProjects().add(project);
		project.setEmployee(this);

		return project;
	}

	public Project removeProject(Project project) {
		getProjects().remove(project);
		project.setEmployee(null);

		return project;
	}

}