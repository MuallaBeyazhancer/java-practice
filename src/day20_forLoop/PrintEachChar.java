package day20_forLoop;

import java.util.*;

public class PrintEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.nextLine();
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}

		// using for loop print vowels(a e i o u
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				System.out.print(letter + ", ");
			}

		}
		// using for loop print consonant
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (!(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')) {
				System.out.print(letter + ", ");
			}

		}
	}

}
