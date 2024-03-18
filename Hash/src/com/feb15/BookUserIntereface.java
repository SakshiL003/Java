package com.feb15;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class BookUserIntereface {

	public static void main(String[] args) {
		
		Hashtable<Integer,BookData>ht=new Hashtable<Integer,BookData>();
		
		BookData b1=new BookData(1, "c++", "bajarne strousstrup", 500);
		BookData b2=new BookData(2, "c", "Dennis ritchie", 600);
		BookData b3=new BookData(4, "java", "james goslin", 800);
		BookData b4=new BookData(3, "spring", "rod jhonson", 500);
		
		ht.put(1, b1);
		ht.put(2, b2);
		ht.put(3, b3);
		ht.put(4, b4);
		
		for(Map.Entry<Integer, BookData>Book:ht.entrySet());
		
		int key=BookData.getKey();
		

	}

	private static Entry<Integer, BookData>[] entryset() {
		// TODO Auto-generated method stub
		return null;
	}

}
