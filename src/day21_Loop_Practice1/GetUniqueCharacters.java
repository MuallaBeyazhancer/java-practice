package day21_Loop_Practice1;
import java.util.*;

public class GetUniqueCharacters {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter word");  // javva
	String word = scan.next();
	String unique = "";
	 
	for(int i = 0;  i < word.length(); i++) {
		//read the letter and assign
		char letter = word.charAt(i);
		//System.out.println(letter);
		if (! unique.contains(""+letter)) {
			unique += letter;
			
		}
	}
	System.out.println(unique);
	 
//	for(int i = 0;  i < word.length(); i++) {
//		//unique 
//		System.out.print(i); //print i. it increases in every loop
//		System.out.println(word.charAt(i));
//	}
	
	
}
}