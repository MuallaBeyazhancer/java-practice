package day41_customClasses02;

import java.util.*;


public class WarmUpWithList {
	public static void main(String[] args) {
		
		List<Integer> num1 = new ArrayList<Integer>();
		num1.add(3);
		num1.add(5);
		num1.add(7);
		List<Integer> n1 = doubleTheList(num1);
		System.out.println(n1);
	}
public static List<Integer> doubleTheList(List<Integer> nums){
	for(int i = 0; i<nums.size(); i++) {
		nums.set(i, 2*nums.get(i));
	}
	return nums;
}
}
