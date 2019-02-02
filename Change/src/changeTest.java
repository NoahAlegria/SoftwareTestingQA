import static org.junit.Assert.*;

import org.junit.Test;

public class changeTest {
	
	int [] a = {0,0,0,0,0};
	@Test
	public void test1() {
		assertArrayEquals(a, changeClass.changeCalc(45.85, 45.85));
	}
	
	int [] b ={ 14, 0, 1, 1, 0 };
	
	@Test
	public void test2() {
		assertArrayEquals(b, changeClass.changeCalc(60.0, 45.85));
	}
}
