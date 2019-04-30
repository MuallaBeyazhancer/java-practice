package day05_math_operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs + 2);
		
		int moreChairs = chairs+5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		System.out.println(500-123);
		
		int result = 44-23;
		System.out.println(result);
		
		double balance = 1200.50;
		double transaction = 56.44;
		
	System.out.println(balance - transaction);
	balance = balance - transaction;
	System.out.println(balance);
	
	int linesOfCode = 50;
			linesOfCode = 50-2;
			System.out.println("Lines of Code "+linesOfCode);
			
			System.out.println(22*2);
			
			int classes = 5;
			System.out.println(linesOfCode * classes);
			
			int totalLinesOfCode = linesOfCode * classes;
			System.out.println(totalLinesOfCode);
			System.out.println("totalLinesOfCode="+totalLinesOfCode);
			
			System.out.println(10/3);  //3
			System.out.println(55/5);
			System.out.println(10.0/3);  //3.3333333333335
			System.out.println(15/7);
			System.out.println(15.0/7);
			System.out.println(5.0/2.0);
			
			System.out.println(11/0);  // throw error while running code
			
	
	   
	}

}
