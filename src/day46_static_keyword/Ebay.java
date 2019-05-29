package day46_static_keyword;

public class Ebay {
public static void main(String[] args) {
	Customer cm1 = new Customer("Abdallah Aleies", "AbdallahAleies@gmail.com");
	Customer cm2 = new Customer("Adilet Kyrgyz", "adilet@yahoo.com");
	Customer cm3 = new Customer("Anastasiia Zasibna", "anastasiia@outlook.com");
	
	System.out.println(cm3.count);
	System.out.println(Customer.count);
	Customer cm4 = new Customer("Burak Ucal", "burak@yahoo.com");
	System.out.println("Total Customers: "+Customer.count);
	cm1.count = 10;
	System.out.println(cm3.count);
	
}
}
