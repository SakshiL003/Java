package com.edubridge.desicionmaking;

import java.util.Scanner;

public class StudentClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int studentId=s.nextInt();
		System.out.println("Enter Student Id:");
		
		String studentName=s.next();
		System.out.println("Enter Student Name:");
		
		int M1=s.nextInt();
		System.out.println("Enter Student Marks for M1:");
		
		int M2=s.nextInt();
		System.out.println("Enter Student Marks for M2:");
		
		int M3=s.nextInt();
		System.out.println("Enter Student Marks for M3:");
		
		int total=s.nextInt();
		total=M1+M2+M3;
		System.out.println("total:");
		
		
		double avg=total/3;
		System.out.println("avg:");
		
		System.out.println("Student Id:"+studentId+"\nStudent Name:"+studentName+"M1:"+M1+"M2:"+M2+"M3"+M3);
		
		if(avg>=90) {
			System.out.println("A Grade");
		}
		
		else if(avg>75 && avg<90) {
			System.out.println("B Grade");
		}
		
		else if(avg>55 && avg<75){
			System.out.println("C Grade");
		}
		
		else if(avg>35 && avg<55){
			System.out.println("C Grade");
		}
		
		else {
			System.out.println("Fail");
		}
			

	}

}
