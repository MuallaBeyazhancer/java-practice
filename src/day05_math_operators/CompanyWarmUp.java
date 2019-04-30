package day05_math_operators;

public class CompanyWarmUp {
public static void main(String[] args) {
	String companyName = "Facebook";
	String address = "Silicon Valley, CA";
	int numberOfEmployees = 10000;
	long revenue = 4000000L;
	boolean isTechCompany = true;
	
	
	System.out.println("Company name is "+companyName);
	System.out.println("Address is "+address );
	System.out.println("Number of employees is "+numberOfEmployees);
	System.out.println("Annual revenue is "+revenue);
	System.out.println("Is it tech company? "+isTechCompany);
	System.out.println();
	
	String aboutCompany = "Company "+companyName+" is located in "+address+"\n\tand "+numberOfEmployees+" people working for it. Its revenue is "+revenue+" and it is a tech company.";
	System.out.println(aboutCompany);
	
	String str = "";
	int num1 = 10;
	int num2 = 20;
	System.out.println(num1+str+num2);
}
}
