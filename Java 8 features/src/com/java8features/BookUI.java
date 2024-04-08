package com.java8features;

import java.util.ArrayList;

public class BookUI {

	public static void main(String[] args) {
		
		ArrayList<Book>a1=new ArrayList<Book>();
		
		Book b1=new Book(1, "c", "Dennis", 200);
		Book b2=new Book(2, "c#", "Microsoft", 200);
		Book b3=new Book(3, "java", "Goslin", 200);
		Book b4=new Book(4, "python", "pp", 200);
		Book b5=new Book(5, "react", "Facebook", 200);
		
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		a1.add(b5);
		
		a1.forEach(i->{System.out.println(i);});

	}

}
