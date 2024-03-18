package com.Inheritance;
class Student{
	String name="Sakshi";
	String address="Thane";
	String qualification="Bsc CS";
}

class Course extends Student{
	String courseName="Java Full Stack";
	int fees=2000;
}

class Placement extends Student{
	String compName="Capgimini";
	String ctc="5 lakh";
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Course c1 = new Course();
		
		Placement p1 = new Placement();
		
		System.out.println("Student Name:"+c1.name+"\nStudent address:"+c1.address+"\nStudent qualification:"+c1.qualification+"\nCourse Name:"+c1.courseName+"\nCourse Fees:"+c1.fees+"\nCompany Name:"+p1.compName+"\nCTC:"+p1.ctc);

	}

}
