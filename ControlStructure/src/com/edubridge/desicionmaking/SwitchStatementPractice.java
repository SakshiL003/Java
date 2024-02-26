             package com.edubridge.desicionmaking;

import java.util.Scanner;

public class SwitchStatementPractice {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter choice");		
		int choice=s.nextInt();
		
		System.out.println("Ente value for i");		
		int i=s.nextInt();
		
		System.out.println("Ente value for j");		
		int j=s.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Addition is:"+i+j);
			break;
		case 2:
			System.out.println(i-j);
			break;
		case 3:
			System.out.println(i*j);
			break;
		case 4:
			System.out.println(i/j);
			break;
		case 5:
			System.out.println(i%j);
			break;
		
		default:
			System.out.println("Wrong choice");
		}

	}

}
