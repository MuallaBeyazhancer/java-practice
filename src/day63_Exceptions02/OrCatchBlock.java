package day63_Exceptions02;

public class OrCatchBlock {
public static void main(String[] args) {
	String str = "abc";
	try {
	//System.out.println(str.charAt(10));
	String str2 = null;
	System.out.println(str2.toUpperCase());
	}catch(IndexOutOfBoundsException | NullPointerException e) {
		System.out.println("Exception is happened");
	}
}
}
