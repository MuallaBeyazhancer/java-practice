package day54_InheritanceReview;

class example1{
	
	public example1(int a) {
		System.out.println("Constructor 1");
	}
	public example1(double a) {
		//example1(9); reason : #5
		//this(300);
		System.out.println("double constructor");
	}
	public void methodE() {
		//this(300);   reason : #6
	}
	
	public example1(float a) {
		//this(19.5);
		System.out.println("float constructor");
	}
	public example1(char a) {
		this(5.344323F);
	}
}

public class Constructors {
	/* constructor: belongs to the object.
	 * 			1. Every class must have constructor
	 * 				(if there is no declared, compiler will give no args const)
	 * 			2. can not have specifier and return type.
	 * 				specifiers : final, static, abstract
	 * 				return : void, primitives, wrapper class, all objects
	 * 			3. constructor name must be same with class name.  
	 * 			4. constructor execution depends in the creation of object
	 *            (same with instance block, after instance block)
	 *          5. constructor cannot be called by constructor name
	 *          6. constructor can only be called in other constructor;
	 *          7. constructor cannot call itself or contain itself
	 *          8. constructor can only call one constructor
	 *          9. constructor' body constructor call needs to be at first step
				 
			   10. class' object MUST be created with existing and visible constructor(s)
				 
			   11. super class' no-arg constructor is called in sub class' constructorS by default
				 
			   12. super class' constructor ( if there isn't deafult constructor) MUST be called in sub class
				  		(if there is more than one constructor in super class, only one of them needs to be calld)
	 */
	public static void main(String[] args) {
		
		example1 obj = new example1(9);
		new example1('y');
		
	}
}
