package day11_logical_nestedif;

import java.util.Scanner;
public class LogInTests {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username");
		String username, password, validUsername, validPassword ;
		
		username = scan.next();
		System.out.println("Enter password");
		password = scan.next();
		
		validUsername = "cybertek@mail.com";
		validPassword = "WoodenSpoon123";
		if(username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword)) {
			System.out.println("Login Successful, Welcome!");
		
		}else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword) ) {
			System.out.println("Invalid username and Invalid password");
		
		}else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid username ");		
	   
		}else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword) ) {
		System.out.println("Invalid Password");
	}
	}
}
