package day62_Exceptions01;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedVSUnchecked {

	public static void main(String[] args) { //throws InterruptedException{
		//checked exception - InterruptedException
		//Handle or Declare
     	try {
     		System.out.println("Sleeping");
			Thread.sleep(2000); //checked exception
	    }catch(InterruptedException e)  {
		System.out.println("Thread is interrupted!");
     	}
		System.out.println("Woke up");

		try {
			URL url = new URL("www.google.com");
			System.out.println(url.toString());
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL");
		}
	}

}
