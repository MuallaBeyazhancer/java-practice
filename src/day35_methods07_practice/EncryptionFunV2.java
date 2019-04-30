package day35_methods07_practice;

public class EncryptionFunV2 {

	public static void main(String[] args) {
		
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		
		String normal = "sunday";
		String encrypted = encryptWord(normal);
		System.out.println("normal: "+ normal+"\n"+"encrypted: "+encrypted);
		
		System.out.println(encryptSentence("java is fun"));
		System.out.println(encryptSentence("i love java"));
		System.out.println(encryptSentence("wooden spoon"));
		System.out.println(encryptSentence("lets learn together and get offer"));
	}
	
	/*
	 * encryptChar
	 * return type: char
	 * param: char
	 * takes a char and returns encrypted version
	 * encryptChar('a') ==> 'z'
	 */
	
	/*
	 * encryptWord
	 * return type : String
	 * param : String
	 * take a String and returns encrypted version for the whole word
	 * 
	 */
	
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		return encrypted.charAt(alphabet.indexOf(ch));
		
	}
	
	public static String encryptWord(String word) {
		String cyphered = "";
		for(int i = 0; i< word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));
		}
		return cyphered;
	}
	
	/*
	 * encryptSentence
	 * return type: String
	 * param: String sentence
	 * Split the sentence by space and call encryptWord and 
	 * return encrypted sentence
	 * java is fun
	 */
	
	public static String encryptSentence(String sentence) {
		String encryS = ""; 
		String[] sentenceArr = sentence.split(" ");
		for(String each : sentenceArr) {
			encryS += encryptWord(each)+" ";
		}
		return encryS.trim();
		
	}
	
	
	
}
