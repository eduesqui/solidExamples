package com.devtitlan.tutorial.solid.openClosePrinciple;



public class Circle implements IShape {
	private double radius;
	
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Double getArea() {
		return radius * radius * Math.PI;
	}

	

}
