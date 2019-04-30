package day22_Loop_Practice2;
import java.util.*;

public class GetSandwich_95 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     int count = 0;
	     String between = "";
	     for(int i = 0; i< str.length()-4; i++){
	     String breadLetters = str.substring(i, i+5);
          if(breadLetters.equals("bread")) {
           count++;
          }
	       
	     }
	     if(count <= 1){
	         System.out.println("nothing");
	        }else{
	     between = str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread")); 
	      
	        }
	     System.out.println(between);
	     System.out.println(count);
	  }
	}