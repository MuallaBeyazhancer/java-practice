package day26_arrays04;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
	
	String words = "java,kava,html,selenium";
	String[] myWords = words.split(",");
	
	System.out.println("Count"+myWords.length);
	System.out.println(Arrays.toString(myWords));
	
	for(String letters: myWords) {
		System.out.print(letters+ " ");
	}
	System.out.println();
	String diceResult = "1 - 20 of 1,461 positions";
	//using split method, print 1,461
	String[] diceResult1 = diceResult.split(" ");
	System.out.println("Search result total: "+ diceResult1[4]);
	
	String[] diceResult2 = diceResult.split(" of ");
	System.out.println(diceResult2[0]);
	System.out.println(diceResult2[1]);
	
	
	String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
	String[] allWords = sentence.split(" ");
	String[] sentence1 = sentence.split("happy");
	String[] sentence2 = sentence.split("I");
	
	System.out.println("******** all words *******");
	for(String all: allWords) {
		System.out.println(all);
	}
	
	System.out.println("******* happy split ********");
	for(String happy : sentence1) {
		System.out.println(happy);
	}
	System.out.println("******* I split *******");
	for(String I : sentence2) {
		System.out.println(I);
	}
	
	System.out.println("##############");
	String word = "java";
	char[] charsArray = word.toCharArray();
	for(char charsArray1 :charsArray ) {
		System.out.println(charsArray1);
	}
	
	
}
}
