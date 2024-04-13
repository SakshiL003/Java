package com.feb22;

import java.util.Scanner;

public class WhileLoopPr3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to oddsum");
		System.out.print("Plese enter the number: ");
		int num=input.nextInt();
		int sum=oddSum(num);
		System.out.println("Oddsum till" + num + "is: " + sum);
	}
	
		public static int oddSum (int num ) {
			int sum=0;
			int i=1;
			while(i<=num) {
				sum+=1;
				i+=2;
			}
				return sum;
			}
		}


