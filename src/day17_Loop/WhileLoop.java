package day17_Loop;

public class WhileLoop {
	public static void main(String[] args) {

		int n1 = 100;
		int n2 = 140;

		while (n2 > n1) {
			System.out.println("N2 is greater");
		}
		System.out.println("END");
		// The above loop is infinite loop
		// the condition (n2 > n1) will always be true never become false.
		// while loop keeps execution as long as the condition stays TRUE.
	}
}
