package day07_scanner_operators;

public class EnoughPizza {
	public static void main(String[] args) {
		
		int pizzaCount = 30;
		int studentsCount = 145;
		
		boolean isEnoughPizza = (pizzaCount*8) >= (studentsCount*2);
		
		System.out.println("Is enough pizza: "+isEnoughPizza);
	}

}
