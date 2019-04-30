package day23_loop_and_arrays;

import java.util.*;
public class BruteForce {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String expectedUsername = "admin";
	String expectedPassword = "admin123";
	String username = "";
	String password = "";
	int attempts = 5; 
	do {
		if(attempts == 0) {
			System.out.println("You have exceeded mumber of attempts");
			System.out.println("This user has been disactivated for 30 minutes");
			return;
		}
		attempts--;
		System.out.println("Please enter user name");
		username = scan.next();
		if (!username.contentEquals(expectedUsername)) {
			System.out.println("Wrong user name");
			System.out.println("Attempts left: "+ attempts);
			continue; 
		}
		System.out.println("Please enter the password");
		password = scan.next();
		if(!password.equals(expectedPassword)) {
			System.out.println("Wrong password");
			System.out.println("Attempts left: "+ attempts);
		}
	}while(!username.equals(expectedUsername) || !(password.equals(expectedPassword)));
	System.out.println("Login successful!");
}
}
