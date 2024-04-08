package com.java8features;

import java.util.function.BiFunction;

class ArithmaticOp{
	static int add(int i, int j) {
		return i+j;
	}
}

public class BiFunction1{

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer>b1=ArithmaticOp::add;
		
		int x=b1.apply(12, 10);
		System.out.println(x);
		

	}

}
