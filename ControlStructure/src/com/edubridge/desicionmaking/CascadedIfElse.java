package com.edubridge.desicionmaking;

import java.util.Scanner;

public class CascadedIfElse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if(x>y && x>z)
			System.out.println("x is larger"+x);
		else if(y>x && x>z) 
			System.out.println("y is larger"+y);
		else
			System.out.println("z is larger"+z);

	}

}
