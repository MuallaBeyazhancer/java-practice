package day23_loop_and_arrays;

import java.util.*;

public class CalculateSum {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

	int sum = 0;
	int num = 0;
	for(int i = 0; i <6;  i++) {
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		if(num<=0) {
			continue;
		}
		sum += num;
	}
	System.out.println("Total is: "+sum);
   }
  }
