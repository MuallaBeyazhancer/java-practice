package day22_Loop_Practice2;
import java.util.*;

public class ParseJSONFile_98 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String json = scan.nextLine();
	String replaceCharacters = json.replace(" ","");
	String replaceQuote = replaceCharacters.replace("\"", "");
   

    int indexFirst = replaceQuote.indexOf("firstName")+10;
    String firstName = replaceQuote.substring(indexFirst,replaceQuote.indexOf(",",indexFirst) );
    System.out.println(firstName);
    
    int indexLast = replaceQuote.indexOf("lastName")+9;
    String lastName = replaceQuote.substring(indexLast,replaceQuote.indexOf(",",indexLast));
    System.out.println(lastName);
 
}
}