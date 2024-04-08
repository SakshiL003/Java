package com.java8features;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerAndBiconsumer {

	public static void main(String[] args) {
		
		Consumer<String>c=x->System.out.println(x);
		c.accept("Hello");
		
		
		
		BiConsumer<String,Integer>s=(i,j)->System.out.println("First name"+i+"/nLast name"+j);
		s.accept("Jhon", 24);
		
	

	}

}
