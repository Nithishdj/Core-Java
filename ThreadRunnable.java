package com.index;
class Book implements Runnable{
	@Override
	public void run() {
		System.out.println("Do a task");
	}
}


public class ThreadRunnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Book(),"book thread");
		t1.start();
		System.out.print("Thread with name"+" "+t1.getName());
	}
}
