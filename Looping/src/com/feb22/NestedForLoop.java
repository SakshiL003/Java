package com.feb22;

public class NestedForLoop {

	public static void main(String[] args) {
		
		int row=10;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				//System.out.print("i");
				//System.out.print("j");
			}
			System.out.println();
		}

	}

}
