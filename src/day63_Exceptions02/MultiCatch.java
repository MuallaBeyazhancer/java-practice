package day63_Exceptions02;

public class MultiCatch {
public static void main(String[] args) {
	try {
		System.out.println(0/0);
		String str = null;
		System.out.println(str.length());
		int[] n = {10, 4};
		System.out.println(n[2]);
	}catch(ArithmeticException e) {
		System.out.println("ARITHMETIC EXCEPTION HAPPENED");
	}catch(NullPointerException e) {
		System.out.println("NULLPOINTER EXCETION HAPPENED");
	}catch(RuntimeException e) {
		System.out.println("RUNTIME EXCEPTION HAPPENED"+e.getClass().getSimpleName());
	}finally {
		
	}
}
}
