package com.devtitlan.tutorial.solid.liskovSubstitutionPrinciple.withLiskov;

public class CatImp  implements IAnimal{

	public void eat() {
		System.out.println("Im eating rats");
		
	}

	public void jump() throws Exception {
		System.out.println("Im jumping");
	}
	
}
