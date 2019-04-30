package day24_Arrays;

import java.util.*;;

public class SplitEmail_108 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String email = input.nextLine();

		// Write your code below
		String[] email1 = email.split("@");
		// System.out.println(Arrays.toString(email1));
		if (email1.length != 2) {
			System.out.println("invalid email");

		} else {
			System.out.println("Email id: " + email1[0]);
			System.out.println("Email domain: " + email1[1]);

		}
	}

}
