package day34_methods06;

import java.util.*;

public class CountArray {
     public static void main(String[] args) {
    int[] nums = {2,3,4,5,5,5,5,6,6,6,6,7,5,12}; 
	int five = findOccurences(nums,5);
	int six = findOccurences(nums,6);
	
	System.out.println(five);
	System.out.println(six);
	
	if(five > 0) {
		System.out.println("We have 5s");
	}else {
		System.out.println("No fives");
	}
	if(findOccurences(nums,2)>0) {
		System.out.println("We have 2");
	}else {
		System.out.println("no 2s");
	}
	// create array and pass to method
	int twenty =findOccurences(new int[] {10, 20, 30, 55, 22, 32, 32}, 20);
	System.out.println("twenty: "+twenty);
	
	  
	
}
	
	public static int findOccurences(int[] array, int value) {
		
		int count = 0;
		for(int each: array) {
			if(each == value) {
			count++;
		}
			}
		return count;
		}
	
	public static int[] getArray() {
		int[] arr = {3, 4, 5,2, 1, 37};
		
		return arr;	
}
	public static int[] getRandomArray(int size) {
		Random rand = new Random();
		int[] array = new int[size];
		for(int i = 0; i<size; i++) {
			array[i] = rand.nextInt(101);
			
		}
		return array;
	}
	}
