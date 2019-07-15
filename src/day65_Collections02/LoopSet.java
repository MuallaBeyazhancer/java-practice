package day65_Collections02;

import java.util.*;

public class LoopSet {
	public static void main(String[] args) {
							//treSet sorts the Set
		//Set<Integer> numsSet = new TreeSet<>(Comparator.reverseOrder());
		Set<Integer> numsSet = new HashSet<>();
		numsSet.add(10);
		numsSet.add(12320);
		numsSet.add(112);
		numsSet.add(2345);
		numsSet.add(43);
		numsSet.add(130);
		numsSet.add(34);
		numsSet.add(542);
		System.out.println(numsSet.size());
		System.out.println(numsSet.toString());
		
		for(int n : numsSet) {
			System.out.print(n + " | ");
		}
		System.out.println();
//for loop wil not will not work
		//forEcah method with Lambda
		numsSet.forEach(n -> System.out.print(n + " | "));
		System.out.println();
	}
}
