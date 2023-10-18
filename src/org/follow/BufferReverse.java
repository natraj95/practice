package org.follow;

public class BufferReverse {
	
		 
	    public static void main (String args[]) {
	    	String name = "GeeksforGeeks!";
	    	
	        StringBuffer sbf = new StringBuffer(name);
	        System.out.println("String buffer befr reverse = " + sbf);
	         
	        // Here it reverses the string buffer
	        sbf.reverse();
	        System.out.println("String buffer after reversing = " + sbf);
	    	
//	    	
//	    	StringBuilder s  = new StringBuilder (name);
//	    	String rev = s.reverse();
	    	
	    	
	    	
	    }
	}


