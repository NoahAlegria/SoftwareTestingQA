import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void WN1() {
		assertEquals("Equilateral", Triangle.Triangle_Test(5, 5, 5));
	}
}
