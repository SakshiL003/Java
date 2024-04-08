package com.java8features;

interface Calci {
	public void Calci(int x);

}

class A implements Calci{

	@Override
	public void Calci(int x) {
		System.out.println(x*x);
		
	}
	
}


public class InterfaceClass {

	public static void main(String[] args) {
		
		A a1=new A();
		a1.Calci(10);


	}

}
