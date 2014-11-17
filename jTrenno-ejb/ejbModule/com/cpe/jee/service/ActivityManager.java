package com.cpe.jee.service;

import com.cpe.jee.facade.ActivityLocal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

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
