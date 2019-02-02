import static org.junit.Assert.*;

import org.junit.Test;

public class bvNormal {

	@Test
	public void BV1() {
		assertEquals("Isosceles", Triangle.Triangle_Test(100, 100, 1));
	}
	
	@Test
	public void BV2() {
		assertEquals("Isosceles", Triangle.Triangle_Test(100, 100, 2));
	}
	
	@Test
	public void BV3() {
		assertEquals("Equilateral", Triangle.Triangle_Test(100, 100, 100));
	}
	
	@Test
	public void BV4() {
		assertEquals("Isosceles", Triangle.Triangle_Test(100, 100, 199));
	}
	
	@Test
	public void BV5() {
		assertEquals("Not a Triangle", Triangle.Triangle_Test(100, 100, 200));
	}
	
	@Test
	public void BV6() {
		assertEquals("Isosceles", Triangle.Triangle_Test(100, 1, 100));
	}
	
	@Test
	public void BV7() {
		assertEquals("Isosceles", Triangle.Triangle_Test(100, 2, 100));
	}
	
	
	@Test
	public void BV8() {
		assertEquals("Equilateral", Triangle.Triangle_Test(100, 100, 100));
	}
	
	@Test
	public void BV9() {
		assertEquals("Isosceles", Triangle.Triangle_Test(100, 199, 100));
	}
	

	@Test
	public void BV10() {
		assertEquals("Not a Triangle", Triangle.Triangle_Test(100, 200, 100));
	}
	
	
	@Test
	public void BV11() {
		assertEquals("Isosceles", Triangle.Triangle_Test(1, 100, 100));
	}
	
	@Test
	public void BV12() {
		assertEquals("Isosceles", Triangle.Triangle_Test(2, 100, 100));
	}
	
	
	@Test
	public void BV13() {
		assertEquals("Equilateral", Triangle.Triangle_Test(100, 100, 100));
	}
	
	@Test
	public void BV14() {
		assertEquals("Isosceles", Triangle.Triangle_Test(199, 100, 100));
	}
	
	@Test
	public void BV15() {
		assertEquals("Isosceles", Triangle.Triangle_Test(200, 100, 100));
	}
	
	

}
