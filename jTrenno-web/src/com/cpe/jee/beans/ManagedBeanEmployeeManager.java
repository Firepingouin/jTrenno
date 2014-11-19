package com.cpe.jee.beans;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import com.irc.jee.model.Employee;

@Named("employeeManager")
@RequestScoped
public class ManagedBeanEmployeeManager implements EmployeeManager {
	// @Inject
	private transient Logger logger;
	@PersistenceContext(unitName="jTrenno-jpa")
	private EntityManager userDatabase;
	@Inject
	private UserTransaction utx;
	private Employee newEmployee = new Employee();

	@SuppressWarnings("unchecked")
	@Produces
	@Named
	@RequestScoped
	public List<Employee> getEmployees() throws Exception {
		try {
			try {
				utx.begin();
				return userDatabase.createQuery("select e from Employee e")
						.getResultList();
			} finally {
				utx.commit();
			}
		} catch (Exception e) {
			utx.rollback();
			throw e;
		}
	}

	public String addEmployee() throws Exception {
		try {
			try {
				utx.begin();
				userDatabase.persist(newEmployee);
				logger.info("Added " + newEmployee);
			} finally {
				utx.commit();
			}
		} catch (Exception e) {
			utx.rollback();
			throw e;
		}
		return "employeeAdded";
	}

	public Employee findEmployee(String username)
			throws Exception {
		try {
			try {
				utx.begin();
				@SuppressWarnings("unchecked")
				List<Employee> results = userDatabase
						.createQuery(
								"select e from Employee e where e.username=:username")
						.setParameter("username", username).getResultList();
				if (results.isEmpty()) {
					return null;
				} else if (results.size() > 1) {
					throw new IllegalStateException(
							"Cannot have more than one user with the same username!");
				} else {
					return results.get(0);
				}
			} finally {
				utx.commit();
			}
		} catch (Exception e) {
			utx.rollback();
			throw e;
		}
	}

	@Produces
	@RequestScoped
	@Named
	public Employee getNewEmployee() {
		return newEmployee;
	}
}