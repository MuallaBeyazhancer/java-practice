package day28_multid_arrays;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.IOException;
import java.nio.*;

public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		//read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

		System.out.println("Data size: " + data.length);
		// first line
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
		
		//System.out.println(Arrays.toString(data));
		
	    //print each Reastaurant info in separate line
		int counter = 0;
		 for(String lines : data) {
			 System.out.println("#"+ counter+"=> "+lines);
			 counter++;
		}
		
		 //Print all restaurant information in state of VA
		 int count = 0;
		 for(String lines : data) {
			 if(lines.contains(",VA,")) {
				 System.out.println(lines);
				 count++;
			 }
		 }
		 System.out.println("###Total Restaurants in VA : "+count);
		 
		 // find all restaurant info in state of VA
		 // print the restaurant names along with cityname;
		 //SubWay-Herndon
		 for(String res : data) {
			 if(res.contains(",VA,")) {
				 String[] resArr = res.split(",");
				 System.out.println(resArr[2]+" - "+resArr[1]);
			 }
			 
		 }
		}
	}


