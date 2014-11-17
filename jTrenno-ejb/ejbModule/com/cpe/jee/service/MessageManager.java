package com.cpe.jee.service;

import com.cpe.jee.facade.MessageManagerLocal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

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
