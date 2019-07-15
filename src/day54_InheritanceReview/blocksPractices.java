package day54_InheritanceReview;

public class blocksPractices {
static String names;
static {names = "John";}

{names = "Aaorn";}

public blocksPractices() {
	names = "Murodil";
}
		int	num1 = 10;
static int num2 = 10;

public static void main(String[] args) {
	
	//System.out.println(names);
	blocksPractices nm = new blocksPractices();
	nm.num1 = 20;
	nm.num2 = 20;
	

	blocksPractices nm2 = new blocksPractices();
	System.out.println(nm2.num1);  // 10
	System.out.println(nm2.num2);  // 20 
	
}
}