package com.cpe.jee.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.cpe.jee.facade.MmployeeManagerLocal;
import com.cpe.jee.model.Person;

/**
 * Session Bean implementation class MmployeeManager
 */
@Stateless
@LocalBean
public class MmployeeManager implements MmployeeManagerLocal {

    /**
     * Default constructor. 
     */
    public MmployeeManager() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String hello(Person p) {
		
		return "Hello "+ p.getName();
	}

	@Override
	public List<Person> personnes() {
		List<Person> persons = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setName("TOTO");
		p1.setMail("toto@cpe.fr");
		Person p2 = new Person();
		p2.setName("TITI");
		p2.setMail("titi@cpe.fr");
		persons.add(p1);
		persons.add(p2);
		return persons;
	}

}
