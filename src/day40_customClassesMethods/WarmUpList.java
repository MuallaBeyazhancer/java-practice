package day40_customClassesMethods;

import java.util.*;

public class WarmUpList {
	public static void main(String[] args) {
		ArrayList<String> str1 = new ArrayList<>();
		str1.add("Mualla");
		str1.add("Ihsan");
		str1.add("Neda");
		str1.add("Neda");
		String wrd = "Neda";
		
		int count = countOccurences(str1, wrd);
		if(count == 1) {
			System.out.println("Unit test PASS: Count is "+count);
		}else {
			System.out.println("Unit test FAIL: Count is "+ count);
			System.out.println("Expected: 1");
			System.out.println("Actual: "+count);
		}
		
		
	}
   public static int countOccurences(ArrayList<String> str, String word) {
	   int count = 0;
	   for (String list : str) {
		   if(list.equals(word)) {
			   count++;
		   }
	   }
	   return count;
   }
}
