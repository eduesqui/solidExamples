package com.devtitlan.tutorial.solid.dependencyInversionPrinciple.fail;

import com.devtitlan.tutorial.solid.dependencyInversionPrinciple.Person;

public class ServicePerson {
	
	public void savePerson(Person person) {
		MySql mysql = new MySql();
		mysql.savePerson(person);
	}

}
