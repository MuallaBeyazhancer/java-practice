package day62_Exceptions01;

public class TryCatch2 {

	public static void main(String[] args) {
		int[] nums = {34, 6, 34, 12};
		//Handle if any issues below line
		//if any error print "Wrong Index"
		try {
			System.out.println(nums[5]);	
		}catch(Exception e) {
			System.out.println("Wrong Index");
		}
		System.out.println("Some code after array");
		try {
		int j = 100;
		int n = j/0;  // cannot divide number by zeroArithmetic Exception
		System.out.println(n);
		}catch(ArithmeticException e) {
			System.out.println("Cannot / by zero");
			e.printStackTrace();
		}
		System.out.println("AFTER TRY CATCH");
	}

}
