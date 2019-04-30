package day22_Loop_Practice2;

public class LookForWordInString {
    public static void main(String[] args) {
    	int count1 = 0;
	String sentence = "He said hi, ";
	//print letters in pairs
	for(int n = 0; n<sentence.length()-2; n++) {
	String temp = sentence.substring(n,n+2);
	if(temp.equals("hi")) {
		count1++;
		
	}
	}
	System.out.println("Count: "+ count1);
	int count = 0;
	for(int i = 0; i < sentence.length()-1; i++) {
	String hiWord = (""+sentence.charAt(i))+(""+sentence.charAt(i+1));
	if(hiWord.equals("hi")) {
	System.out.println(hiWord);
		count += 1; 
	}
	}
	System.out.println(count);
	
	
	
	
}
}
