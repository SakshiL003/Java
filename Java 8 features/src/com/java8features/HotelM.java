package com.java8features;

import java.util.ArrayList;
import java.util.List;

class menu{
	private int price;
	private String menuItem;
	
	public menu(int price, String menuItem) {
		super();
		this.price = price;
		this.menuItem = menuItem;
	}
	

public Integer getprice() {
	// TODO Auto-generated method stub
	return price;
}
	
class M{
	
	static int comparemenubyprize(menu m1, menu m2) {
		return m1.getprice().compareTo(m2.getprice());
		
	}
}

	
}
public class HotelM {

	public static void main(String[] args) {
		
		List<menu>m=new ArrayList<>();
		m.add(new menu(200,"veg cutlet"));
		m.add(new menu(200,"veg pulav"));
		m.add(new menu(200,"veg soup"));
		
		
	}

}
