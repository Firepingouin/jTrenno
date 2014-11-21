package com.cpe.jee.service;

import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cpe.jee.dao.EmployeeDAO;
import com.cpe.jee.dao.ProjectDAO;
import com.cpe.jee.facade.EmployeeManagerLocal;
import com.cpe.jee.facade.ProjectManagerLocal;
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
	
	@EJB
	private ProjectDAO projectDAO;
	
	@Inject
	private EmployeeManagerLocal employeeManager;

	@Override
	public void createProject(float budget, String description, String name, int manager) {
		Project p = new Project();
		p.setBudget(budget);
		p.setDescription(description);
		p.setName(name);
		p.setActivities(null);
		p.setEmployee(employeeManager.find(manager));
		
		em.persist(p);
	}
	
	public List<Employee> getManagersList() {
		return em.createQuery("select e from Employee e").getResultList();
	}
	
	@Override
	public Project find(int projectID) {
		return projectDAO.find(projectID);
	}

}