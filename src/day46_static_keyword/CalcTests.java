package day46_static_keyword;

public class CalcTests {
	public static void main(String[] args) {
    double result = Calculator.plus(55, 7); //static way
    		System.out.println("Result: "+result);
    
    result = Calculator.minus(44, 14);
    System.out.println("Result: "+result);
    
    Calculator c = new Calculator();
    System.out.println(c.multiply(4, 2));
    
    int i = Integer.parseInt("33");
    System.out.println(Character.isDigit('5'));
    
    System.out.println("hi");
	}
}
