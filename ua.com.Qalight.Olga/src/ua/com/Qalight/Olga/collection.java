package ua.com.Qalight.Olga;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import ua.com.Qalight.Olga.square.Square;

import ua.com.Qalight.Olga.circle.Circle;


public class collection {
	
	static Logger logger = Logger.getLogger(collection.class.getName());

	public static void main(String[] args) {

		Shape sqare1 = new Square(5);
		Shape sqare2 = new Square(8);
		Shape sqare3 = new Square(15);
		Shape sqare4 = new Square(11);
		Shape sqare5 = new Square(9);
		Shape circle1 = new Circle(14.0);
		Shape circle2 = new Circle(7.0);

		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(sqare1);
		shapes.add(sqare2);
		shapes.add(sqare3);
		shapes.add(sqare4);
		shapes.add(sqare5);
		shapes.add(circle1);
		shapes.add(circle2);
		
		Shape maxShape = shapes.get(0);
		for(int i = 0; i < shapes.size();i++) {
			if(maxShape.getArea() < shapes.get(i).getArea()) {
				maxShape = shapes.get(i);
			}
		}
	logger.info("Maximal area of shapes is " + maxShape.getArea() + "and type is " + maxShape.getClass().getSimpleName());
	
	}

}
