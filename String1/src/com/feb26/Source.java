package com.feb26;


import java.io.*; 
 import java.math.*;
 import java.security.*;
 import java.text.*;
 import java.util.*;
 import java.util.concurrent.*;
 import java.util.function.*;
import java.util.regex.*;
 import java.util.stream.*;
 import static java.util.stream.Collectors.joining;
 import static java.util.stream.Collectors.toList;
import java.util.*;
import java.io.*;


class Result {
	
	public static String string_multiply(String A, String B) {
		
int i=0,j=0;
		A=Integer.toString(i);  
	
		
		 B=Integer.toString(j);  
		//String ans=(System.out.println("Multiplication of strings:"+(i*j)));
	
		//System.out.println(s);
		return   "Multiplication of strings:"+(i*j);
		
	}
	
}
public class Source {
 public static void main(String[] args) throws IOException {
 BufferedReader bufferedReader = new BufferedReader(new
InputStreamReader(System.in));
System.out.println("Enter value for a:");
String A = bufferedReader.readLine();
System.out.println("Enter value for B:");
 String B = bufferedReader.readLine();

 String result = Result.string_multiply(A, B);

 System.out.print(result);

 bufferedReader.close(); }
 }


