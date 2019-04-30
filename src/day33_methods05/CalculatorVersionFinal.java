package day33_methods05;

public class CalculatorVersionFinal {
	public static void main(String[] args) {
		addVoid(5, 7);
		// int result = addVoid(5, 1);
		//above line will not work it just perform action void does not return a value
		
		System.out.println(add(3, 4));
		double result = multiply(5.6, 7);
		System.out.println("Multiplication: "+ result);
		
		double subtraction = minus(4.56, 2.34);
		System.out.println("Subtraction: "+ subtraction);
		
		double answer = divide(18.2, 9);
		System.out.println("Division: "+ answer);
		
		
	}

	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: "+ sum);
	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;

	}
	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	
	public static double minus(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	public static double divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("ERROR: Cannot / by 0");
			//return -1;
			System.exit(0); // stop the whole code
		}
		double result = num1 / num2;
		return result;
	}
	
}
