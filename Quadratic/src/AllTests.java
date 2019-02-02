import static org.junit.Assert.*;

import org.junit.Test;

public class AllTests {

	@Test
	public void P1_1()
	{
		assertEquals(0, Roots.calculate_roots(0,1,0));
	}
	
	@Test
	public void P1_2()
	{
		assertEquals(0, Roots.calculate_roots(1,1,1));
	}
	
	@Test
	public void P1_3()
	{
		assertEquals(0, Roots.calculate_roots(1,0,1));
	}
	
	@Test
	public void P1_4()
	{
		assertEquals(0, Roots.calculate_roots(-1,-1,-1));
	}
	
	@Test
	public void P1_5()
	{
		assertEquals(0, Roots.calculate_roots(0,-1,0));
	}
	
	@Test
	public void P1_6()
	{
		assertEquals(0, Roots.calculate_roots(-1,0,-1));
	}
	
	@Test
	public void P2_1()
	{
		assertEquals(1, Roots.calculate_roots(0,0,0));
	}
	
	@Test
	public void P2_2()
	{
		assertEquals(1, Roots.calculate_roots(0,0,1));
	}
	
	@Test
	public void P2_3()
	{
		assertEquals(1, Roots.calculate_roots(1,0,0));
	}
	
	@Test
	public void P2_4()
	{
		assertEquals(1, Roots.calculate_roots(1,2,1));
	}
	
	@Test
	public void P2_5()
	{
		assertEquals(1, Roots.calculate_roots(-1,0,0));
	}
	
	@Test
	public void P3_1()
	{
		assertEquals(2, Roots.calculate_roots(1,1,0));
	}
	
	@Test
	public void P3_2()
	{
		assertEquals(2, Roots.calculate_roots(1,3,1));
	}
	
	@Test
	public void P3_3()
	{
		assertEquals(2, Roots.calculate_roots(-1, -1, 0));
	}
}
