package com.cpe.jee.facade;

import java.util.List;

import javax.ejb.Local;

import com.irc.jee.model.Employee;
import com.irc.jee.model.Project;

@Local
public interface ActivityManagerLocal {
	public abstract void createActivity(int workedTime, int employee, int project);
	public abstract List<Employee> getEmployeesList();
	public abstract List<Project> getProjectsList();
}
