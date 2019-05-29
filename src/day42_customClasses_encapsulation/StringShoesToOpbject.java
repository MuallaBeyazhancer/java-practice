package day42_customClasses_encapsulation;

import java.util.*;
import java.lang.*;//this import is always added by compiler

public class StringShoesToOpbject {
	public static void main(String[] args) {

		// create Shoes object and assign the data from the
// String data
		String data = "Bruno Magli,9.5";

		// split using, data and store into array
		String[] arrData = data.split(",");
		// Create Shoes object
		Shoes shoes = new Shoes();
		// shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		shoes.brand = arrData[0];
		shoes.size = Double.parseDouble(arrData[1]);
		System.out.println(shoes.getShoesData());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("WHat is your size?");
		double size = scan.nextDouble();
		
		// create object
		Shoes myShoe = new Shoes();
		myShoe.setShoesData(brand, size);
		System.out.println(myShoe.getShoesData());
	}
}
