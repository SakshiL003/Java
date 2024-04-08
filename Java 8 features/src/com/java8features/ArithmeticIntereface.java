package com.java8features;
@FunctionalInterface
interface Maths{
	public void show(int a, int b);
}

public class ArithmeticIntereface {
	
	public static void main(String[]args) {
		
		Maths m1=(int i, int j)->System.out.println("Addition is: "+i+j);
		Maths m2=(int i, int j)->System.out.println("Substraction is: "+(i-j));
		Maths m3=(int i, int j)->System.out.println("Multification is: "+i*j);
		Maths m4=(int i, int j)->System.out.println("Division is: "+i/j);
		
		m1.show(10, 50);
		m2.show(49, 3);
		m3.show(334, 2);
		m4.show(10, 5);
		
	}

}
