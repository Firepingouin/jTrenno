package com.irc.jee.mbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.cpe.jee.facade.MmployeeManagerLocal;
import com.cpe.jee.model.Person;

@ManagedBean
@SessionScoped
public class PersonMbean {

	@Inject
	private MmployeeManagerLocal employeeManager;
	private Person p;
	private String hello;
	private String name;
	
	
	@PostConstruct
	public void init()
	{
		p=new Person();
		p.setName("Mohamed");
		p.setMail("sallami_mohamed@yahoo.fr");
		hello ="";
	}

	public String getHello() {
		hello = employeeManager.hello(p);
		return hello;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail()
	{
		List<Person> persons = employeeManager.personnes();
		if(name!=null && persons!=null)
			for(Person p:persons)
				if(p.getName().equalsIgnoreCase(name))
					return p.getMail();
		return "";
	}
	
}
