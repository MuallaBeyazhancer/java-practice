package day62_Exceptions01;

public class ExceptionInCatch {

	public static void main(String[] args) {
		String str = "10j";  //A
		try {
		int n = Integer.parseInt(str);  //B
		System.out.println(n);  //C
		}catch(NumberFormatException e) {
		System.out.println(str.charAt(10));  //D
		System.out.println("Hello from the Catch Block");  //E
		}finally {
			System.out.println("Hello from the Finally Block"); //F
		}
		System.out.println("BYE BYE!");  //Z

	}

}
