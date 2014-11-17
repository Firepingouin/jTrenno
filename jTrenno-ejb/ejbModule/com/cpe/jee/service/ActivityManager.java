package com.cpe.jee.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.cpe.jee.facade.ActivityManagerLocal;

/**
 * Session Bean implementation class ActivityManager
 */
@Stateless
@LocalBean
public class ActivityManager implements ActivityManagerLocal {

    /**
     * Default constructor. 
     */
    public ActivityManager() {
        // TODO Auto-generated constructor stub
    }

}
