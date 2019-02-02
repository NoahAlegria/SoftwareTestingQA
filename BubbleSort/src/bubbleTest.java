import static org.junit.Assert.*;

import org.junit.Test;

public class bubbleTest {

	@Test
	public void test1() {
		int a[] = {0};
		int correctArray[] = {0};
		modBubbleSort.bubbleSortEfficient(a,1);
		assertArrayEquals(correctArray, a);
	}
	
	@Test
	public void test2() {
		int a[] = {1,2,3};
		int correctArray[] = {1,2,3};
		modBubbleSort.bubbleSortEfficient(a, 3);
		assertArrayEquals(correctArray,a);
	}
	
	@Test
	public void test3() {
		int a[] = {9,8,7};
		int correctArray[] = {7,8,9};
		modBubbleSort.bubbleSortEfficient(a, 3);
		assertArrayEquals(correctArray,a);
	}

}
