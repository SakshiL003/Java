package com.Polymorphism;
class Vehicle{
	void speed(int s) {
		System.out.println("The speed of Vehicle is:"+s);
	}	
}
class Car extends Vehicle{
	void speed(int s) {
		System.out.println("The speed of Car is:"+s);
	}	
}
class Bus extends Vehicle{
	void speed(int s) {
		System.out.println("The speed of Bus is:"+s);
	}	
}
class Bycycle extends Vehicle{
	void speed(int s) {
		System.out.println("The speed of Bycycle is:"+s);
	}	
}
public class OverridingPractice {

	public static void main(String[] args) {
		
		Vehicle v1,v2,v3,v4;
		v1=new Car();
		v2=new Bus();
		v3=new Bycycle();
		
		v1.speed(80);
		v2.speed(70);
		v3.speed(50);
		
	}

}
