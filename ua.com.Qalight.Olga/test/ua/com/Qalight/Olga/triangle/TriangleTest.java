package ua.com.Qalight.Olga.triangle;

import static org.junit.Assert.*;

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
