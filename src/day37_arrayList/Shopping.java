package day37_arrayList;

import java.util.*;

public class Shopping {

	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList <> ();
		shoppingList.add("Iron");
		shoppingList.add("Iron Table");
		shoppingList.add("Shoes");
		shoppingList.add("T-shirt");
		shoppingList.add("Jacket");
		shoppingList.add("Instant Pot");
		
		//print number of items
		int count = shoppingList.size();
		System.out.println("Total count: "+ count);
		// print all items in single line 
		System.out.println(shoppingList.toString());
        // print first and last item in single line
		System.out.println(shoppingList.get(0)+" | " + shoppingList.get(count-1));
		
		// remove item from ArrayList
		shoppingList.remove("Iron");
		shoppingList.remove("Instant Pot");
		System.out.println(shoppingList);
		shoppingList.remove(0);
		System.out.println(shoppingList);
		
		for(String item : shoppingList) {
			System.out.println(item);
		}
		
		// remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList);
		System.out.println(shoppingList.toString());
	}

}
