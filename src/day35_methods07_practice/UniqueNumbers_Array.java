package day35_methods07_practice;
import java.util.*;
public class UniqueNumbers_Array {

	public static void main(String[] args) {
		int[] nums = {7, 4, 1, 4, 1, 5, 9, 9, 3};
		
//		int count = 0;
//		for(int i = 0; i< nums.length; i++) {
//			count = 0;
//			for(int j = 0; j< nums.length; j++) {
//				if(nums[i] == nums[j]) {
//					count++;
//				}	
//			}
//			if(count == 1) {
//				System.out.println(nums[i]);
//			}
		//	num(nums);
		
		findUnique(nums);
		int[] arr = {2,3,4,22,3,3,2,43};
		findUnique(arr);
		
		int[] unique = getUniqueArray(arr);
		System.out.println(Arrays.toString(unique));
		
		int[] cheapUnique = getUniqueArrayCheapV2(arr);
		System.out.println(Arrays.toString(cheapUnique));
	}
	//2) void method that accepts an array
	public static void findUnique(int[] nums) {
		for(int i = 0; i<nums.length; i++) { // outer loop
			int temp = nums[i];    // get a number
			int counter = 0;
			//
		 for(int j =0; j<nums.length; j++) { // inner/nested loop
			 if(nums[j] == temp && i != j) {
				 counter++;
				 break;
			 }
		 }
			//
		 if(counter == 0) {
			 System.out.println(temp);
		 }

		}
	}
	// find out how many unique numbers
	// declare new array with that size
	//return the array
	public static int[] getUniqueArray(int[] nums) {
		int uniqueCount = 0;
	
		for(int i = 0; i<nums.length; i++) { // outer loop
			int temp = nums[i];    // get a number
			int counter = 0;
			//
		 for(int j =0; j<nums.length; j++) { // inner/nested loop
			 if(nums[j] == temp && i != j) {
				 counter++;
				 break;
			 }
		 }
		 if(counter == 0) {
			 uniqueCount++; 
		 }
	}
		// declare new array with that size
		int[] uniqueArray = new int[uniqueCount];
	    int idx = 0;  
		
		//and loop through again and assign unique numbers
		for(int i = 0; i<nums.length; i++) { // outer loop
			int temp = nums[i];    // get a number
			int counter = 0;
			//
		 for(int j =0; j<nums.length; j++) { // inner/nested loop
			 if(nums[j] == temp && i != j) {
				 counter++;
				 break;
			 }
		 }
		 if(counter == 0) {// is it still 0. then it is unique
	      uniqueArray[idx] = temp;
	      idx++;
	}
     }
		//return the array
				return uniqueArray;
		}
	  //3) method that accepts int[] and returns int[] with unique values
	  // declare empty string
	  // find unique numbers and add to that string
	  // split that string by space
	  // declare new int[] and assign each number from split
	  // return the int[] array
 	public static int[] getUniqueArrayCheapV2(int[] nums) {
 		// declare empty string
 		String unique = "";
		for(int i = 0; i<nums.length; i++) { // outer loop
			int temp = nums[i];    // get a number
			int counter = 0;
			//
		 for(int j =0; j<nums.length; j++) { // inner/nested loop
			 if(nums[j] == temp && i != j) {
				 counter++;
				 break;
			 }
		 }
		 if(counter == 0) {// is it still 0. then it is unique
			// find unique numbers and add to that string
	       unique += temp+" ";
	}
     
	}
		// split that string by space
		String[] strArr = unique.trim().split(" ");
		 // declare new int[] and assign each number from split
		int[] uniqueArr = new int[strArr.length];
		for(int k = 0; k<strArr.length; k++) {
			uniqueArr[k] = Integer.parseInt(strArr[k]);
		}
		 // return the int[] array
		return uniqueArr;
 	}}