package com.index;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(200);
		lista.add(400);
		lista.add(600);
		System.out.println(lista);
		
		List<Integer> listb=new ArrayList(lista);//shallow copy
		//coping 2 lists
		Collections.copy(listb,lista);
		System.out.println(listb);
		System.out.println(lista);
		
		//shuffle the list
		System.out.println("List before shuffle"+lista);
		Collections.shuffle(lista);
		System.out.println("List After shuffle"+lista);
		
		//reverse the list
		System.out.println("List before reverse"+lista);
		Collections.reverse(lista);
		System.out.println("List after reverse"+lista);
		         
		//swaps the list
		System.out.println("List before swap"+lista);
		Collections.swap(lista,0,2);
		System.out.println("List after swap"+lista);
		
		//sort the list
		System.out.println("List before sort"+lista);
		//ascending
		Collections.sort(lista);
		System.out.println("List after sort(ascending)"+lista);
		//descending
		Collections.sort(lista,Collections.reverseOrder());
		System.out.println("List after sort(descending)"+lista);
		
		List<String> listString = new ArrayList<String>();
		listString.add("Red");
		listString.add("Black");
		listString.add("Blue");
		listString.add("Yellow");
		listString.add("Orange");
		Collections.sort(listString);
		System.out.println(listString);
		
		List<String> listString2 = new ArrayList<String>();
		listString2.add("Violet");
		listString2.add("Blue");
		listString2.add("Green");
		listString2.add("Red");
		listString2.add("Orange");
		//add all the arraylist(appends all the list in one obj)
		
		List<String> listString3 = new ArrayList<String>();
		listString3.addAll(listString);
		listString3.addAll(listString2);
		System.out.println(listString3);
		
		List<String> listCompare = new ArrayList<String>();
		for(String e : listString) {
			listCompare.add(listString2.contains(e)? "Yes":"No");
			System.out.println(listCompare);
			listCompare.clear();
		}
	}
}
