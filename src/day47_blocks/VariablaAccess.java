package day47_blocks;

public class VariablaAccess {
	//instance variable, 
	int myInstanceVar = 40;
	
	//static variable
	static int myStaticVariable = 55;
	public static void main(String[] args) {
	// cannot access non-static from static method
	//	System.out.println(myInstanceVar);
		System.out.println(myStaticVariable);

		//create object of VariableAccess and print myInstanceVar
	VariablaAccess v1 = new VariablaAccess();
	System.out.println(v1.myInstanceVar);
	//access static variable using object
	System.out.println(v1.myStaticVariable);
	
	//access static variable using class name
	System.out.println(VariablaAccess.myStaticVariable);
	}

}
