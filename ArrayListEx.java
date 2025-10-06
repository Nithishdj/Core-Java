package com.index;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		//adding the elements at specific position
		//obj.add(value);
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(0,500);//elements at specific position
		
		System.out.println(a);
		
		List<Object> mix = new ArrayList<>();
		mix.add(100);
		mix.add("String");
		mix.add(100000000);
		mix.add(0.2);
		
		System.out.println(mix);
		
		//Insert element at the beginning of the list(0)
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		Iterator <Integer> it=a.iterator();
		while(it.hasNext()) {
			Integer s=it.next();
			System.out.println(s);
		}
	}
}
