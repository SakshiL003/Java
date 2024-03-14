package com.Thread;

public class ThreadExecution extends Thread{
	
	public void run() {
		System.out.println("This is thread class run method");
	}
	
	public void disp() {
		System.out.println("This is disp method");
	}

	public static void main(String[] args) {

		ThreadExecution t=new ThreadExecution();
		
		t.run();
		t.start();

	}

}
