package day11_logical_nestedif;

public class TruthTables {
	public static void main(String[] args) {
		
		System.out.println("##### TRUTH TABLE FOR && OPERATOR #####");
		System.out.println("When true and true   - result is " + (true && true));  //true
		System.out.println("When true and false  - result is " + (true && false));  // false 
		System.out.println("When false and true  - result is " + (false && true));  //false
		System.out.println("When false and false - result is " + (false && false));  //false
		
		System.out.println();  // add an empty line
		
		System.out.println("##### TRUTH TABLE FOR || OPERATOR #####");
		System.out.println("When true or true - result is " + (true || true));
		System.out.println("When true or false - result is " + (true || false));
		System.out.println("When false or true - result is " + (false|| true));
		System.out.println("When false or false - result is " + (false || false));
		
		System.out.println();
		
		System.out.println("##### TRUTH TABLE FOR ! (NOT) OPERATOR#####");
		System.out.println("When !true - result is "+(!true));
		System.out.println("When !false - result is "+(!false));
	}

}
