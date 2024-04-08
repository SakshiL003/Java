package com.java8features;

import java.util.function.BiFunction;

class op{
	public int add(int a1, int b1) {
		return a1+b1;
		}
	public int sub(int a1, int b1) {
		return a1-b1;
		}
	public int mul(int a1, int b1) {
		return a1*b1;
		}
	public int div(int a1, int b1) {
		return a1/b1;
		}
}

public class MethodReferencePractice {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer>bb=new op()::add;
		int result=bb.apply(10, 20);
		System.out.println("Addition:"+result);
		
		BiFunction<Integer, Integer, Integer>bb1=new op()::add;
		int result1=bb.apply(50, 20);
		System.out.println("Substraction:"+result1);
		
		BiFunction<Integer, Integer, Integer>bb2=new op()::add;
		int result2=bb.apply(5667, 20);
		System.out.println("Multiplication:"+result2);
		
		BiFunction<Integer, Integer, Integer>bb3=new op()::add;
		int result3=bb.apply(898908, 20);
		System.out.println("Division:"+result3);
		
		
		

	}

}
