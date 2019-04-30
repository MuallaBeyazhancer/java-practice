package day34_methods06;

public class MethodOverloading {
	public static void main(String[] args) {
		add(10, 20);
		add("Neda", "Denli");
	}
	
   public static void add(int num1, int num2) {
	   int result = num1 + num2;
	   System.out.println(result);
   }
   
   public static void add(double n1, double n2) {
	   double result = n1 + n2;
	   System.out.println(result);
   }
   
   public static void add(String str1, String str2) {
	   String result = str1 + " "+ str2;
	   System.out.println(result);
   }
   
}
