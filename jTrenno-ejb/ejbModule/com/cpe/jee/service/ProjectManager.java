package com.cpe.jee.service;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
public class ProjectManager implements ProjectManagerLocal {
	
	private final static String UNIT_NAME = "jTrenno-jpa";
	@PersistenceContext(unitName = UNIT_NAME)
	private EntityManager em;
	
	@Inject
	private EmployeeManagerLocal employeeManager;

	@Override
	public void createProject(float budget, String description, String name) {
		Project p = new Project();
		p.setBudget(budget);
		p.setDescription(description);
		p.setName(name);
		p.setActivities(null);
		p.setEmployee(employeeManager.find(1));
		
		em.persist(p);
	}

}