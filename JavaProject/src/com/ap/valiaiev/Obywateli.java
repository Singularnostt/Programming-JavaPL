package com.ap.valiaiev;

public class Obywateli {

	public StringBuffer symbols(StringBuffer a) {
		
		StringBuffer stringbuffer = new StringBuffer( a);
		
		
		int  n=a.length();
	    
	    for(int i=0; i<n; i++ ){
	    	
	        if(stringbuffer.charAt(i)=='h') {
	        	
				stringbuffer.deleteCharAt(i);
				n--;
				
	    }
	
		}
	    System.out.println(stringbuffer);

		return null;
	}
}

// if(stringbuffer.) 