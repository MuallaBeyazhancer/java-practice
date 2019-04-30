package day16_strings_mainpulation;

public class TrimSpaces {

	public static void main(String[] args) {
		
		String word1 = " String methods ";
		System.out.println(word1.trim());
		System.out.println(word1);
		
		
		String word2 = "   ThreeSpaces   ";
		System.out.println(word2.trim());
		word2 = word2.trim();
		System.out.println(word2);
	}
}
