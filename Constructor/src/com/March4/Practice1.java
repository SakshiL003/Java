package com.March4;
class Course{
	int Cid;
	String Cname;
	int Cprice;
	String Cduration;
	
	public Course(){
		System.out.println("This is default Course Constructor");		
	}
	
	public Course(int Cid, String Cname, int Cprice, String Cduration){
		this.Cid=Cid;
		this.Cname=Cname;
		this.Cprice=Cprice;
		this.Cduration=Cduration;
		System.out.println(Cid+" "+Cname+" "+Cprice+" "+Cduration );
	}
}
public class Practice1 {

	public static void main(String[] args) {
		
		Course c1=new Course();
		Course c2=new Course(12, "Sanika", 2000, "4 Months");

	}

}
