package com.collection;

import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {
		
		LinkedList<String>l1=new LinkedList<String>();
		
		l1.add("Ramesh");
		l1.add("Suresh");
		l1.add("Ramesh");
		l1.add("Ajay");
		l1.add("Amith");
		
		System.out.println(l1);
		//by default first index is delete 
		l1.remove();
		System.out.println(l1);
		
		l1.removeLast();
		System.out.println(l1);
		
		l1.removeFirst();
		System.out.println(l1);
		
		l1.add("Ramesh");
		l1.add("Ajay");
		System.out.println(l1);
		
		l1.removeFirstOccurrence("Ramesh");
		System.out.println(l1);
		
		l1.remove(1);
		System.out.println(l1);
		
		l1.clear();
		System.out.println(l1);
		

	}

}
