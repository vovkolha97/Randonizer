package ua.com.Qalight.Olga.circle;

import static org.junit.Assert.*;

import org.junit.Test;

import Circle.Circle;

public class CircleTest {

	@Test
	public void testGetArea() {
		Circle circle = new Circle();
		circle.setRadius(4);
		double result = circle.getArea();
		
	assertNotNull(circle.getArea());
	assertTrue(result > 50.0 && result < 51.0);
	}

}