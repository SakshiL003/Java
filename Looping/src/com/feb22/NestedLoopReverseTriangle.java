package com.feb22;

import java.util.Scanner;

public class NestedLoopReverseTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows:");
		int row=sc.nextInt();
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
