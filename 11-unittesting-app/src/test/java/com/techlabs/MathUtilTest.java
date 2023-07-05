package com.techlabs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.Test;

public class MathUtilTest {
	@Test
	public void testArraySort() {
		MathUtil array=new MathUtil();
		int actualarray[]= {2,3,5,4,1};
		int expectedarray[]= {1,2,3,4,5};
		
		assertArrayEquals(expectedarray, array.arraySort( actualarray), "Sorted");
		
	}
	

}
