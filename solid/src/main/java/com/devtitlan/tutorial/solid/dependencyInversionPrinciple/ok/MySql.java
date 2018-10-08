package com.devtitlan.tutorial.solid.dependencyInversionPrinciple.ok;

import com.devtitlan.tutorial.solid.dependencyInversionPrinciple.Person;

public class MySql implements IPersistence {
	
	

	public void save(Object object) {
		System.out.println("Save  ok...");
		
	}

}
