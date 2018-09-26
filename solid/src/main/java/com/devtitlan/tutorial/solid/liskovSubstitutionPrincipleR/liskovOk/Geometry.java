package com.devtitlan.tutorial.solid.liskovSubstitutionPrincipleR.liskovOk;

public class Geometry implements ILesson{

	public double calculateScore(double homework, double exam) {

		return (homework*.2)+(exam*.8);	
	
	}
	

}
