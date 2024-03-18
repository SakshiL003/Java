package com.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//THe integer class wraps
public class Arraylist1 {

	public static void main(String[] args) {
		
		List<Integer>l1=new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		System.out.println(l1);
		
		//get method used to display value from index number 4
		System.out.println(l1.get(4));
		
		//index method gives the index for perticular value
		System.out.println(l1.indexOf(40));
		
		Collections.sort(l1);
		System.out.println(l1);
		

	}

}
