package com.cpe.jee.facade;

import javax.ejb.Local;

import com.irc.jee.model.Employee;
import com.irc.jee.model.Project;

@Local
public interface ActivityManagerLocal {
	public abstract void createActivity(int workedTime, Employee employee, Project project);
}
