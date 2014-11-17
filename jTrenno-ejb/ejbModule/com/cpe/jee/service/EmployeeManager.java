package com.cpe.jee.service;

import com.cpe.jee.facade.EmployeeManagerLocal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

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
