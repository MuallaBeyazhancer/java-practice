package day28_multid_arrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		String sentence = "You love java";
		
		String[] sentenceArr = sentence.split(" ");
		System.out.println(sentenceArr.length);
		System.out.println(Arrays.toString(sentenceArr));
		
		String reversed = "";
		for(int i = sentenceArr.length-1; i>=0; i-- ) {
			reversed += sentenceArr[i]+" ";
		}
		reversed = reversed.trim();
       System.out.println(reversed); 
		
	}

}
