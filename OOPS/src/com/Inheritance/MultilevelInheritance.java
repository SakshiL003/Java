package com.Inheritance;
class Vehical{
	double speed(double s) {
		return s;
	}
}

class Car extends Vehical{
	String showColour(String color) {
		return color;
	}
}

class Bike extends Car{
	int showPrice(int price) {
		return price;
	}
}

class Bycycle extends Bike{
	int showYearModel(int year) {
		return year;
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Bycycle b1=new Bycycle();
			System.out.println("The speed of vehical:"+b1.speed(9.85));
			System.out.println("The Color of Car:"+b1.showColour("Black"));
			System.out.println("The Price of Price:"+b1.showPrice(60000));
			System.out.println("The Year of Bycycle:"+b1.showYearModel(2024));
			
		

	}

}
