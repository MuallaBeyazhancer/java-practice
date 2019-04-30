package march_16_SaturdayHw;
import java.util.Scanner;
public class BurgerOrChicken {
public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	    
	    
	    String in = s.next();
	    
	    //your code here
	    float price;
	if(in.equals("burger") || in.equals("chicken")){
	  price = 10.0F;
	  System.out.println(price);
	}if(in.equals("soda")){
	  price = 2.0F;
	  System.out.println(price);
	}
	  }
	}
