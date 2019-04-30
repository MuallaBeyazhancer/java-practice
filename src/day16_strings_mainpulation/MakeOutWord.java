package day16_strings_mainpulation;

public class MakeOutWord {
public static void main(String[] args) {
	
	String chars = "{{}}";
	String word = "AUTOMATION";
	
	String result;
	result = chars.substring(0,2) + word + chars.substring(2);
	System.out.println(result);
}
}
