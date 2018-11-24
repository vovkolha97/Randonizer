package ua.com.Qalight.Olga;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import ua.com.Qalight.Olga.square.Square;
import ua.com.Qalight.Olga.triangle.Triangle;
import ua.com.Qalight.Olga.circle.Circle;

public class Collection {

	static Logger logger = Logger.getLogger(Collection.class.getName());

	public static void main(String[] args) {

		
		List<Shape> shapes = getShapeList();

		
		Shape maxShape = getMaxShape(shapes);
				
				

		Shape minShape = getMinShape(shapes);
				
			

		logger.info("Maximal area of shapes is " + maxShape.getArea() + " and type is "
				+ maxShape.getClass().getSimpleName());
		logger.info("Minimal area of shapes is " + minShape.getArea() + " and type is "
				+ minShape.getClass().getSimpleName());

	}

	private static Shape getMinShape(List<Shape> shapes) {
		
		Shape minShape = shapes.get(0);
		for (int j = 0; j > shapes.size(); j++) {
			if (minShape.getArea() > shapes.get(j).getArea()) {
				minShape = shapes.get(j);
			}
		}
		
		
		return minShape;
	}

	private static Shape getMaxShape(List<Shape> shapes) {
		Shape maxShape = shapes.get(0);
		for (int i = 0; i < shapes.size(); i++) {
			if (maxShape.getArea() < shapes.get(i).getArea()) {
				maxShape = shapes.get(i);
			}
		}
		
		return maxShape;
	}

	private static List<Shape> getShapeList() {
		List<Shape> shapes = new ArrayList<>();
		
		Shape sqare1 = new Square(5);
		Shape sqare2 = new Square(8);
		Shape sqare3 = new Square(15);
		Shape triangle1 = new Triangle(12, 7);
		Shape triangle2 = new Triangle(8, 9);
		Shape circle1 = new Circle(14.0);
		Shape circle2 = new Circle(7.0);
		
		shapes.add(sqare1);
		shapes.add(sqare2);
		shapes.add(sqare3);
		shapes.add(triangle1);
		shapes.add(triangle2);
		shapes.add(circle1);
		shapes.add(circle2);
		
		return shapes;
	}

}
