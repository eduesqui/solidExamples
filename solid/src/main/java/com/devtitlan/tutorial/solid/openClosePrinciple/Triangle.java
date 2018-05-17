package com.devtitlan.tutorial.solid.openClosePrinciple;

public class Triangle implements IShape{

	private Double base;
	private Double height;
	
	public Double getArea() {
		return (base*height)/2;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	
}

