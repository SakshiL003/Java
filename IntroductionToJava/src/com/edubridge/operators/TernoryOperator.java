package com.edubridge.operators;

import java.util.Scanner;

public class TernoryOperator {

	//To check the number is even or odd
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String res=(num%2==0)?"Even":"Odd";
		System.out.println(res);
	}

}
