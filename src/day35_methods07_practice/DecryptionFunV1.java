package day35_methods07_practice;

public class DecryptionFunV1 {
public static void main(String[] args) {
	
	

	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	String word = "sfobz";
	
	char first = word.charAt(0); //'s'
	int position = encrypted.indexOf(first);
	System.out.println("position: "+position);
	char enChar = alphabet.charAt(position);
	System.out.println(first + "-->"+enChar);
	
	// with a loop
			String decryptedWord = "";
			for(int i = 0; i<word.length(); i++) {
				char ch = word.charAt(i);
				// find in alphabet
				int index = encrypted.indexOf(ch);
				//System.out.print(encrypted.charAt(index));
				decryptedWord += alphabet.charAt(index);
			}
			System.out.println(word);
			System.out.println(decryptedWord);
			
			System.out.println(decryptSentence("nb mzmv rh"));
			System.out.println(decryptSentence("glwzb dzh z tivzg wzb zmw dv xlwvw qzez"));
			System.out.println(decryptSentence("ovgh tl slnv"));
	}
public static char decryptChar(char ch) {
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	return alphabet.charAt(encrypted.indexOf(ch));
	
}

public static String decryptWord(String word) {
	String cyphered = "";
	for(int i = 0; i< word.length(); i++) {
		cyphered += decryptChar(word.charAt(i));
	}
	return cyphered;
}



public static String decryptSentence(String sentence) {
	String decryS = ""; 
	String[] sentenceArr = sentence.split(" ");
	for(String each : sentenceArr) {
		decryS += decryptWord(each)+" ";
	}
	return decryS.trim();
	
}



}

	