package com.cpe.jee.facade;

import java.util.List;

import javax.ejb.Local;

import com.irc.jee.model.Employee;
import com.irc.jee.model.Project;

@Local
public interface ProjectManagerLocal {
	
	public abstract void createProject(float budget, String description, String name, int manager);
	public abstract List<Employee> getManagersList();
	public abstract List<Project> getProjects();
}
