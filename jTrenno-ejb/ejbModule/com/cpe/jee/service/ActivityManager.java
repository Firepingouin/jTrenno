package com.cpe.jee.service;

import java.util.ArrayList;
import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cpe.jee.facade.ActivityManagerLocal;
import com.cpe.jee.facade.EmployeeManagerLocal;
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

	@Override
	public void createActivity(int workedTime, Employee employee, Project project) {
		
		Activity a = new Activity();
		a.setDate(new Date());
		a.setEmployee(employee);
		a.setProject(project);
		a.setWorkedTime(workedTime);
/*
		p.setEmployee(employeeManager.find(1));
		*/
		em.persist(a);
	}

}