package day18_While_Loop;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		
		int num = 1;
		while (num <= 10) {
			System.out.print(num + ", ");
			num++;
			Thread.sleep(500); // pause the code execution for a second
		}
		System.out.println("\nNum value after loop:"+num);
		
		int num2 =11;
		while (num2 >= 1) {
			System.out.print(num2 + ", ");
			num2--;
			Thread.sleep(456);
		}
		System.out.println("\nNum2: "+num2);
	}
}
