package day32_methods04;
import java.util.*;
public class ArrayParameters {
	

	public static void main(String[] args) {
		int[] myArray = {24, 6, 7, 12};
		printArray(myArray);
        printArray(new int[] {33,45, 5, 7});
        printArray(new int[] {3, 5, 34, 65, 7, 123, 34, 54, 6});
        
        int[] arr1 = {2, 3, 4, 5, 6};
        int[] arr2 = {3, 5, 1};
        print2Arrays(arr1, arr2);
        
        print2Arrays(new int[] {3,5,7,5,2}, new int[] {2,3,4,5,79,6,43,7,7,98,54});
       
        
        print2ArraysV2(myArray, myArray );
	}
	
	public static void printArray(int[] nums) {
	 for(int each : nums) {
		 System.out.print(each + " "); 
		}
	 System.out.println();
	}
	public static void print2Arrays(int[]nums1, int[] nums2) {
//		
	
	if(nums1.length > nums2.length) {
		System.out.println(Arrays.toString(nums1)+ Arrays.toString(nums2));
	}	else {
		System.out.println(Arrays.toString(nums2)+ Arrays.toString(nums1));
	}
	
	}
	//version2 we will call printArray method
	public static void print2ArraysV2(int[]nums1, int[] nums2) {
//		
	
	if(nums1.length > nums2.length) {
		printArray(nums1);
		printArray(nums2);
	}	else {
		printArray(nums2);
		printArray(nums1);
	}
	
	}
	
	

}
