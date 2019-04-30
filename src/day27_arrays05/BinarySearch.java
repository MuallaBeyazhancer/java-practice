package day27_arrays05;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {23, 34, 54, 94, 102};
		System.out.println(Arrays.binarySearch(nums, 54));
		System.out.println(Arrays.binarySearch(nums, 23));
		System.out.println(Arrays.binarySearch(nums, 3));

		int i = Arrays.binarySearch(nums, 94);
		System.out.println(i);
		
		int[] nums2 = {34, 94, 54, 23, 102};
		Arrays.sort(nums2);
		System.out.println(Arrays.binarySearch(nums, 23));
		
		//Arrays.binarySearch(a, fromIndex, toIndex, key)
		//Arrays.sort(a, fromIndex, toIndex, c); comparator
	}

}
