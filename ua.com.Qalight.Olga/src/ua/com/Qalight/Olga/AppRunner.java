package ua.com.Qalight.Olga;

import java.util.logging.Logger;

import Circle.Circle;
import Square.Square;
import Triangle.Triangle;

public class AppRunner {
	
	static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		circle1.setRadius(3);
		
		logger.info("Area of circle " + circle1.getArea());
		
		Square square1 = new Square();
		square1.setSide(4);
		
		logger.info("Area of square " + square1.getArea());

		
		Triangle triangle1 = new Triangle();
		triangle1.setBase(3);
		triangle1.setHeight(6);
		
		logger.info("Area of triangle " + triangle1.getArea());

		
		
	}
	
}
