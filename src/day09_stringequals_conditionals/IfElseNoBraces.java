package day09_stringequals_conditionals;

public class IfElseNoBraces {
	public static void main(String[] args) {
		
		String day = "Tuesday";
		
		if (day.equals("Tuesday"))
			
				System.out.println("Today is Teusday");
	else
		System.out.println("Today is not Teusday");
		
		
		// this line is not part of Else block
		System.out.println("Today is not Teusday");///java things that it is separate from else block
	
		// teacher advice everyone to use Curly Braces, it will make your code easier to read/maintain

	}
}
