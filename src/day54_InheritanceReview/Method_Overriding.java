package day54_InheritanceReview;

class superClass{
	public void original() {
		System.out.println("cybertek");
	}
}

public class Method_Overriding extends superClass{
	@Override
public void original() {
		System.out.println("Batch 11");
	}
	public static void main(String[] args) {
		new superClass().original();
		new Method_Overriding().original();
	}
/*
 *  only instance methods can be overrided
 *  			needs to be override ins subclass
 *              parameter MUST be same
 *              @Override annotation should be applicable
 *              
 *   Method Override     vs         Method Overload
 *         Method Override: Must Have same signature
 *                         cannot be override in same class
 *                         return type needs to be same
 *                         AM needs to be same or more visible
 *                         only instance methods (does not have final and private) can be override
 *         
 *         Method Overload: MUST have different param
 *                         can be overload in same class
 *                         return type can be same or different
 *                         AM can be different 
 *                         any method and constructor overload
 *  					   
 */
}
