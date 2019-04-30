package day18_While_Loop;

import java.util.Scanner;

public class EnterPincode {
 public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	 int scretPincode = 1234;
	 
	 int pincode = 0;
	 
	 while( pincode != scretPincode) {
		 System.out.println("Enter pincode");
		 pincode = scan.nextInt();
	 }
	 System.out.println("Access granted, select operation");

}
}
