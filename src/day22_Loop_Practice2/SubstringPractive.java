package day22_Loop_Practice2;

public class SubstringPractive {
public static void main(String[] args) {
	
	String word = "java";
	
	System.out.println(word.substring(0,1));
	System.out.println(word.substring(1,2));
	System.out.println(word.substring(2,3));
	System.out.println(word.substring(3));
	
	int i = 0;
	System.out.println(word.substring(i,i+1));
	System.out.println(word.substring(i+1,i+2));
	System.out.println(word.substring(i+2,i+3));
	System.out.println(word.substring(i+3));
	for(int n = 0; n<=3; n++ ) {
		System.out.println(word.substring(n,n+1));
	}
	for(int n = 3; n >= 0; n--) {
		String letter = word.substring(n,n+1);
		System.out.println(letter);
	}
	int start = 1;
	int end = 5;
	String word2 = "UnitedStates";
	System.out.println(word2.substring(1,5));
}
}
