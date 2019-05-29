package day36_wrapperclasses_arraylistintro;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		// declare ArrayList called languages
		ArrayList<String> languages = new ArrayList<>();
		// add values
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("Azaerbaijani");
		languages.add("Ukranian");
        // 
		System.out.println("Number of Values: "+languages.size());
		languages.add("Turkish");
		
		System.out.println("Number of Values: "+ languages.size());
		
		// remove java
		languages.remove(0);
		System.out.println("Number of Values: "+ languages.size());
        
		System.out.println(languages.toString());
	}
}
