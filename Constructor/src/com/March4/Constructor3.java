package com.March4;
class Product{
	String Pname; 
	int Pprice;
	int Quantity;
	String odate;
	String rdate;
	
	Product(){
		
		System.out.println("This is Product details:");
	}
	
	Product(String n, int p){
		Pname=n;
		Pprice=p;
		System.out.println(Pname+" "+Pprice);
	}
	Product(int q, String o, String r){
		Quantity=q;
		 odate=o;
		 rdate=r;
		System.out.println(Quantity+" "+odate+" "+rdate);
	}
	
	
}
public class Constructor3 {

	public static void main(String[] args) {
		
		Product p1=new Product();
		Product p2=new Product("Lipstick" ,500);
		Product p3=new Product(2,"28/02/2024","04/03/2024");
		

	}

}
