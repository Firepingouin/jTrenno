package com.cpe.jee.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.cpe.jee.facade.ProjectManagerLocal;

/**
 * Session Bean implementation class ProjectManager
 */
@Stateless
@LocalBean
public class ProjectManager implements ProjectManagerLocal {

    /**
     * Default constructor. 
     */
    public ProjectManager() {
        // TODO Auto-generated constructor stub
    }

}
