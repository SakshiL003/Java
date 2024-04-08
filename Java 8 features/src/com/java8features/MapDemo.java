package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		List<String>l1=Arrays.asList("Python","Java","C++","C","Angular");
		
		List<String>l2=l1.stream().map(s->s).collect(Collectors.toList());
		System.out.println(l2);
		
		List<String>l3=l2.stream().filter(i->i.startsWith("C")).collect(Collectors.toList());
		System.out.println(l3);
		
		List<String>l4=l1                                                           .stream().sorted().collect(Collectors.toList());
		System.out.println(l4);

	}

}
