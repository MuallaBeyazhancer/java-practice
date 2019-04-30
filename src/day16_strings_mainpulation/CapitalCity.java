package day16_strings_mainpulation;

public class CapitalCity {

	public static void main(String[] args) {
		
		String str = "Moscow is capital of Russia";
		//Baku, Azerbaijan
		
		str = str.replace("Moscow", "Baku");
		str = str.replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		
		String email = "firstName_LastName@gmail.com";
		String company = "deloitte";
		
		String newEmail =email.replace("gmail",company);
		System.out.println(newEmail);
		
		
	}
}
