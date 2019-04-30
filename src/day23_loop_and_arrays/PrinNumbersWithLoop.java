package day23_loop_and_arrays;

public class PrinNumbersWithLoop {
	public static void main(String[] args) {
//	for(int i = 1; i<=10; i++) {
//		System.out.print(i+ " ");
//	}
//	System.out.println();
//	for(int i = 1; i<= 10; i++) {
//		System.out.println(i+" ");
//	}
		// outer loop
		for (int k = 1; k <= 3; k++) {
			for (int j = 1; j <= 10; j++) {
				// inner loop
				for (int i = 1; i <= 10; i++) {
					System.out.print(i + " ");
				}
				System.out.println("");
			}
			System.out.println("***************");
		}
	}
}