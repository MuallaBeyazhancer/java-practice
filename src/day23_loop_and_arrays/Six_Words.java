package day23_loop_and_arrays;
import java.util.*;

public class Six_Words {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = "";
	String listOfWords = "";
	for( int i = 0; i<6; i++) {
		System.out.println("Enter a word: ");
		word = scan.next();
		
		if(word.equals("java")) {
			continue;
		}
		listOfWords += word+ ", ";
		
	}
	System.out.println("Allwords in the list: "+ (listOfWords.length()>1 ? listOfWords.substring(0,listOfWords.length()-2): "" ));
}
}
