package day24_Arrays;

import java.util.Arrays;

public class CarShop {
public static void main(String[] args) {
	
	// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
	//create an array of strings and stores these cars inside that array
	String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
	// Print cars names that starts with M
	for(int i=0; i<cars.length; i++) {
		if(cars[i].startsWith("M"))
		System.out.println(cars[i]);
	}
	//print all cars that have letter "r" somewhere in the name
	System.out.println();
	for(String letter : cars ) {
	   if(letter.toLowerCase().contains("r")) {
		 System.out.println(letter);  
	   }
	}
	System.out.println("************");
	for(String carName: cars) {
		if(carName.endsWith("a")) {
			System.out.println(carName);
		}
	}
	System.out.println("*******************");
	// print all cars that have at least 6 letters	
	for(String carL: cars) {
		if(carL.length() > 5) {
			System.out.println(carL);
		}
	}
	//Swap first and last value
	
	//Before:"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla
	
	//After:"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla
	String temp = cars[0];
	cars[0] = cars[cars.length-1];
	cars[cars.length-1] = temp;
	
	System.out.println("Before sorting");
    System.out.println(Arrays.toString(cars));
    Arrays.sort(cars);
    System.out.println("After sorting");
    System.out.println(Arrays.toString(cars)); 
    
    System.out.println("Position: "+ Arrays.binarySearch(cars, "Ford"));
    int num = Arrays.binarySearch(cars, "Ford");
    //System.out.println("Position: "+Arrays.binarySearch(cars,num1+1, "Ford"););
	}
}

