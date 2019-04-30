package day31_methods03;

import java.util.*;

public class Counter {
	public static void main(String[] args) {
		int n=5;    // num = n
		countDown(3);
		countDown(5);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = scan.nextInt();
//		int num1 = scan.nextInt();
		countUp(num);
		
		countDown(num);
		   // nothing for 0
		drive("Audi", 60);
		
	}
/*
 * name: countUp
	   return type: void
	   param: int
	   it prints from 1 to the value of the param
	   countUp(5);
	   1 2 3 4 5
 */
	//return type always before void
	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("Invalid input - "+num);
		}else {
		for(int i =1; i<=num; i++) {
		  System.out.print(i+" ");
		}
		System.out.println();
		}
	}
	/*
	 *name countDown
	   return type: void
	   param: int
	   it prints from param value till 1
	   countDown(5);
	   5 4 3 2 1 
	 */
	public static void countDown(int num) {
		if ( num < 1 ) {
			System.out.println("Invalid input");
		}else {
		for(int i = num; i >= 1; i--) {
		  System.out.print(i+" ");
		}
		System.out.println();
		}
		}
	
	public static void drive(String car, int speed) {
		System.out.println(car+" is driving "+speed+" mph");
	}
	
}
