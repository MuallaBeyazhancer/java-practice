package day30_methods02;

import java.util.*;;

public class MyNumbers {
	public static void main(String[] args) {
		/**
		 * 
		 */
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		do10PushUps();
		do10PushUps();
	}

	public static void showMe5Numbers() {
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1001) + " ");
		}
		System.out.println();
	}

	public static void do10PushUps() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Pushup - " + i);
		}
		System.out.println("Time to rest");
	}

}
