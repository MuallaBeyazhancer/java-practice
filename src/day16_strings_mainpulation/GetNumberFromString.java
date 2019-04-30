package day16_strings_mainpulation;

public class GetNumberFromString {

	public static void main(String[] args) {
	String sentence = "I wrote [236] lines of code today";
	
	int start =sentence.indexOf('[')+1;
	int end   = sentence.indexOf(']');
	
	String codeCount = sentence.substring(start, end);
	System.out.println("Lines of code: "+codeCount);
	//String number = sentence.substring(9,12);
	//System.out.println(number);
	
	System.out.println("Lines of code: "+ sentence.substring(sentence.indexOf('[')+1,sentence.indexOf(']')));
	
	// Check if codeCount is more than 10
	int count = Integer.parseInt(codeCount);
    if(count > 20) {
		System.out.println("Wrote more than 20 lines of code today!!!");
	}else {
	    System.out.println("Not enough coding for today");
	
		
	}
	
}
	}	

