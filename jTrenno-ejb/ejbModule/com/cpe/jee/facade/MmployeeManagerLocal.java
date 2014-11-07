package com.cpe.jee.facade;

import java.util.List;

import javax.ejb.Local;

import com.cpe.jee.model.Person;

@Local
public interface MmployeeManagerLocal {
public String hello(Person p);
public List<Person> personnes();
}
