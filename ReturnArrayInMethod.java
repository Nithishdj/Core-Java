package com.index;

public class ReturnArrayInMethod {
	static int[] get() {
		return new int[] {10,20,30,40,50,60,70};
		}
public static void main(String[] args) {
	int arr[] = get();
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
