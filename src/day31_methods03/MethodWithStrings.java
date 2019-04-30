package day31_methods03;

import java.util.Arrays;

public class MethodWithStrings {
     public static void main(String[] args) {
	  countWords("Java is fun");
	  googleSearchResults("About 121,000,000 results (0.75 seconds)");
	  String str = "About 121,000,000 results (0.63 seconds)";
	  googleSearchResults(str);
}
	public static void countWords(String sentence) {
		sentence = "Java is fun";
		String[] arr = sentence.split(" ");
		System.out.println("Words in sentence "+Arrays.toString(arr));
		int count = arr.length;	
		System.out.println("Number of words: "+ count);
		}
	public static void googleSearchResults(String str) {
		
		//System.out.println(str);
		String[] strArr = str.split(" ");
		strArr[1] = strArr[1].replace(",","");
		strArr[3] = strArr[3].substring(1,5);
		
		System.out.println("Results count: " +strArr[1]);
		System.out.println("Time in seconds: " +strArr[3]);
	}
	

}
