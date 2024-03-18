package com.Exception;

public class NullHandleException {

	public static void main(String[] args) {
		
		try {
			String s=null;
			
			System.out.println(s.length());
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	}

}
