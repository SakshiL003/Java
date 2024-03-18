package com.Exception;

import java.util.Scanner;

public class Voting1 {
	void show() throws Voting {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		
		int age=sc.nextInt();
		
		if(age<18) {
			throw new Voting("not eligible for voting");
		}
		else {
			System.out.println("Eligible for voting");
		}
	}
	public static void main(String[] args) {
		
		Voting1 v1=new Voting1();
		
		try {
			v1.show();
		}
		catch(Voting e) {
			e.printStackTrace();
		}

	}

}
