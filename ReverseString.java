package Tasks;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scn.next();
		String result = "";
		
		System.out.print("The reversed string: ");
		for(int i=str.length()-1;i>=0;i--) {
			result+= str.charAt(i);
		}
		System.out.print(result);
		scn.close();
	}

}
