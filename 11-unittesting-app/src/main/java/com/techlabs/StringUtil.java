package com.techlabs;

public class StringUtil {
	
	    public String truncateAInFirstTwoPlaces(String string) {
	        if (string.startsWith("aa")) {
	            return string.substring(2);
	        } else {
	            return string;
	        }
	    }
	}


	
	


