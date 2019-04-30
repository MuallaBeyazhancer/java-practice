package day22_Loop_Practice2;

import java.util.*;

public class ValidMonths {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	int months;
	
	do{
		System.out.println("Enter month");
		months = scan.nextInt();
	}while( months <= 12);
   System.out.println("Invalid Month!");	
}
}
