package com.java8features;

import java.util.function.Function;

interface info{
	CourseInfo get(String info);
}

class CourseInfo{
	CourseInfo(String info){
		System.out.println(info);
	}
}

class Company{
	Company(String name){
		System.out.println("Company Name:"+name);
	}
}

public class MethodReference3 {

	public static void main(String[] args) {
		
		info f=CourseInfo::new;
		f.get("Java Full Stack");
		
		Function<String,Company>bb=Company::new;
		bb.apply("Capgemini");
		

	}

}
