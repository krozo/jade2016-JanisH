package m00;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

//	@Test
//	public void testFind() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testbinarySearch1() {
		int i = 0;
		i = Search.find(5, new int[]{2,3,5,6,7,9,11,56});
		assertTrue(i == 2);
	}
	
	@Test
	public void testbinarySearch2() {
		int i = 0;
		i = Search.find(7, new int[]{2,3,5,6,7,9,11,56});
		assertTrue(i == 4);
	}
	
	@Test
	public void testbinarySearch3() {
		int i = 0;
		i = Search.find(11, new int[]{2,3,5,6,7,9,11,56});
		assertTrue(i == 6);
	}
	
	@Test
	public void testbinarySearch4() {
		int i = 0;
		i = Search.find(7, new int[]{2,3,5,6,7,9,11,56,111});
		assertTrue(i == 4);
	}
	
	@Test
	public void testbinarySearch5() {
		int i = 0;
		i = Search.find(4, new int[]{2,3,5,6,7,9,11,56,111});
		assertTrue(i == -1);
	}

}
