package com.index;

import java.util.*;

public class QueueUsingLinkedList {
	public static void main(String[] args) {
		//Creating empty linkedlist
		Queue<Integer> ll = new LinkedList<Integer>();
		//Adding items to the ll
		//using add
		ll.add(10);
		ll.add(20);
		ll.add(15);
		ll.add(25);
		ll.add(35);
		ll.add(45);
		ll.add(1);
		System.out.println(ll);
		
		//printing the top element of the linkedlist
		System.out.println(ll.peek());
		
		//printing the element and removing it from
		//the linkedlist container
		System.out.println("Poll value is "+ll.poll());
		System.out.println(ll);
		System.out.println("Offer of 1st element "+ll.offer(1));
		//printing the element again
		System.out.println("printing the top element again "+ll.peek());
	}

}
