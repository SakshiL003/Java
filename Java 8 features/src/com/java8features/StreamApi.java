package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		
	/*	// 1st way
		ArrayList<Integer>l1=new ArrayList<Integer>();
		l1.add(10);  */ 
		
		// 2nd way
		
		List<Integer>l2=Arrays.asList(10,20,30,40,50,67,59);
		System.out.println(l2);
		
		List<Integer>l3=l2.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(l3);
		
		List<Integer>l4=l2.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(l4);
	

	}

}
