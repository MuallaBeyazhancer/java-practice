package day37_arrayList;

import java.util.*;

public class MyCities {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		
		//print each city using for each loop separated by space
		for(String city : cities) {
			System.out.print(city+" ");
		}
		System.out.println();
		//print each city using for loop, separated
        for(int i = 0; i < cities.size(); i++) {
        	System.out.print(cities.get(i)+ " ");
        }
        System.out.println();
        // remove Baku
        System.out.println("Removing Baku");
        cities.remove("Baku");
        cities.remove("New York"); // It will not remove or show error
        System.out.println(cities.toString());
        
        //isEmpty?
        System.out.println("Is list empty? "+ cities.isEmpty());
        cities.add(0, "Bishkek");
        System.out.println(cities.toString());
        
        cities.add(1,"Istanbul");
        System.out.println(cities.toString());
        
        cities.set(2, "Seoul");
        System.out.println(cities.toString());
        // find sterling in the ArrayList 
        int idx = cities.indexOf("Sterling");
        System.out.println("Sterling index: "+ idx);
        cities.set(idx, "Zagreb");
        System.out.println(cities.toString());
        
        cities.clear();
        boolean empty = cities.isEmpty();
        System.out.println("empty: "+ empty);
        
        
        
	}

}
