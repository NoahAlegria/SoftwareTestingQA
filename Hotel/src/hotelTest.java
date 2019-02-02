import static org.junit.Assert.*;

import org.junit.Test;

public class hotelTest {

	@Test
	public void test1() {
		int[] a = {1,1,1,0,1,1,1};
		//assertEquals(6, hotelOccupancy.calcRate(a));
		assertEquals(5.0, hotelOccupancy.calcRate(a), .001);
	}
	
	@Test
	public void test2() {
		int[] a = {-1,1,1,1,1,1,1,1};
		//Test case to simulate a "repeated" while loop case as invalid input
		assertEquals(5.0, hotelOccupancy.calcRate(a), .001);
	}
	
	@Test 
	public void test3() {
		int[] a = {0,0,0,0,0,0,0};
		assertEquals(0.0, hotelOccupancy.calcRate(a), .001);
	}
}
