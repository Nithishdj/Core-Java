package com.index;

class ThreadImp1 implements Runnable{
	private boolean exit1;
	private String name;
	Thread t;
	ThreadImp1(String threadname){
		name = threadname;
		t = new Thread(this.name);
		System.out.println("New thread "+t);
		exit1=false;
		t.start();
	}
	public void run() {
		int i = 0;
		while(!exit1) {
			System.out.println(name+" :"+i);
			i++;
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("Caught"+e);
			}
		}
		System.out.print(name+"Stopped");
	}
	public void stop() {
		exit1 = true;
	}
}

public class ThreadImplementation {
	public static void main(String[] args) {
		ThreadImp1 t1 = new ThreadImp1("First Thread");
		ThreadImp1 t2 = new ThreadImp1("Second Thread");
		
		try {
			t1.stop();
			t2.stop();
			Thread.sleep(1000);
			//note : thread only can specify the sleep timing rather than obj/variables
		}
		catch(InterruptedException e) {
			System.out.println("Caught"+e);
		}
		System.out.println("Exit the main thread");
	}
}
