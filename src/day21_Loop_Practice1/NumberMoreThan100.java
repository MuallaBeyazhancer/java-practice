package day21_Loop_Practice1;

import java.util.*;
public class NumberMoreThan100 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int num1;
		int num2;
		int sum = 0;
		do {
			System.out.println("Enter num1: ");
			 num1 = keyboard.nextInt();
			System.out.println("Enter num2: ");
			 num2 = keyboard.nextInt();
			 sum = num1 + num2;
		}while ( num1 + num2 <= 100 );
		System.out.println("Good Numbers");		
	}

}
