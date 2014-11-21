package com.cpe.jee.facade;

import java.util.Date;

import javax.ejb.Local;

@Local
public interface ProjectManagerLocal {
	
	public abstract void createProject(float budget, String description, String name);

}
