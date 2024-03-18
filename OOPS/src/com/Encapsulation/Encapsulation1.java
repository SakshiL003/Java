package com.Encapsulation;
class Product{
	private int pId;
	private String pName;
	private int pPrice;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	
}
public class Encapsulation1 {

	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.setpId(101);
		p1.setpName("Sneakers");
		p1.setpPrice(1000);
		
		System.out.println(p1.getpId()+ " "+p1.getpName()+" "+p1.getpPrice());
		
		

	}

}
