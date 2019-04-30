package day13_ternary_strings_intro;
     import java.util.Scanner;
public class CarSelector {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int carType;
	double averagePrice;
	String carOptions, carOrigin;
	System.out.println("Which type of car you are interested in?");
	
	System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean");
	carType = scan.nextInt();
	averagePrice = 0.0;
	 carOptions = "";
	 carOrigin = "";
	switch(carType) {
	case 1:
		averagePrice = 33000.0;
		carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
		carOrigin = "American";
		break;
	case 2:
		averagePrice = 32000.0;
		carOptions = "Toyota, Mitsubishi, Honda, Scubaru, Mazda";
		carOrigin = "Japenese";
		break;	
	case 3:
		averagePrice = 55000.0;
		carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
		carOrigin = "German";
		break;
	case 4:
		averagePrice = 85000.0;
		carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
		carOrigin = "Italian";
		break;
	case 5:
		averagePrice = 25000.0;
		carOptions = "Kia Hyundai, Daewoo";
		carOrigin = "Korean";
		break;
	default:
			System.out.println("Car type not not available");
	}
	System.out.println("You selected "+carOrigin+ " car and your options are "+carOptions+".");
	System.out.println("Average Price: "+averagePrice);
}
}
