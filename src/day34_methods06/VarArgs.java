package day34_methods06;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		printWords("red", "blue");
		printWords("grey");
		printWords(); //empty.So array will be empty array
		String[] myPets = {"cat", "horse", "dog", "sheep", "goat"};
		printWords(myPets);
		
		System.out.println(sum(3,5,7));
		int budget = 200;
		if(sum(10, 45, 110, 30) <= budget){
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		int total = sum(234, 43, 567, 12, 34, 5);
		System.out.println("TOTAL is: "+total);
		
		 cook("Burrito Bowl", "Rice", "Beans", "Sour Cream", "");
		 cook("Avocado Toast", "Avocado", "Sunny side eggs", "Wheat bread");
		 shoppingList(1000, "Avocado Toast", "Swatch watch", "Shoes");
	}
    public static void printWords(String... words) {
    	//handle it like an ARRAY
    	for(String w : words) {
    		System.out.println(w);
    	}
    }
    public static int sum(int... nums) {
    	int sum = 0;
    	for(int n : nums) {
    		sum += n;
    	}
    	return sum;
    }
    public static void cook(String name, String... ings) {
    	System.out.println("Food: "+ name);
    	System.out.println(Arrays.toString(ings));
    }
    public static void shoppingList (int totalPrice, String... items ) {
		System.out.println("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	}
    
}
