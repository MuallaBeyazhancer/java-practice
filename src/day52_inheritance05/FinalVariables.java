package day52_inheritance05;

public class FinalVariables {
	public final int ROADSTER_MAX_RANGE=610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	public final String JAN = "January";
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USER;
	
	static {
		ADMIN_USER = "admin@gmail.com";
		}
	public FinalVariables() {
		MODEL_3_MAX_SPEED = 190; 
		//ADMIN_USER = "admin";
	}
	
	{ MODEL_X_PASSENGERS = 5; }
	

	public static void main(String[] args) {
		final int MAX_PASSENGERS_COUNT = 5;
		//MAX_PASSENGERS_COUNT = 10;
		final double PI = 3.1415926;
		System.out.println(MAX_PASSENGERS_COUNT);
		
		final int SSN;
		SSN = 321456984;
		//SSN++; is not possible
		FinalVariables finalVars = new FinalVariables();
		System.out.println("Max Range for roadster: "+ finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: "+ finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Model X Passenger count: "+finalVars.MODEL_X_PASSENGERS);
		
	   System.out.println(Integer.MAX_VALUE);
	  
	   System.out.println("Company name: "+ COMPANY_NAME);
	   System.out.println("Company name: "+FinalVariables.COMPANY_NAME);
	   System.out.println("Admin: "+ ADMIN_USER);
	}

}
