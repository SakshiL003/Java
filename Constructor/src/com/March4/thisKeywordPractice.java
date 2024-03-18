package com.March4;
class A{
	void show() {
	System.out.println("This is show method");	
	}
	void disp() {
	 this.disp();
	  System.out.println("This is disp method");
	}
}
public class thisKeywordPractice {

	public static void main(String[] args) {
		
		A a1=new A();
		
		//a1.show();
		a1.disp();

	}

}
