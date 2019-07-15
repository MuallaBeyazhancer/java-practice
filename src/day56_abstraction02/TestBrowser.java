package day56_abstraction02;

public abstract class TestBrowser {
	
        // we use abstract keyword to make a class abstract
	  // we can not create object/instantiate an object
	  //Abstract Method
	  // without body/implementation, can be placed in either abstract class or interface
	// it ends with ; no curly braces.
	 // where do you add implementation
	// implementation/ body for abstract method is added in a
	//non-abstract class.
	//  ~~ Optionally implementation can be added in abstract class 
	//
	//
	//while adding implementation, all rules of overriding needs to be followed
	
	// IQ: Can we add non abstract method into abstract class?
	//---Yes, we can.Abstract class can have abdstract class and
	//---non-abstract class
	
	//-IQ: is it mandatory to add abstract method to abstract class?
	//--No, Abstract class can have 0 or more abstract methods.
	
	//  IQ: Can you add a constructor to an abstract class.
	// yes you can
	//The constructor of the abstract class can be called from a sub class
	//using super() keyword
	
	// IQ: Can you add instance or static variables into abstract class
	// --Yes, we can add instance or static vsariables abstract classes.
	
	//Variables cannot be abstract
	
	//IQ: Can you add init or static blocks into Abstract class?
	//--Yes
	// Browser is an ABstract class
	// it is setting a foundation or platform for future concrete class
	//concrete class -> non abstract sub class of an abstract class
	
	// IQ: Can an abstract class extend another abstract class?
	//~Yes we can
	
	//IQ: Can abstract class extend another non-abstract class?
	//~yes we can
	
	//IQ: Can a class extend multiple abstract classes?
	//~~No java does not support multiple inheritance?
	
	//IQ: Can we add static methods into abstract class?
	//~~Yes we can
	//Can a method be abstract and final in abstract class?
	//~~No you cannot override final methods
	
	//IQ: Can abstract method be protected, default, private?
	//In abstract classes, abstract methods can be public protected or default
	// cannot be private.
	
	//IQI: WHen an abstract class extends another abstract class, it is not required
	//to override/implement abstract methods from parent class.
	//It can also add its own abstract methods, first concrete sub class is responsible/required 
	//to
	public static void main(String[] args) {
		Browser.id = 100;
		System.out.println(Browser.id);
		
	}
}
