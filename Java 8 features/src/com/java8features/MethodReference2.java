package com.java8features;

interface add{
	void a();
}

class add2{
	public void b() {
		System.out.println("This is b method");
	}
}

public class MethodReference2 {

	public static void main(String[] args) {
		
		add2 a1=new add2();
		//for call instance method= containingobject::instance method
		add aa=a1::b;
		aa.a();
		

	}

}
