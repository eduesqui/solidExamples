package com.devtitlan.tutorial.solid.liskovSubstitutionPrincipleR.liskovFail;

public class Rectangle {

	int width;
	int height;
	
	public double calculateArea(){
		return height * width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	
}
