package com.feb22;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Management System");
		int choice=0;
		do {
			System.out.println("1.Employee Has to Enter Id");
			System.out.println("2.Employee Has to Enter Name");
			System.out.println("3.Employee Has to Enter Address");
			System.out.println("4.Employee Has to Enter Designation");
			System.out.println("5.Employee Has to Enter Salary");
			System.out.println("6.Exit");
			Scanner s=new Scanner(System.in);
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Id:");
				int id=s.nextInt();
				System.out.println("employee Id"+id);
				break;
			case 2:
				System.out.println("Enter name:");
				String name=s.next();
				System.out.println("employee name"+name);
				break;
			case 3:
				System.out.println("Enter Address:");
				String Address=s.next();
				System.out.println("employee Address"+Address);
				break;
			case 4:
				System.out.println("Enter Designation:");
				String Designation=s.next();
				System.out.println("employee Designation"+Designation);
				break;
			case 5:
				System.out.println("Enter Salary:");
				String Salary=s.next();
				System.out.println("employee Salary"+Salary);
				break;
			case 6:
				System.out.println("Exit");
				break;
			
			}

	}

}
