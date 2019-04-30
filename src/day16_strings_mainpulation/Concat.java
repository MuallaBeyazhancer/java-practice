package day16_strings_mainpulation;

public class Concat {
public static void main(String[] args) {
	
	String word = "java";
	System.out.println(word.concat("+selenium"));
	System.out.println(word.concat(" in eclipse"));
	
	System.out.println(word);
    
	word = word.concat("+eclipse");
    System.out.println(word);
    
    word = word.concat(" Automation");
    System.out.println(word);
    
    word = word +"-Cucumber";
    System.out.println(word);
    
    word = word.concat("123");
    System.out.println(word);
    
    word = word + true;
    System.out.println(word);
    
    
    String word2 = "Hi";
    word2 = word2.concat("-hey").concat("-how are you").concat("-good");
    System.out.println(word2);
    
}
}
