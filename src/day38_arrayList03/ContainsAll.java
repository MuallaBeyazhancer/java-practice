package day38_arrayList03;

import java.util.*;

public class ContainsAll {
public static void main(String[] args) {
	List<Integer> nums1 = new ArrayList<>();
	
	nums1.add(10); nums1.add(20); nums1.add(30); nums1.add(40);
	
	List<Integer> nums2 = new ArrayList<>();
	nums2.add(20); nums2.add(10); nums2.add(40); nums2.add(30);
	nums2.add(50);
	// test if nums1 contains All nums2 values
	
	if(nums1.containsAll(nums2)) {
		System.out.println("Nums1 containsAll nums2");
	}else {
		System.out.println("Nums1 does not containAll nums2");
	}
	
	System.out.println(nums2.containsAll(nums1));
	
	boolean b = nums1.containsAll(nums2) && nums2.containsAll(nums1);
	System.out.println(b);
	
	List<String> planA = new ArrayList<>();
	planA.add("java");
	planA.add("replit");
	planA.add("ping pong");
	planA.add("food");
	planA.add("run");
	planA.add("sleep");
	
	List<String> planB = new ArrayList<>();
	planB.add("food");
	planB.add("run");
	planB.add("sleep");
	planB.add("java");
	planB.add("ping pong");
	planB.add("replit");
	// check if both have same values, ignoring order 
	//but case sensitive comparison for String values
	boolean c = planB.containsAll(planA) && planA.containsAll(planB);
	if(c) {
		System.out.println("Plans A and B match");
	}else {
		System.out.println("Plans A and B do not match");
	}
}
}
