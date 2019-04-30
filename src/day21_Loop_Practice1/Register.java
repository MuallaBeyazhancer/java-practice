package day21_Loop_Practice1;
import java.util.*;

public class Register {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("How many items are you purchasing");
	int item = scan.nextInt();
	String itemName;
	double itemPrice;
	double totalPrice = 0.0;
	String itemList = "";
	
	for( int i = 1; i <=item; i++) {
		System.out.println("What is item "+i+"?");
		itemName = scan.next();
		
		System.out.println("How much is "+itemName +"?");
		itemPrice = scan.nextDouble();
		// add itemName to itemList and totalPrice
		itemList = itemList + itemName+", ";
		totalPrice = totalPrice + itemPrice;
	}
	if (itemList.endsWith(",")) {
		itemList = itemList.replace(",", "");
		System.out.println(itemList.replace(",", ""));
	}
	
	System.out.println("Your items: "+ itemList);
	System.out.println("Your total Price: $"+ totalPrice);
}
}
