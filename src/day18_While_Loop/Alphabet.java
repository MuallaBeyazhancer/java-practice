package day18_While_Loop;

public class Alphabet {
    public static void main(String[] args) {
	
    	char letter = 'a';
	while (letter <= 'z') {
		System.out.print(letter+ " ");
		letter++;
	}
	
	System.out.println();
	
	char capitals = 'A';
	while (capitals <= 'Z') {
		System.out.print(capitals+" ");
		capitals++;
	}
	System.out.println();
	
	char lowerCase = 'z';
	while( lowerCase >= 'a') {
		System.out.print(lowerCase+ " ");
		lowerCase--;
	}
	
	System.out.println();
	
	String letters = "";
	char myLetter = 'A';
	
	while (myLetter <= 'Z') {
		letters = letters + myLetter;
		System.out.println(letters);
		myLetter++;
	}
	
	
	
	
	
	
}
}
