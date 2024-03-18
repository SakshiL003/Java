package com.collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String>l1=new LinkedList<String>();	
		l1.add("Hritik");
		l1.add("Sakshi");
		l1.add("Roshani");
		l1.add("Nitika");
		System.out.println(l1);
		
		
		
		LinkedList<String>l2=new LinkedList<String>();	
		l1.add("Amisha");
		l1.add("Amit");
		l1.add("Anit");
		l1.addAll(l2);
		System.out.println(l1);
		
		
		
		l1.addFirst("Sakshi");
		System.out.println(l1);
		
		l1.addLast("Ketki");
		System.out.println(l1);
		
		l1.add(7, "Sumit");
		System.out.println(l1);
		
		l1.set(6, "Rutuja");
		System.out.println(l1);
	
	}

}
