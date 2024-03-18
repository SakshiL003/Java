package com.feb15;

import java.util.ArrayList;
import java.util.Collections;

public class MovieUserInterface {

	public static void main(String[] args) {
		
		ArrayList<Movie>list=new ArrayList<Movie>();
		//c Movie(double rating, String name, int year);
		
		list.add(new Movie(8.3, "Conjuring", 2015));
		list.add(new Movie(9.3, "1920", 2000));
		list.add(new Movie(7.2, "1921", 2016));
		list.add(new Movie(4.2, "Hunterr", 2010));
		list.add(new Movie(2.1, "Evil Dead", 2022));
		
		Collections.sort(list);
		System.out.println("Data after sorting");
		
		//for(typeofvariable variable:object name)
		for(Movie movie:list) {
			System.out.println(movie.getRating()+" "+movie.getName()+" "+movie.getYear());
		}

	}

}
