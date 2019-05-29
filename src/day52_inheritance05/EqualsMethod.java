package day52_inheritance05;

public class EqualsMethod {
	public static void main(String[] args) {
		Computer computer1 = new Computer("iMac", "Silver");
		Computer computer2 = new Computer("iMac", "Silver");
		Computer computer3 = computer2;//pointing the same object
		
		System.out.println(computer1 == computer2);
		System.out.println(computer1.equals(computer2));
		
		System.out.println(computer3 == computer2);
		System.out.println(computer3.equals(computer2));
		
		String str1 = "java";
		String str2 = new String("java");
		//checking only if str1 and str2 point to same object
		//check memory location
		System.out.println(str1 == str2); // false
		
		//checking the value in the str1 and str2
		//compare values not reference
		System.out.println(str1.equals(str2)); //true
		
	}
}
