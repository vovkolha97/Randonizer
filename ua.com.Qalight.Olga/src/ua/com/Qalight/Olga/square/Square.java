package ua.com.Qalight.Olga.square;

import ua.com.Qalight.Olga.AbstractShape;

public class Square extends AbstractShape{

	private double side;
	

	public Square(int i) {
	}


	public double getSide() {
		return side;
	}


	public void setSide(double side) {
		this.side = side;
	}


	@Override
	public double getArea() {
		return side*side;
	}
	
}
