package day63_Exceptions02;

public class TryWithFinally {
public static void main(String[] args) {
	try {
		System.out.println("In try Block");
		System.out.println(10/0);
	}finally {
		System.out.println("In Finally");
	}
	
	System.out.println("After try Finally");
}
}
