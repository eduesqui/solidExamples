package com.devtitlan.tutorial.solid.liskovSubstitutionPrinciple.withLiskov;

public class TurtleImp implements IAnimal{

	public void eat() {
		System.out.println("Im eating insects");
		
	}

	public void jump() throws Exception {
		throw new Exception("I cant jump :(");
	}
	
	
}
