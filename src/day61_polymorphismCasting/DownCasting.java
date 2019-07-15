package day61_polymorphismCasting;
import day60_polymorphism2.*;

public class DownCasting {
	public static void main(String[] args) {
		AppleDevice appDev = new Ipad();
		appDev.use();
		
		Ipad appDev1 = (Ipad) appDev;
		appDev1.draw();
		
		AppleDevice dev2 = new Mac();
		dev2.use();
		
		//1) using another reference variable
		Mac mac = (Mac) dev2;
		mac.code();
		
		//2) cast and call in single statement
		((Mac)dev2).code();
		System.out.println(((Mac)dev2).model);
		
		//String str = (String)dev2; //not related with inheritance
		
		double d = 123.45;
		
	}

}
