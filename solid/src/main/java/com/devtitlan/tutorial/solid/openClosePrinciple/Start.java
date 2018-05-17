package com.devtitlan.tutorial.solid.openClosePrinciple;

public class Start {

	
	
	public double getArea(IShape shape) {
		double area = 0;
		 if(shape instanceof Circle) {
			Triangle triangle = (Triangle) shape;
			area= (triangle.getBase()*triangle.getHeight())/2;
	     
			 
		 }else if(shape instanceof Circle) {
		 } else {
	         Circle circle = (Circle)shape;
	         area = circle.getRadius() * circle.getRadius() * Math.PI;
			 
		 }
		 
		 return area;
	}
	
	/**
	 * Function that respect open/close principle
	 * @param shape
	 * @return
	 */
	public double calculateArea(IShape shape) {
		return shape.getArea();
		
		
	}
}
