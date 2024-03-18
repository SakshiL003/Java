package com.Exception;

public class finallyException {

	public static void main(String[] args) {
		
		try {
			String s="welcom";
			System.out.println(s.lastIndexOf('e'));
			
			int a[]=new int[5];
			System.out.println(a[7]);
			
			int a1=10,b=2;
			System.out.println(a1/b);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		finally {
			String email="sk@gmail.com";
			System.out.println(email);
		}
	}

}
