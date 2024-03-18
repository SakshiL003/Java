package com.Polymorphism;
class Basic{
	void disp() {
		System.out.println("This is disp method for Basic");
	}
}
class ClassA extends Basic{
	void disp() {
		System.out.println("This is disp method for class A");
	}
}
class ClassB extends Basic{
	void disp() {
		System.out.println("This is disp method for class B");
	}
}
public class DynamicDispatchMethod {

	public static void main(String[] args) {
		
		Basic b1,b2;
		b1=new ClassA();
		b2=new ClassB();
		
		b1.disp();
		b2.disp();
		

	}

}
