package day19_While_Loop;

import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter word to test");
	String word = scan.next();
	String reversed = "";
	int idx = word.length()-1;
	
	// loop through word in reverse order and
	// concetanate each character to reversed string
	// compare if reversed and word are equal
	while( idx >= 0) {
		reversed = reversed + word.charAt(idx);
		idx--;
	}
	System.out.println(reversed);
	if(reversed.equalsIgnoreCase(word)) {
		System.out.println("It is palindrome");
	}else {
		System.out.println("It is not palindrome");
	}
}
}
