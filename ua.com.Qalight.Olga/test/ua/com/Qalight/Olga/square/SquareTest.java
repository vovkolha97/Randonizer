package ua.com.Qalight.Olga.square;

import static org.junit.Assert.*;

import org.junit.Test;

import Square.Square;

public class SquareTest {

	@Test
	public void testGetArea() {
		Square square = new Square();
		square.setSide(15);
		double result = square.getArea();
		
	assertNotNull(square.getArea());
	assertTrue(result > 224.9 && result < 225.1);
	
		
	}

}
