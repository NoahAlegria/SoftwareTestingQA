import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class useCaseTest {
	private static windshieldWiper testCase;
	
	@BeforeClass
	public static void setUp() {
		testCase = new windshieldWiper(0,"OFF",1);
	}
	
	@Test
	public void testInt() {
		try {
			testCase.senseLeverUp();
			assertEquals("INT", testCase.getLeverPosition());
			assertEquals(6, testCase.getWiperSpeed());
			} catch (LeverErrorException e) {
			fail("LeverErrorException not expected");
				}
	}
	
	@Test
	public void testIncrement1() {
		try {
			testCase = new windshieldWiper(6,"INT",1);
			testCase.senseDialUp();
			assertEquals(2, testCase.getDialPosition());
			assertEquals(12,testCase.getWiperSpeed());
			testCase.senseDialUp();
			assertEquals(3, testCase.getDialPosition());
			assertEquals(20, testCase.getWiperSpeed());
		}
		catch(DialErrorException e) {
			fail("DialErrorException not expected");
		}
	}
	
	@Test
	public void testIntToLow() {
		try {
			testCase = new windshieldWiper(20,"INT",3);
			testCase.senseLeverUp();
			assertEquals("LOW", testCase.getLeverPosition());
			assertEquals(30, testCase.getWiperSpeed());
			} catch (LeverErrorException e) {
			fail("LeverErrorException not expected");
			}
		}
	
	@Test
	public void testLowToInt() {
		try {
			testCase = new windshieldWiper(30,"LOW",3);
			testCase.senseLeverDown();
			assertEquals("INT", testCase.getLeverPosition());
			assertEquals(20, testCase.getWiperSpeed());
			} catch (LeverErrorException e) {
			fail("LeverErrorException not expected");
			}
	}
	
	@Test
	public void testIntToOff() {
		try {
			testCase = new windshieldWiper(20,"INT",3);
			testCase.senseLeverDown();
			assertEquals("OFF", testCase.getLeverPosition());
			assertEquals(0, testCase.getWiperSpeed());
			} catch (LeverErrorException e) {
			fail("LeverErrorException not expected");
			}
	}
	
}
	

