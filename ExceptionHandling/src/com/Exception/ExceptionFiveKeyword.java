package com.Exception;

public class ExceptionFiveKeyword {

	public static void main(String[] args) {
		
		try {
			int i=1,j=0;
			System.out.println(i/j);
		}
		catch(Exception e) {
			
			//1st method  
			//printStackTrace - trace the error
			e.printStackTrace();
			
			
			//2nd method to trace the error
			System.out.println(e.getMessage());
		}

	}

}
