package day54_InheritanceReview;

import java.util.Scanner;



class cybertek{
	private int password;
	
	public void setPassword(int password) {
	this.password = password;	
	}
	
}

public class this_Super extends cybertek{
/*
 *    this&super: refers to object instances.
 *           this: refers object instance in the class
 *               this. : calls the instance methods, instance variables
 *               can only be used at: constructor, instance method, instance block
 *            this(): only be used in constructor.
 *         
 *          super: refers object instance in super class.
 *             super. : calls the instance methods, instance variables from super class
 *                    can only be used at: sub class constructor, instance block, instance method
 *             super(): used in constructor 
 */
	static String str = "School";
	public static void methodY(String str) {
		System.out.println(this_Super.str);
	}
	
	boolean result1;
	String str1 ;
	double decimal;
	
	static char ch;
	
	public static void main(String[] args) {
	//	this.result1 =result1 // there is no object instance
		methodY(str);
	}
	static {
		//this.result1 =result1; 
	}
	public this_Super() {
		this.result1 =true;
		this.str1 = "obj";
		this.decimal = 0.9;
		this.ch = '7';
		new this_Super().ch = 'p';
		this_Super.ch = 'o';
	}
	public void instancemethod() {
		this.result1 =result1;
	}
	{this.result1 =result1;
	}
	static Scanner scan = new Scanner(System.in);
	public void scan1(){
		String a = scan.next();
	}
	public static void scan2() {
		int b = scan.nextInt();
			
		
	}
	this_Super(char c){
		boolean b = scan.hasNextBoolean();
	}
}
