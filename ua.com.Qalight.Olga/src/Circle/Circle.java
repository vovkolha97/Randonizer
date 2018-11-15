package Circle;

import ua.com.Qalight.Olga.AbstractShape;

public class Circle extends AbstractShape{

	private double radius;
	
	
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
