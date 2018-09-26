package com.devtitlan.tutorial.solid.liskovSubstitutionPrincipleR.liskovFail;

public class Square extends Rectangle {
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.height = width;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}
}
