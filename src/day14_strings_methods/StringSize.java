package day14_strings_methods;

public class StringSize {
	public static void main(String[] args) {
		
		String str1 = "Good Morning";
		//check if matches "Good Morning" and print match or not Match
		
		// convert to all UpperCase and print
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not match");
		}
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not match - ignore case");
		}
		System.out.println(str1.toUpperCase());
		System.out.println(str1);//
		str1 = str1.toUpperCase();
		System.out.println("After assignment: "+str1);
		
		
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: do not matchs");
		}
		//find out how many characters in the string
		String myName = "Mualla";
		System.out.println(myName.length());
	int length = myName.length();
	System.out.println("My name's length:"+length);
	
	//usernames must be  8
	
	String userName = "Mualla12";
	
	if(userName.length()== 8){
		System.out.println("Valid username");
	}else {
		System.out.println("Invalid username, must be 8 chars");
	}
	String password	= "Mualla34";
	if(password.length() >= 6) {
		System.out.println("Password is good");
	}else {
		System.out.println("Password is too short");
	}
	int passwordLength = password.length();
	if(passwordLength < 6) {
		System.out.println("Invalid Pasword. Too Short");
	}else {
		System.out.println("Valid password, good job");
	}
}	
}
