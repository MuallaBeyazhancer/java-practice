package day65_Collections02;

import java.util.*;

public class LoopArrayList1 {
public static void main(String[] args) {
	
	List<Integer> nums = new ArrayList<>();
	nums.add(50);nums.add(453);nums.add(320);nums.add(50);nums.add(570);
	nums.add(450);nums.add(512);nums.add(215);nums.add(650);nums.add(450);
	
	//Loop using FOR EACH LOOP
	for(int n : nums) {
		System.out.print(n + " | ");
	}
	System.out.println();
	
	//Using For Loop
	for(int i = 0; i< nums.size(); i++) {
		System.out.print(nums.get(i)+ " | ");
	}
	System.out.println();
	
	//forEach method of Java8
	/*forEach method comes from Iterable Interface
	 * And we need to pass a lambda expression
	 * Lambda expression is part of java functional programming
	 * that started from java 8.
	 * It is used to pass an implementation while programming.
	 * We need to use -> operator
	 */
	
	nums.forEach(n -> System.out.print(n + " | "));
	System.out.println();
	
	nums.removeIf(n -> n < 500);
	nums.forEach(n -> System.out.print(n + " | "));
	
	//nums.stream() can also be used to manipulate data in the collections.
	
	/*
	 * All actions that Java Functional programming can also be achieved by using 
	 * traditional for each/for loops
	 * functional programming is only for shorter code and faster programming
	 * In general in Java functional programming is slower than 
	 * traditional loops
	 * 
	 */
	
	
}
}
