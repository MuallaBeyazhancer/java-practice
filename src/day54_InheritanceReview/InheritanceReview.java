package day54_InheritanceReview;

class parent{
	static int num1;  // class var , inheritable
			int num2; // instance var, inheritable
public void method1() {  // instance method
	
}
public static void method2() {   // static method
	System.out.println("Method2");
}
parent(){ // contsructor , cannot be inherited
	System.out.println("Constructor"); 
}
static {  // executed as soon as the class is created
	     // belongs to class
	     // inheritable
	System.out.println("Static Block");
}
{System.out.println("Instance Block");// belongs to object
}

private void methodB() { // privste is not inheritable, not visible outside of class
	
}
// features that cannot be inherited: 1. constructor
//								2. features that are not visible
  //									1.private
//										2.default (when sub and super are not in same package)
//										3.abstract method(if sub class is not abstract)

//
}

class class3 extends parent{
	
}

public class InheritanceReview extends parent{
	          // sub                    super
	
	//sub class can only have one super class
	//super class can have multiple sub classes
	//final class cannot hav esub class
	public static void main(String[] args) {
//		method2();
//		
//		System.out.println(num1);
//		System.out.println(new InheritanceReview().num2);
//		System.out.println(new parent().num2);
//		method2();
		new InheritanceReview();
	}
	
	public void methodA() {
		num2 = 300;
	}
	
	
}
    
    
    

