package ua.com.Qalight.Olga.circle;

import ua.com.Qalight.Olga.AbstractShape;

public class Circle extends AbstractShape{

	private double radius;
	
	
	public Circle(double i) {
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}

}
