package day20_forLoop;
import java.util.*;

public class WarmUoZombie {
	public static void main(String[] args) {
		
	
	 Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	   
	    int day = 0;
	    
	    while ( inhabitants > 0 ){
	    System.out.println("Day " + day + " ["+inhabitants+"]");
	      inhabitants = inhabitants/2;
	      
	     day++;
	    }
	      System.out.println("---- EXTINCT ----");
	    }
	    
} 
	  
	