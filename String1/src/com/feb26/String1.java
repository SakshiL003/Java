package com.feb26;
import java.util.Scanner;
public class String1 {

	public static void main(java.lang.String[] args) {
		
		String name="jhon";
		System.out.println(name);
		
		//By Object
		String s=new String("Good Morning");
		System.out.println(s);
		
		//By Variable
		char ch[]= {'M','U','M','B','A','I'};
		//Convert character into string
		String s1=new String(ch);
		System.out.println(s1);
		System.out.println("Size of String:"+s1.length());
		String fname="Sakshi";
		
		String lname="Lokhande";
		System.out.println(fname+lname);
		//equals method
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter UserName:");
		String uname=sc.next();
		
		System.out.println("Enter Password:");
		String ps=sc.next();
		
		
		

	}

}
