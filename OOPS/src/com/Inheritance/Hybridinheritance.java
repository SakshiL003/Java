package com.Inheritance;
class Animal{
	void eat() {
		System.out.println("Animal Class");
	}
}
class Dog extends Animal{
	String color="Brown";
	void dispColor() {
		System.out.println("Dog Color:"+color);
	}
}
class Cat extends Animal{
	void bark() {
		System.out.println("Cat is barking");
	}
}
class BabyDog extends Dog{
	String age="2 Months";
	void dispAge() {
		System.out.println("The age of baby dog is:"+age);
	}
}
public class Hybridinheritance {

	public static void main(String[] args) {
		
		Cat c1=new Cat();
		c1.bark();
		c1.eat();
		BabyDog b1=new BabyDog();
		b1.dispAge();
		b1.dispColor();

	}

}
