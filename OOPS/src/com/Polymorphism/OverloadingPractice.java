package com.Polymorphism;
class ATMCard{
	void transactionHistory(int deposit) {
		System.out.println("Deposited rs:"+deposit);
	}
	void transactionHistory(long withdraw) {
		System.out.println("withdraw amont is:"+withdraw);
}
}
public class OverloadingPractice {

	public static void main(String[] args) {
		
		
		ATMCard a1=new ATMCard();
		a1.transactionHistory(3200);
		a1.transactionHistory(320000);

	}

}
