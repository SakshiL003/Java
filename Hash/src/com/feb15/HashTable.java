package com.feb15;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		
		ht.put(23, "Aniket");
		ht.put(23, "Amit");
		ht.put(23, "Ayush");
		ht.put(23, "Arnav");
		
		System.out.println(ht);
		
		//Advance for loop:-   for(variableType variableName:objectName
		//Normal for loop:-    for(inialiazation;condition;operator
		
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
