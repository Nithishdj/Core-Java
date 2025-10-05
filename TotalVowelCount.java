package Tasks;

import java.util.Scanner;

public class TotalVowelCount {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String word = scn.next();
		int count=0;
		
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
			||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		System.out.print("Number of vowels: "+count);
		scn.close();
	}

}
