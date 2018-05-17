package com.devtitlan.tutorial.solid.singleResponsibilityPrinciple;

public class Triangle {

	private Double base;
	private Double height;
	
	public Double getArea() {
		return (base*height)/2;
	}
	
	/**
	 * This function should be delete to meet the principle
	 * @return
	 */
	public String printHtmlOuput() {
		return "<h1>Result:</h1><p>The areas is "+getArea()+"</p>";
	}
}

