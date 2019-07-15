package day61_polymorphismCasting;

import java.util.*;

import day57_interface.Tesla;
import day60_polymorphism2.*;

public class MethodsUsingPolymorphism {
	public static void purchase(AppleDevice ap) {
		System.out.println("Purchasing: "+ap.getClass().getSimpleName());
	}

	
	public static void main(String[] args) {
	purchase(new Mac());
	AppleDevice dev = new Watch();
	purchase(dev);
	
	givemeAnyObject(new String("Hi"));
	givemeAnyObject(new Scanner(System.in));
	givemeAnyObject(new Double(5.4));
	givemeAnyObject(new Random(5));
	givemeAnyObject(new Tesla());
	int n = 33;
	givemeAnyObject(n);
	
	System.out.println(buildAppleDevice());
	
	Object o = new Object();
	AppleDevice retDev = buildAppleDevice();
	retDev.use();
	
}
	public static void givemeAnyObject(Object object) {
		System.out.println("You gave me: "+object.getClass().getSimpleName());
	}
	
	//
	public static AppleDevice buildAppleDevice() {
//		AppleDevice appDev = new Mac();
//		return appDev;
		return new Mac();
	}
	/*
	 * 
	 * You need to know inheritance hirerchy
	 * AppleDevice > Ipad
	 * 			   > Watch
	 * 			   > Mac
	 * 
	 * By looking at hirechy above, it means we can write methods,
	 * that return or accept
	 */
	public static AppleDevice buildDevice(String type) {
		if(type.contentEquals("ipad")) {
			return new Ipad();
		}else if(type.contentEquals("mac")) {
			return new Mac();
		}else if(type.contentEquals("appleWatch")) {
			return new Watch();
		}else {
		return null;
	}
  }
}
