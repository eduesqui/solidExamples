package com.devtitlan.tutorial.solid.liskovSubstitutionPrinciple.withoutLiskov;

public class TurtleImp implements IAnimal{

	public void eat() {
		System.out.println("Im eating insects");
		
	}

	public void walk() throws Exception {
		System.out.println("Im walking slowly");
		
	}
	
	
}
