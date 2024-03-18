package com.Inheritance;
class AccountHolder{
	void info(String accNo,String name) {
		System.out.println("Account Number:"+accNo+"\nName: "+name);
	}
}

class Bank extends AccountHolder{
	void getRoi(double roi) {    //roi=rate of interest
		System.out.println("Bank Interest:"+roi);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {

		//AccountHolder a1=new AccountHolder();
		//a1.info("123", "Sakshi");
		
		Bank b1=new Bank();
		b1.info("123", "Hritik");
		b1.getRoi(4.6);

	}

}
