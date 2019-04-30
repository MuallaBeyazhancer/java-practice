package day27_arrays05;

import java.util.*;

public class Times {

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		int[] time1 = { 9, 00 };
		int[] time2 = { 10, 00 };

		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has Invalid hour");
			return;
		}

		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has Invalid minutes");
			return;
		}

		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time2 has Invalid hour");
			return;
		}

		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has Invalid minutes");
			return;
		}

		if (time1[0] > time2[0]) {
			System.out.println("Time2 is earlier");
		} else if (time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		} else {
			if (time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			} else if (time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			} else {
				System.out.println("equal times");
			}
		}
	}
}
