package day20_forLoop;

public class IndexOf {

	public static void main(String[] args) {
		String word = "Amazon";
		word = word.toLowerCase();
		char letter = 't';
		System.out.println(word.indexOf(letter));
		
	   int index = -1;
	   //using for loop  - look for the letter
	   // if it matches assign value to index
	   //exit for loop
	   //print value of the index
	   for( int i = 0; i < word.length(); i++) {
		   if( word.charAt(i) == letter) {
			   index = i;
			   break;//exit loop	 	   
		   }
	   }
	   System.out.println("index: "+index);
	}
}
