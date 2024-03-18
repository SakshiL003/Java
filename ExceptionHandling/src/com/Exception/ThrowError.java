package com.Exception;
class Throw{
	public static int didvidenumber(int m, int n) throws ArithmeticException{
		int div=m/n;
		return div;
		
	}
	
}
public class ThrowError {

	public static void main(String[] args) {
		
		Throw t=new Throw();
		
		try {
			System.out.println(Throw.didvidenumber(10, 0));
		}
		catch(Exception e) {
			System.out.println(e.getMessage() );
		}

	}

}
