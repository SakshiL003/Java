package com.March4;
class GF{
	void show() {
		System.out.println("This is method of GF");
	}
}

class F extends GF{
	void show() {
		super.show();
		System.out.println("This is method of F");
	}
}

class M extends F{
	void show() {
		super.show();
		System.out.println("This is method of M");
	}
}

class Mm1 extends M{
	void show() {
		super.show();
		System.out.println("This is method of Mm1");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		Mm1 m=new Mm1();
		m.show();

	}

}
