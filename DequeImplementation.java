package com.index;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeImplementation {
	public static void main(String[] args) {
		Queue<Integer> q= new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		//displaying the queue
		System.out.println("Queue elements: "+q);
		Queue<String> q1=new LinkedList<String>();
		q1.offer("First");
		q1.offer("Second");
		
		//Displaying the first elements using poll
		System.out.println("Queue elements: "+q1.poll());
		
		//Deque (double ended queue)
		Deque<String> qd = new ArrayDeque<String>();
		qd.addFirst("Front");
		qd.addLast("Rear");
		qd.offerFirst("New Front");//adds OfferFirst to front
		qd.offerLast("New Rear");//adds OfferLast to last
		
		System.out.println("Deque elements: "+qd);
		//access the elements
		System.out.println("First element: "+qd.peekFirst());
		System.out.println("Last element: "+qd.peekLast());
		
		//removes element from front and rear
		System.out.println(qd.removeFirst());//removes and prints from front
		System.out.println(qd.removeLast());//removes and prints from back
	}
}
