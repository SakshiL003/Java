package com.March4;
class Employee{
	int id;
	String name;
	
	public Employee() {
		System.out.println("This is default ");
	}
		
	public Employee(int i, String n) {
		id=i;
		name=n;
		System.out.println(id+" "+name);
	}
		
	}
	

public class Constructor1 {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee(102,"John");
		

	}

}
