package Tasks;

import java.util.Scanner;

public class StringReverse{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String word = scn.next();
		String result="";
		for(int i = word.length()-1;i>=0;i--) {
			result += word.charAt(i);
		}
		System.out.print("Reversed word: "+result);
		scn.close();
	}
	public class Palindrome{
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter the word: ");
			String word = scn.next();
			String result="";
			for(int i = word.length()-1;i>=0;i--) {
				result += word.charAt(i);
			}
			if(word.equals(result)) {
				System.out.print(result+ " is palindrome");
			}
			else
				System.out.print(result+ " is not palindrome");
			scn.close();
		}
}
}