package com.devtitlan.tutorial.solid.dependencyInversionPrinciple.fail;

import com.devtitlan.tutorial.solid.dependencyInversionPrinciple.Person;

public class MySql {
	
	public void savePerson(Person person) {
		System.out.println("Save person ok...");
	}

}
