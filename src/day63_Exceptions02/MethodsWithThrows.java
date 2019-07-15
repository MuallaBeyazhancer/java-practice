package day63_Exceptions02;

public class MethodsWithThrows {
	public static void main(String[] args) throws Exception{
		try {
		playWithMatches();	
		}catch(Exception e) {
		System.out.println("Stop the fire with Fire Extinguisher");	
		}
		playWithMatches();
		playSoccer();
	}
	//THROWS CHECKED EXCEPTION
public static void playWithMatches() throws Exception{
	System.out.println("Playing with matches can cause fire");
	/*
	 * We are calling a method that throws a CHECKED exception
	 * We must either HANDLE or DECLARE for it to compile
	 */
}
   //THROWS UNCHECKED EXCEPTION
public static void playSoccer() throws RuntimeException{
	System.out.println("Playing soccer with friends");
}
//IQ:HOW TO CREATE CUSTOM EXCEPTIONS
//We can create a class that extends RuntimeException or Exception
//to create our custom exceptions/
//How to create en unchecked exception
//

}
