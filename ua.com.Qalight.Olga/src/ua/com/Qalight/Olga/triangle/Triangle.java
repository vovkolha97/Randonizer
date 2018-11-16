package ua.com.Qalight.Olga.triangle;

import ua.com.Qalight.Olga.AbstractShape;

public class Triangle extends AbstractShape{

	private double base;
	private double height;
	
	
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public double getArea() {
		return height*base*0.5;
	}

}
