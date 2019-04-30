package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {
	public static void main(String[] args) {
		
		//passingPercentage = 65;
		//yourScorePercentage = scanner
		//check if you passed or failed
		Scanner scan = new Scanner(System.in);
		
		int passingPercentage = 65;
		System.out.println("What is your Score?:");
		
		int yourScorePercentage = scan.nextInt();
		
		if(yourScorePercentage >= passingPercentage) {
			System.out.println("Passed :)");
			
		}else {
			System.out.println("Failed");
		}
		
		System.out.println("Java is Fun!");
	}

}
