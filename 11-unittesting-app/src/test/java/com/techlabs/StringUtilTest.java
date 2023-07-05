package com.techlabs;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class StringUtilTest {
	

	
	    @Test
	    public void testTruncate() {
	        StringUtil stringUtil = new StringUtil();

	        String actual = "aabbcc";
	        String expected = "bbcc";
	      

	        assertEquals(expected, stringUtil.truncateAInFirstTwoPlaces(actual), "Truncated string does not match expected value");
	    }
	}



