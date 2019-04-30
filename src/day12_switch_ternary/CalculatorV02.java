package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {
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
		switch(operator) {
		case "+":
		System.out.println(num1 + num2);
		break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;

		case "%":
			System.out.println(num1 % num2);
			break;
	    default:
	    System.out.println("Invalid operator selected");
		}
	    }
}