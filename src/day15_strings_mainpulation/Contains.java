package day15_strings_mainpulation;

public class Contains {
public static void main(String[] args) {
	
	String email = "test@gmail.com";
	System.out.println(email.contains("@"));
	
	
	
	String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
	if (list.contains("apples")) {
	    System.out.println("Apples are there");
    }else {
	    System.out.println("Lets add apples now");
    }
	
	boolean hasEggs = list.contains("eggs");
	if(hasEggs) {
		System.out.println("Eggs are there");
	}else {
		System.out.println("Let's add eggs now");
	}
	
	boolean hasCucumber = list.contains("cucumbers");
	System.out.println("Contains cucumbers: "+hasCucumber);
	
	email = "name@yahoo.com";
	
	if(email.contains("@yahoo")) {
		System.out.println("Yahoo account");
	}else if (email.contains("2gmail")) {
		System.out.println("Gmail account");
	}else if (email.contains("@hotmail")) {
		System.out.println("Hotmail account");
	}
	String etsyTitle = "Wooden spoon | Etsy";
	if(etsyTitle.contains(" | ")) {
		System.out.println("Pipe is there as expected");
	}else {
		System.out.println("Pipe is not detected");
	}
	String name = "Mualla Beyazhancer";
	if(name.contains("a") || name.contains("e")) {
		System.out.println("'a' or 'e' is present");
	}else {
		System.out.println("'a' or 'e' is missing");
	}
	
}
}