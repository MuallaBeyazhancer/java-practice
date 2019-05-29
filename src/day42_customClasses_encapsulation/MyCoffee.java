package day42_customClasses_encapsulation;

public class MyCoffee {

	public static void main(String[] args) {
		
		Coffee cf1 = new Coffee();
		cf1.name = "iced caramel macchiato";
		cf1.size = "Grande";
		cf1.price = 4.75;
		cf1.calories = 250;
		cf1.getCoffeeInfo();

		Coffee coffee2 = new Coffee();
		coffee2.setName("JAVA CHIP");
		coffee2.size = "venti";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		
		coffee2.getCoffeeInfo();
		
	   Coffee coffee3 = new Coffee();
	   coffee3.setName("iced coffee");
	   coffee3.setSize("tall");
	   coffee3.setPrice(2.45);
	   coffee3.setCalories(60);
	   coffee3.getCoffeeInfo();
	   
	   Coffee coffee4 = new Coffee();
	   coffee4.setCoffeeInfo("caffe latte", "tall", 3.25, 150);
	   coffee4.getCoffeeInfo();
	   
	  
	   
	}

}
