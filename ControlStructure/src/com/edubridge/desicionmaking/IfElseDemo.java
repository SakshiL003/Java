package com.edubridge.desicionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=18 && weight>=45)
		{
		System.out.println("Eligible to donate the blood");
		}
		else
		{
			System.out.println("Not eligible");
		}
		s.close();
	}		
}
