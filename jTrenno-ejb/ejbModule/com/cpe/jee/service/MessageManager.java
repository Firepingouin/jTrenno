package com.cpe.jee.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.cpe.jee.facade.MessageManagerLocal;

/**
 * Session Bean implementation class MessageManager
 */
@Stateless
@LocalBean
public class MessageManager implements MessageManagerLocal {

    /**
     * Default constructor. 
     */
    public MessageManager() {
        // TODO Auto-generated constructor stub
    }

}
