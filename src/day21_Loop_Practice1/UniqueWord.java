package day21_Loop_Practice1;

import java.util.*;
public class UniqueWord {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		String word = "wooden spoon";
		String unique = "";
		//String unique =word.charAt(0) + "" + word.charAt(1) + ""+ word.charAt(3) + word.charAt(4)
		//+word.charAt(5) + word.charAt(6) + word.charAt(7) +word.charAt(8);
		//System.out.println(unique);
		//int i = 0;
		//while( word.charAt(i) == word.charAt(i+1)) {
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		if(!unique.contains(""+ch)) {
			unique += ch;
		}
		System.out.println("Unique: "+unique);
		
		int idx = 0;
		char ch1 = word.charAt(idx);
		while(!unique.contains(""+ch1) && idx < word.length()) {
			unique +=ch1;
			idx++;
			System.out.println("Unique: "+unique);
		}
		if(unique.indexOf(ch) == -1) {
			unique += ch;  // ab;
			System.out.println("Unique: "+unique);
		}
		String word2 = "bananas";
		String unique2 = "";
		int i = 0;
		char ch2 = word2.charAt(i);
		System.out.println("Ch2: "+ ch2 );
		i++;
		//check 
		//if(unique.contains)
		//rewrite the unique characters program to use substring method
	}

}
