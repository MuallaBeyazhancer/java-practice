package day20_forLoop;
import java.util.*;

public class Neighbours {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scan.next();
		//aabcdd
		for ( int i = 0; i < word.length()-1; i++ ) {
			if(word.charAt(i) == word.charAt(i+1)) {
				System.out.println("Beep - " +word.charAt(i));
				
			}
		}
		
	}
}
