package com.devtitlan.tutorial.solid.dependencyInversionPrinciple.ok;

import com.devtitlan.tutorial.solid.dependencyInversionPrinciple.Person;

public class ServicePerson {
	
	
	private IPersistence persistence;
	
	public ServicePerson(IPersistence persistence) {
		this.persistence = persistence;
	}

	public void savePerson(Person person) {
		persistence.save(person);
	}

}
