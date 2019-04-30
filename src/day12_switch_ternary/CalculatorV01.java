package day12_switch_ternary;

import java.util.Scanner;
public class CalculatorV01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//Get Numbers
		double num1, num2, result;
		String operator;
		
		System.out.println("Enter first number :");
		num1 = input.nextDouble();
		
		System.out.println("Enter number 2:");
		num2 = input.nextDouble();
// Get Operator
		System.out.println("Select Operator: +, -, *, /, %");
		
		operator = input.next();
//perform calculation and display result
		result = 0.0;
		if (operator.equals("+")) {
			result = num1 + num2;
		}else if (operator.equals("-")) {
			result = num1 - num2;
		}else if (operator.equals("*")) {
			result = num1 * num2;
	    }else if (operator.equals("/")) {
			result = num1 / num2;

	    }else if (operator.equals("%")) {
			result = num1 % num2;

	    }else {
	    	System.out.println("Invalid operator selected: "+operator);
	    	return;  // do not execute the remaining code. STOP HERE
	    }
		System.out.println(result);

	    }
}
