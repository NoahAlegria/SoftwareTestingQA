

import static org.junit.Assert.*;

import org.junit.Test;

public class testTax {

	@Test
	public void WN1() {
		assertEquals(800, taxCalculation.calculateTax(30000, 2), 0.01);
	}
	
	@Test
	public void WN2() {
		assertEquals(18750, taxCalculation.calculateTax(75000, 4), 0.01);
	}
	
	@Test
	public void WN3() {
		assertEquals(90000, taxCalculation.calculateTax(250000, 1), 0.01);
	}
	

	

}
