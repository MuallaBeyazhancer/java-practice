package day22_Loop_Practice2;
import java.util.*;

public class Factorial_92 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int factorial = 1;
	    
	    for( int i = 1; i <=n  ; i++){
	    	
	      factorial = i* factorial;
	      
	    }
	    System.out.println(factorial);
	  }
	}