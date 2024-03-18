package com.collection;

public class LinkedListEmployee {
	private int empId;
	private String empName;
	private int empAge;
	private int empSalary;
	            
	
	//Generate this all method from source
	
	//This is toString method from source
	@Override
	public String toString() {
		return "EmployeeData [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary="
				+ empSalary + "]";
	}



	public LinkedListEmployee(int empId, String empName, int empAge, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}


//constructor from superclass
	public LinkedListEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}


//THis is Getters Setters method generate from source
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	public int getEmpSalary() {
		return empSalary;
	}



	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}



	public static void main(String[] args) {
		
		
		
	
	

	}

}
