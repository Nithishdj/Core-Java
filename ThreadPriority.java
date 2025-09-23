package com.index;

public class ThreadPriority {
	public static void main(String[] args) {
		Thread Ex1 = new Thread("Demo");
		Thread Ex2 = new Thread("Demo2");
		Ex2.start();
		Ex1.start();
		System.out.println("Thread name are as follows");
		System.out.println(Ex1.getName());
		System.out.println(Ex2.getName());
		Ex2.setPriority(Thread.MAX_PRIORITY);
		Ex2.setPriority(Thread.MIN_PRIORITY);
		Ex2.start();
		Ex1.start();
	}
	public void run() {}

}
