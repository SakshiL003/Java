package com.feb22;

import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Management System");
		int choice=0;
		do {
			
			System.out.println("1.Employee Has to Enter Name");
			System.out.println("2.Employee Has to Enter Designation");
			System.out.println("3.Employee Has to Enter Specialiazation");
			System.out.println("4.Exit");
			Scanner s=new Scanner(System.in);
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter name:");
				String name=s.next();
				System.out.println("Employee name"+name);
				break;
			case 2:
				System.out.println("Enter Designation:");
				String Designation=s.next();
				System.out.println("Employee Designation"+Designation);
				break;
			case 3:
				System.out.println("Enter Specialiazation:");
				String Specialiazation=s.next();
				System.out.println("Employee Specialiazation"+Specialiazation);
				break;
			case 4:
				
				System.out.println("Exit");
				break;
			default:
				System.out.println("Wrong Input");
				break;
			
			}
			
		}while(choice!=4);

	}

}
