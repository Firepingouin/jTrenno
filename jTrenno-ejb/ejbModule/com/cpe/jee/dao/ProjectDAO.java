package com.cpe.jee.dao;

import javax.ejb.Stateless;

import com.irc.jee.model.Project;


@Stateless
public class ProjectDAO  extends GenericDAO<Project> {

	 public ProjectDAO() {
	  super(Project.class);
	 }
}