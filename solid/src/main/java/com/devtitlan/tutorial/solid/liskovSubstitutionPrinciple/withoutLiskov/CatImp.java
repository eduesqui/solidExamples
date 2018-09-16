package com.devtitlan.tutorial.solid.liskovSubstitutionPrinciple.withoutLiskov;

public class CatImp  implements IAnimal{

	public void eat() {
		System.out.println("Im eating rats");
		
	}

	public void walk() throws Exception {
		System.out.println("Im walking");
	}
	
}
