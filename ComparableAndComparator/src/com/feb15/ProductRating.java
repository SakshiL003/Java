package com.feb15;

import java.util.Comparator;

public class ProductRating implements Comparator<Product>{

	public static void main(String[] args) {
		
	

	}

	@Override
	public int compare(Product o1, Product o2) {
		if (o1.getRating()<o2.getRating()) {
			return -1;
			
		}
		
		else if(o1.getRating()>o2.getRating()) {
			return 1;
			
			
		}
		
		else {
			return 0;
		}
	}
}


