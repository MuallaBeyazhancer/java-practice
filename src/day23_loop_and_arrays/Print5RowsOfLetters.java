package day23_loop_and_arrays;

public class Print5RowsOfLetters {
	public static void main(String[] args) {
		// outer loop will repeat printing of letter as many times as wanted
		// in this case we are gonna print 3 times
		// so we repeat inner loop 3 times
		for (int i = 0; i < 5; i++) {
	   // if index is even print letters from a to z
			if (i % 2 == 0) {
				for (char letter = 'a'; letter <= 'z'; letter++) {
					System.out.print(letter);

				}
				//IF INDEX IS odd print letters from z to a
			} else {
				for (char letter = 'z'; letter <= 'a'; letter--) {
					System.out.print(letter);
				}
			}
			System.out.println();
			System.out.println("***********************");
		}
	}
}
