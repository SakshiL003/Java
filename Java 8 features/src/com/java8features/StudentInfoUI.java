package com.java8features;

import java.util.function.BiFunction;

public class StudentInfoUI {

	public static void main(String[] args) {
		
		BiFunction<String, Integer, Student>b=Student::new;
		
		System.out.println(b.apply("Sahil", 101));
		
		

	}

}
