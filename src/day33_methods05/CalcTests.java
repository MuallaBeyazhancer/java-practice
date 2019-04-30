package day33_methods05;

import day31_methods03.Calculator;

public class CalcTests {
	public static void main(String[] args) {
		System.out.println(CalculatorVersionFinal.add(3, 1));
		System.out.println(CalculatorVersionFinal.multiply(5, 6));
		System.out.println(CalculatorVersionFinal.minus(40, 12));
		System.out.println(CalculatorVersionFinal.divide(2, 1));

		int addResult = CalculatorVersionFinal.add(21, 41);
		double mResult = CalculatorVersionFinal.multiply(50, 40);
		double miResult = CalculatorVersionFinal.minus(3, 2);
		double dResult = CalculatorVersionFinal.divide(3, 5);

		System.out.println("addResult: " + addResult);
		System.out.println("mResult: " + mResult);
		System.out.println("miResult" + miResult);
		System.out.println("dResult: " + dResult);

		double a = 10.0, b = 5.0;
		double myResult = CalculatorVersionFinal.minus(a, b);
		System.out.println("myResult: " + myResult);
		double[] dNums = { 2.0, 4.0 };
		double result2 = CalculatorVersionFinal.multiply(dNums[0], dNums[1]);
		System.out.println(result2);
		
		if(CalculatorVersionFinal.add(10, 16) == 26) {
		System.out.println("Add Unit Test Passed");
		}else {
			System.out.println("Add unit test Failed");
		}
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is 4 characters");
		}else {
				System.out.println("It is not 4 characters");
			}
		}
	}

