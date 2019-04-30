package day27_arrays05;

import java.util.*;

public class ArraysClass {

	public static void main(String[] args) {
		int[] nums = {43, 12, 4, 1, 3, 5};
		//toString Method
		String str = Arrays.toString(nums);
	System.out.println(str);
	
	    // sort method sorts array in ascending array
	   Arrays.sort(nums);
	   System.out.println(Arrays.toString(nums));

	   String[] languages = {"Zulu", "Spanish", "Italian", "Polish", "Arabic", "Uzbek"};
	   System.out.println(Arrays.toString(languages));
	   
	   Arrays.sort(languages);
	   System.out.println(Arrays.toString(languages));
	   
	  
	   
	   int[] nums2 = {1, 3, 57, 43, 5};
	   //find lowest and largest number in array
	   Arrays.sort(nums2);
	 //  System.out.println(Arrays.toString(nums2));
	   int lowest = nums2[0];
	   int largest = nums2[nums2.length-1];
	   
	  System.out.println("Lowest number in nums2 array: "+lowest); 
	  System.out.println("Largest number in nums2 array: "+largest); 
	}

}
