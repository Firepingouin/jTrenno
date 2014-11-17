package com.cpe.jee.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.cpe.jee.facade.ActivityLocal;

/**
 * Session Bean implementation class ActivityManager
 */
@Stateless
@LocalBean
public class ActivityManager implements ActivityLocal {

    /**
     * Default constructor. 
     */
    public ActivityManager() {
        // TODO Auto-generated constructor stub
    }

}
