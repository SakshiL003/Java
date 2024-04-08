package com.java8features;

public class Student {
	
	private String Sname;
	private int Sid;

	@Override
	public String toString() {
		return "StudentClassInfo [Sname=" + Sname + ", Sid=" + Sid + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, int sid) {
		super();
		Sname = sname;
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
