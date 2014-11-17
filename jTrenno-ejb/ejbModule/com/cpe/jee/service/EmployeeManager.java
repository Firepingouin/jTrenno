package com.cpe.jee.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.cpe.jee.facade.EmployeeManagerLocal;

/**
 * Session Bean implementation class EmployeeManager
 */
@Stateless
@LocalBean
public class EmployeeManager implements EmployeeManagerLocal {

    /**
     * Default constructor. 
     */
    public EmployeeManager() {
        // TODO Auto-generated constructor stub
    }

}
