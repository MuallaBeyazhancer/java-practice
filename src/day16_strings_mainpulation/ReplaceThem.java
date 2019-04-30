package day16_strings_mainpulation;

public class ReplaceThem {
public static void main(String[] args) {
	
	String sentence = "Coding is fun, it is my hobby!!";
	String withNoSpaces = sentence.replace(" ", "");
	System.out.println(withNoSpaces);
	
	System.out.println(sentence);
	
	sentence = sentence.replace(",", "!!!");
	System.out.println(sentence);
	
	String mixed = "&^@#j$a-v|a@#$";
	
	mixed = mixed.replace("&^@#", "");
	System.out.println(mixed);
	
	mixed = mixed.replace("@#$", "");
	System.out.println(mixed);
	
//	mixed = mixed.replace("$", "");
//	mixed = mixed.replace("-", "");
//	mixed = mixed.replace("|", "");
	
	mixed = mixed.replace("$", "").replace("-","").replace("|", "");
	
	System.out.println(mixed);
	
	mixed = mixed.replace("a", "");
	System.out.println(mixed);
	
	
    String result = "About 115,000,000 results (0.59 seconds) "	;
    
    //result = result.replace("About ", "").replace("results (0.59 seconds)", "");
    result = result.replace("About ", "");
    result = result.substring(0, result.indexOf(" "));
    System.out.println(result);
    
    result = result.replaceFirst(",", "");  // replace first comms
    System.out.println(result);
	
 }
}
