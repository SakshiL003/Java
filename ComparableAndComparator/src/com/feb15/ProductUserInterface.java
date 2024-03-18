package com.feb15;

import java.util.ArrayList;
import java.util.Collections;

public class ProductUserInterface {

	public static void main(String[] args) {
		
		ArrayList<Product>list=new ArrayList<Product>();
		//c Movie(double rating, String name, int year);
		
		list.add(new Product(1, "Speaker", 3.2));
		list.add(new Movie(11, "iphone", 5.2));
		list.add(new Movie(6, "apple", 5.6));
		list.add(new Movie(7, "vivo", 2.4));
		
		ProductName pn=new ProductName();
		Collections.sort(list);
		System.out.println("Data after sorting");
		
		//for(typeofvariable variable:object name)
		for(Movie movie:list) {
			System.out.println(movie.getRating()+" "+movie.getName()+" "+movie.getYear());
		}

	}

}
