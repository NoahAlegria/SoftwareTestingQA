package inClassAct;

import static org.junit.Assert.*;

import org.junit.Test;

public class inClassActTest {

	@Test
	public void path1() {
		assertEquals(true, classCode.IsValidMod10Number(""));
	}
	
	@Test
	public void path2() {
		assertEquals(false, classCode.IsValidMod10Number("1"));
	}
	//THIS STEP FAILS EVEN THOUGH IT SHOULD NOT. THIS IS THE BUG IN PROGRAM
	@Test
	public void path3() {
		assertEquals(true, classCode.IsValidMod10Number("75"));
	}
	//TRY UNCOMMENTING MY FIXED CODE TO MAKE THESE PASS, USED TO DEMONSTRATE INCORRECT CODE
	@Test
	public void path4() {
		assertEquals(true, classCode.IsValidMod10Number("26"));
	}

}
