import static org.junit.Assert.*;

import org.junit.Test;

public class wiperTest {

public windshieldWiper testCase;
	
	@Test
	public void testOff() {
	testCase = new windshieldWiper(0, "OFF", 1);
	try {
	testCase.senseLeverUp();
	assertEquals("INT", testCase.getLeverPosition());
	assertEquals(6, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	
	@Test
	public void testToInt() {
	testCase = new windshieldWiper(6, "INT", 1);
	try {
	System.out.println("Dial is: " + testCase.getDialPosition());
	testCase.senseDialUp();
	assertEquals(2, testCase.getDialPosition());
	assertEquals(12, testCase.getWiperSpeed());
	System.out.println("Dial is: " + testCase.getDialPosition());
	testCase.senseDialUp();
	assertEquals(3, testCase.getDialPosition());
	assertEquals(20, testCase.getWiperSpeed());
	System.out.println("Dial is: " + testCase.getDialPosition());
	}
	catch (DialErrorException e) {
		fail("DialErrorException not expected");
	}
	}
	
	@Test
	public void testToLow() {
		testCase = new windshieldWiper(6, "INT", 1);
		try {
			testCase.senseLeverUp();
			assertEquals("LOW", testCase.getLeverPosition());
			assertEquals(30, testCase.getWiperSpeed());
			} catch (LeverErrorException e) {
			fail("LeverErrorException not expected");
			}
	}
	
	@Test
	public void testToHigh() {
	testCase = new windshieldWiper(30, "LOW", 1);
	try {
	testCase.senseLeverUp();
	assertEquals("HIGH", testCase.getLeverPosition());
	assertEquals(60, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	@Test
	public void testHigh() {
		testCase = new windshieldWiper(60, "HIGH", 1);
	try {
		testCase.senseLeverUp();
		fail("Expected LeverErrorException");
		} catch (LeverErrorException e) {
		// Exception test succeeded
		}
	}
}
