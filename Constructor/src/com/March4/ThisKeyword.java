package com.March4;
class User{
	String uname;
	String password;
	public User(String uname, String password) {
		this.uname=uname;
		this.password=password;
	}
	void show() {
		System.out.println(uname+" "+password);
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		
		User u1=new User("Sakshi","Sakshi123");
		u1.show();
		

	}

}
