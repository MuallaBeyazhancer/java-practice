package day29_method01;

public class Student {

	public static void main(String[] args) {
		sayHello();
		study();
		study();
		study();
		code();
		code();
	}
	public static void study() {
		System.out.println("Student is studying");
	}
	
	//create a method sayHello that prints "Hello Friends!"
	public static void sayHello() {
		System.out.println("Hello Friends!");
		System.out.println("How are you today?");
	}
     
	//create a method with name code
	 // "inside code method
	// student is coding java
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding java");
	}
}
