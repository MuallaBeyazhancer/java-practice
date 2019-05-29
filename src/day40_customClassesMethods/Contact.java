package day40_customClassesMethods;

public class Contact {
 String name;
 String phoneNumber;
 String email;
 
 
 public void call() {
		System.out.println("Calling "+ name +"....");
	}
 public void sendMessage() {
	 System.out.println("Sending message "+ phoneNumber + " | name: "+ name+ "....");
 }
 public void sendEmail() {
	 System.out.println("Sending email: "+ email);
 }
}
