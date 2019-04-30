package day33_methods05;

public class AgeCalculator {
	public static void main(String[] args) {
		System.out.println("Age is: "+ calculateAge(2020));
		int age = calculateAge(2025);
		System.out.println(age);
		
	}
    public static int calculateAge(int year) {
    	int currentYear = 2019;
    	int age = 2019 - year;
    	
    	if (age >=1 && age <= 14) {
    		System.out.println(age+ " is Children");
    	}else if(age >=15 && age <= 24) {
    		System.out.println(age+ " is Youngsters");
    	}else if(age >= 25 && age <= 64) {
    		System.out.println(age+" is Adult");
    	}else if(age >= 64) {
    		System.out.println(age+ " is Seniors");
    	}else {
    		System.out.println(age+ "is Invalid Age");
    		return 0;
    	}
    	return age;
    }
}
