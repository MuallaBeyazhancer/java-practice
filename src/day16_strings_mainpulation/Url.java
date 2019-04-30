package day16_strings_mainpulation;

import java.util.Scanner;
public class Url {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a url: ");
		String url = scan.next();

		boolean startsWith = url.startsWith("www.");
		if (startsWith) {
			System.out.println("url starts with www.: " + startsWith);
		} else {
			System.out.println("Invalid url format");
			return;
		}
		int length = url.length();

		char lastDot = url.charAt(length - 4);
		if (lastDot == '.') {
			System.out.println(". is there before extension");
		} else {
			System.out.println(". might be misplaced");
		}
		/*
		 * if (url.charAt(url.length() -4 ) == '.'){ }
		 * 
		 */

		String domain = url.substring(4, length - 4);
		System.out.println("Domain: " + domain);

		String extension = url.substring(length - 3, length);
		System.out.println("Extension: " + extension);

	}
}
