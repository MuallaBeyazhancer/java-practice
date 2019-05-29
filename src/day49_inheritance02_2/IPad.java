package day49_inheritance02_2;
import day49_inheritance02.*;
		//IPad IS-A Device. IPad is a subclass in a different package
public class IPad extends Device{
	
	public void readEBook(String title) {
		System.out.println("Reading a " +title+ " using "+brand+ " tabled");
		System.out.println("Model: " + model);
		//System.out.println("Price: "+ price);not inherited, not visible
		//System.out.println("Made in "+country); not visible
	}
	
}
