
package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {
	public static void main(String[] args) {
		// create scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi, What is your Name?");
		
		String name = scan.next();  //accept String input
		
		System.out.println("Nice to meet you, "+name);
		
	}

}
