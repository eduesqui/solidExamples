package com.devtitlan.tutorial.solid.liskovSubstitutionPrincipleR.liskovOk;


public class History implements ILesson{

	public double calculateScore(double homework, double exam) {
	
		return (homework*.3)+(exam*.7);
	}

}
