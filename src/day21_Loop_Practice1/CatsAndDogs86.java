package day21_Loop_Practice1;
 
import java.util.*;
public class CatsAndDogs86 {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    
     //  word =word.replaceAll("#", "").replaceAll("!", "");
    //   word =word.replaceAll("cat", "#").replaceAll("dog", "!");
	    
       for (int i =0; i < word.length()-2; i++) {
	    String list =(""+word.charAt(i))+ (""+word.charAt(i+1))+(""+word.charAt(i+2));
	    	if(list.equals("cat")) {
	    	countOfCats+=1;
	    
	    	 }else if(list.equals("dog")) {
	    		 countOfDogs+=1;
	    	 }
	    	
	    }
       System.out.println(countOfDogs == countOfCats);
}
}

	    