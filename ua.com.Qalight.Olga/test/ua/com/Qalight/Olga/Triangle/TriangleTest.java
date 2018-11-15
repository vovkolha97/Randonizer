package ua.com.Qalight.Olga.Triangle;

import static org.junit.Assert.*;

import org.junit.Test;

import Triangle.Triangle;

public class TriangleTest {

	@Test
	public void testGetArea() {
		
		Triangle triangle = new Triangle();
		triangle.setBase(10);
		triangle.setHeight(15);
		double result = triangle.getArea();
	
	assertNotNull(triangle.getArea());
	assertTrue(result >74.9 && result < 75.1);
	
	}

}
