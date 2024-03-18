package com.Abstraction;
abstract class Bag{
	String type="fastrack";
	abstract void show();
	
	void color(String c) {
		System.out.println("The color of bag:"+c);
	}
}
class BagInfo extends Bag{
	void show() {
		System.out.println("This is abstract method which override from By   ag class");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		
		BagInfo b1=new BagInfo();
		

	}

}
