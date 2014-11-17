package com.cpe.jee.service;

import com.cpe.jee.facade.ConversationManagerLocal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ConversationManager
 */
@Stateless
@LocalBean
public class ConversationManager implements ConversationManagerLocal {

    /**
     * Default constructor. 
     */
    public ConversationManager() {
        // TODO Auto-generated constructor stub
    }

}
