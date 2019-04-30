package day32_methods04;

public class Cooking {
      public static void main(String[] args) {
    	  makePnacakes();
    	  makePasta();
    	  cook("Omelette", "Eggs, Salt, Tomatoes, Green, Peppers, Onions");
    	  
	}
      
      public static void cook(String dish, String ingredients) {
    	  System.out.println("~~" + dish.toUpperCase() + " RECIPE ~~");
    	  add(ingredients);
    	  System.out.println("Cook it until it is cooked");
    	  System.out.println("~~"+dish.toUpperCase()+ " IS READY!~~ ");
    	}
	public static void makePnacakes() {
		System.out.println("~~ PANCAKES RECIPE ~~");
		add("Milk, eggs, Flour, Sugar, Salt");
		mix(120);
		fry(2);
		System.out.println("~~ ENJOY YOUR DELICIOUS PANCAKES ~~");
		
	
	}
public static void makePasta() {
		System.out.println("~~ ITALIAN PASTA RECIPE ~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spaghetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan, Marinara");
		System.out.println("~~ DELICIOUS PASTA INGREDIENTS ~~");
	}
	public static void add(String ingredients) {
		System.out.println("Add "+ingredients);
		
	}
	public static void mix(int seconds) {
		System.out.println("mix for "+ seconds + " seconds");
	}
	 public static void fry(int minutes) {
		 System.out.println("fry for " + minutes +" minutes");
	 }
	 
	 public static void boil(int minutes) {
		 System.out.println("boil for " + minutes+ " minutes" );
	 }
}
