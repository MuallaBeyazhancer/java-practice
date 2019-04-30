package day21_Loop_Practice1;
import java.util.*;

public class ShoppinListWithLOOPS_85 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalProce = 0;
		do{
			
		System.out.println("Enter Item"+count+" and its price:");
		item = scan.next();
		price = scan.nextDouble();
		
		System.out.println("Add one more item?");
		countinue = scan.next();
//		     if(countinue.equals("yes")){
//		System.out.println("Enter Item"+count+" and its price:");
//		item = scan.next();
//		price = scan.nextDouble();
		shoppingListReport += "Item"+count+": "+item+" Price: "+ price;
		totalProce += price;
		if (countinue.equals("yes"))
			shoppingListReport+= ", ";
		count++;
//		    }
		}while(count <= 10 && countinue.equals("yes"));
		System.out.println(shoppingListReport);
		  System.out.println("Total price: " + totalProce);
  }
}