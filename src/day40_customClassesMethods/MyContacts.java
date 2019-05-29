package day40_customClassesMethods;

public class MyContacts {
	public static void main(String[] args) {
		
		//Create Contact Object
		Contact mualla = new Contact();
		mualla.name = "Mualla Beyazhancer";
		mualla.phoneNumber = "(857)294-3324";
		mualla.email = "beyazhancer3@gmail.com";
		
		mualla.call();
		mualla.sendMessage();
		mualla.sendEmail();
		System.out.println();
		
		Contact orhan = new Contact();
		
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "(571)991-3322";
		orhan.email ="orhan@google.com";
		
		System.out.println("Name: "+orhan.name);
		System.out.println("PhoneNumber: "+orhan.phoneNumber);
		System.out.println("Email: "+ orhan.email);
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
		
		mualla.call();
		
		
	}
}
