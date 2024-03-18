package com.feb22;

import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Student Management System");
		int choice=0;
		do {
			System.out.println("1.Student Has to Enter Information");
			System.out.println("2.Student Has to Enter Course Rating");
			System.out.println("3.Student Has to Enter Placement Crieteria");
			System.out.println("4.Exit");
			System.out.println("Enter Choice:");
			Scanner s=new Scanner(System.in);
			choice=s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter name:");
				String name=s.next();
					
				System.out.println("Enter Age:");
				String Age=s.next();
				
				System.out.println("Enter Address:");
				String Address=s.next();
				
				System.out.println("Student name"+name+"Student Age"+Age+"Student Address"+Address);
				break;
				
			case 2:
				System.out.println("Enter Your Course Rating");
				double rating=s.nextDouble();
				if(rating>=4.5) {
					System.out.println("Good");
				}
				
				else {
					System.out.println("Need to Improve");
				}
				break;
				
			case 3:
				System.out.println("Enter Student Attendance");
				int attendance=s.nextInt();
				if(attendance>=50) {
					System.out.println("Eligible for Placements");
				}
				break;
				
			case 4:
				System.out.println("Thanks for Rating Us...");
				break;
				
			default:
				System.out.println("Wrong Input");
				break;
		}

	}while(choice!=4);
	}

}
