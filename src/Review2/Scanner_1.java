package Review2;

import java.util.Scanner;

public class Scanner_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);    //Create scanner object;
		
		System.out.println("Enter a number : ");
		
		int number = input.nextInt();
		System.out.println("You entered " +number);
		
	}

}
