package com.feb15;

public class Product {
	
	public Product(int pid, String pname, double rating) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.rating = rating;
	}


	private int pid;
	private String pname;
	private double rating;
	

	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
