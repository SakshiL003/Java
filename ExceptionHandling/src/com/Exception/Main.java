package com.Exception;

import java.util.Scanner;

public class Main{
	
	void pn() throws PositiveException, NegativeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int i=sc.nextInt();
		
		if(i>0) {
			throw new PositiveException("No is greater than 0");
		}
		else if(i<0) {
			throw new NegativeException("No is smaller than 0");
		}
		else {
			System.out.println("no is zero");
		}
	}
	public static void main(String[] args) {
		
		Main m1=new Main();
		
		try {
			m1.pn();
			
		}
		catch(PositiveException e) {
			
			e.printStackTrace();
			
		}
		
		catch(NegativeException e) {
			e.printStackTrace();
		}
		
	}

}
