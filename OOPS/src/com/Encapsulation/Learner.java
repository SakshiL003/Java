package com.Encapsulation;

public class Learner {

	public static void main(String[] args) {
		
		Info i1=new Info();
		i1.setName("Sakshi");
		i1.setAddress("Thane");
		i1.setContact(786574837);
		i1.setEmail("s@gmail.com");
		
		System.out.println("Learner Name:"+i1.getName()+"\nLearner Address:"+i1.getAddress()+"\nLearner Contact:"+i1.getContact()+"\nLearner Email Id:"+i1.getEmail());

	}

}
