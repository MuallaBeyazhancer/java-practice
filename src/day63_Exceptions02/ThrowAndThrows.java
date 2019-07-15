package day63_Exceptions02;

import java.io.IOException;

public class ThrowAndThrows {
public static void main(String[] args) throws InterruptedException{
	System.out.println("hello world");
	//throw new RuntimeException("THis is thrown using throw keyword");
	String username = "";//"user01";
	if(username.isEmpty()) {
		throw new RuntimeException("Username cannot be empty");
	}else {
		System.out.println("Valid Username");
	}
	
	//thread "main" > main thread, from main method
	//java.lang.RuntimeException: > exception type/class
	//Username cannot be empty : exception message
	//at day63_Exceptions02.ThrowAndThrows.main(ThrowAndThrows.java:9)
	// package  /           class/ line number
	
	//throwing checked exception.
	//handle - declare otherwise it will not compile
	try {
		throw new IOException();
	}catch(IOException e) {
		e.printStackTrace();
	}
	
//	try {
//		sleep(2);
//	}catch(InterruptedException e) {
//		System.out.println(e.getMessage());
//	}
	sleep(2);
}
//declare using throws keyword
public static void sleep(int seconds) throws InterruptedException{
	Thread.sleep(seconds*1000);
}
}
