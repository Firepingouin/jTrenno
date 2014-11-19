package com.cpe.jee.beans;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateful;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.irc.jee.model.Employee;

@Named("employeeManager")
@RequestScoped
@Alternative
@Stateful
public class EJBEmployeeManager implements EmployeeManager {
	// @Inject
	private transient Logger logger;
	@PersistenceContext(unitName="jTrenno-jpa")
	private EntityManager employeeDatabase;
	private Employee newEmployee = new Employee();

	@SuppressWarnings("unchecked")
	@Produces
	@Named
	@RequestScoped
	public List<Employee> getEmployees() throws Exception {
		return employeeDatabase.createQuery("select e from Employee e")
				.getResultList();
	}

	public String addEmployee() throws Exception {
		employeeDatabase.persist(newEmployee);
		logger.info("Added " + newEmployee);
		return "userAdded";
	}

	public Employee findEmployee(String username)
			throws Exception {
		@SuppressWarnings("unchecked")
		List<Employee> results = employeeDatabase
				.createQuery(
						"select e from Employee u where u.firstname=:username")
				.setParameter("username", username).getResultList();
		if (results.isEmpty()) {
			return null;
		} else if (results.size() > 1) {
			throw new IllegalStateException(
					"Cannot have more than one user with the same username!");
		} else {
			return results.get(0);
		}
	}

	@Produces
	@RequestScoped
	@Named
	public Employee getNewEmployee() {
		return newEmployee;
	}
}