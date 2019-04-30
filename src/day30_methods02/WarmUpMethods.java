package day30_methods02;

public class WarmUpMethods {

	public static void main(String[] args) {
		print5Stars(); // call the method
		// call print5Stars 100 times
		for(int i = 1; i<=100; i++) {
			print5Stars();
		}
	}
	public static void print5Stars() {
		System.out.println("* * * * *");
	}

}
