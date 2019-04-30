package day20_forLoop;

public class CountHowMany {
public static void main(String[] args) {
	
	String word = "Computer programming";
	char myChar = 'g';
	int counter = 0;
	
	for ( int i= 0; i< word.length(); i++) {
		if( word.charAt(i) == myChar) {
			counter++;
			
		}
	}
	   System.out.println("Count: " + counter );
}
}
