package day29_method01;

import java.util.*;

public class Countries {

	public static void main(String[] args) {
		String[][] countriesArray = {{"USA","Washington DC"},
				{"Canada","Ottawa"},
				{"Mexico","Mexico city"},
				{"Brasil","Brasilia"},
				{"Peru", "Lima"},
				{"Argentina", "Boanes Aeros"},
				{"Bolivia","La Paz"},
				{"Macedonia","Scopia"},
				{"Kazakhstan","Nursultan"}};
		System.out.println(countriesArray[0][0]+" | "+countriesArray[0][1]);
		System.out.println(countriesArray[8][0]+" | "+countriesArray[8][1]);
        System.out.println(Arrays.deepToString(countriesArray));
        
        // print all the countries in same line in separated by|
        System.out.println();
        for(int i = 0; i < countriesArray.length; i++ ) {
        	System.out.print(countriesArray[i][0]+"|");
        }
        System.out.println();
        for(String[] country : countriesArray ) {
        	System.out.print(country[0]+"|");
        }
        //print all the cities and add to cities[] array
        System.out.println();
        
        String[] cities = new String[countriesArray.length];
        for(int i = 0; i < countriesArray.length; i++ ) {
        	cities[i] = countriesArray[i][1];
  
        }
        System.out.println(Arrays.toString(cities));
      //look for Bolivia in the countriesArray and test if
       //capital city "La Paz"
        System.out.println();
        for(int i = 0; i<countriesArray.length; i++)
        if(countriesArray[i][0].equals("Bolivia")) {
    		//System.out.println(countries[i][1]);	
    			if(countriesArray[i][1].equals("La Paz")) {
    			System.out.println("Bolivia test  passed");
    		}else {
    			System.out.println("Bolivia test  failed");
    		}
    		break;//exit the loop
        	  
        }
//        String result = "test Failed";
//		for (String[] temp : countriesArray ) {
//			if (temp[0].equalsIgnoreCase("Bolivia")&& temp[1].equalsIgnoreCase("La Paz")) {
//				result = "test passed";
//				break;
//			}
//		}
//		System.out.println(result);
        }

}
