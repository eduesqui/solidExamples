package com.devtitlan.tutorial.solid.liskovSubstitutionPrincipleR.liskovFail;

import com.devtitlan.tutorial.solid.liskovSubstitutionPrincipleR.liskovOk.Geometry;
import com.devtitlan.tutorial.solid.liskovSubstitutionPrincipleR.liskovOk.ILesson;

public class RunExample {
	
	public static void main(String[] args) {
		RunExample.runLiskovFail();
		RunExample.runLiskovOk();
	}
	
	static void runLiskovFail() {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(5);
		rectangle.setWidth(2);
		System.out.println("rectangle area:" +rectangle.calculateArea());
		Square square = new Square();
		square.setHeight(5);
		square.setWidth(6);
		System.out.println("square area:"+square.calculateArea());
	}
	static void runLiskovOk() {
		ILesson scoreGeometry = new Geometry();
		System.out.println("Score Geometry:"+scoreGeometry.calculateScore(8.0,6.0));
		
		ILesson scoreHistory = new Geometry();
		System.out.println("Score History:"+scoreHistory.calculateScore(8.0,8.0));
	}

}
