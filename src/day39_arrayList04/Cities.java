package day39_arrayList04;
import java.util.*;
public class Cities {

	public static void main(String[] args) {
		
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
    //For each: print each city in same line separated by |
    
        for(String city : cities) {
        	System.out.print(city+" | ");
        }
      //For loop: print each city in same line separated by |  
        System.out.println();
        for(int i = 0; i < cities.size(); i++){
        	System.out.print(cities.get(i)+" | ");
        }
        System.out.println();
      //ToString.print each city all uppercase
        System.out.println(cities.toString().toUpperCase());
      // Make each city all uppercase
        System.out.println();
        for(int i = 0; i < cities.size(); i++) {
        	cities.set(i, cities.get(i).toUpperCase());
          
        }
        System.out.println(cities);
        System.out.println();
        // find the longest and shortest city.
        String shortestCity = cities.get(0);
        String longestCity = "";
        for(int j = 0; j < cities.size(); j++) {
        	if(cities.get(j).length() < shortestCity.length()) {
        		shortestCity = cities.get(j);
        	}
        }
        System.out.println("shortestCity: "+shortestCity);
        System.out.println();
        for(int j = 0; j < cities.size(); j++) {
        	if(cities.get(j).length() > longestCity.length()) {
        		longestCity = cities.get(j);
        	}
        }
        System.out.println("longestCity: "+longestCity);
        
        for(String city : cities) {
        	if(city.length() < shortestCity.length()) {
        		shortestCity = city;
        	}
        }
        System.out.println("shortestCity: "+shortestCity);
        System.out.println();
        for(String city : cities) {
        	if(city.length() > longestCity.length()) {
        		longestCity = city;
        	}
        }
        System.out.println("longestCity: "+longestCity);
        ArrayList<String> citiesMoreThan6 = new ArrayList<>();
        //assign all cities that have more than 6 characters to ArrayList;
        for(String ct : cities){
        	if(ct.length() > 6) {
        		citiesMoreThan6.add(ct);
        	}
        }
        
        System.out.println(citiesMoreThan6);
        
        
        
	}

}
