package com.cpe.jee.service;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cpe.jee.facade.ActivityManagerLocal;
import com.cpe.jee.facade.EmployeeManagerLocal;
import com.cpe.jee.facade.ProjectManagerLocal;
import com.irc.jee.model.Activity;
import com.irc.jee.model.Employee;
import com.irc.jee.model.Project;

/**
 * Session Bean implementation class ProjectManager
 */
@Stateless
@LocalBean
public class ActivityManager implements ActivityManagerLocal {
	
	private final static String UNIT_NAME = "jTrenno-jpa";
	@PersistenceContext(unitName = UNIT_NAME)
	private EntityManager em;
	
	@Inject
	private EmployeeManagerLocal employeeManager;
	
	@Inject
	private ProjectManagerLocal projectManager;

	@Override
	public void createActivity(int workedTime, int employee, int project) {
		
		Activity a = new Activity();
		a.setDate(new Date());
		a.setEmployee(employeeManager.find(employee));
		a.setProject(projectManager.find(project));
		a.setWorkedTime(workedTime);
		em.persist(a);
	}
	
	public List<Employee> getEmployeesList(){
		return em.createQuery("select e from Employee e").getResultList();
	}
	
	public List<Project> getProjectsList(){
		return em.createQuery("select p from Project p").getResultList();
	}

}