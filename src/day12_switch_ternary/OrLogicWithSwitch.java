package day12_switch_ternary;

public class OrLogicWithSwitch {

	public static void main(String[] args) {
		
		char grade = 'F';
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':
			System.out.println("Fail");
		    break;
		 default:
			 System.out.println("Invalid Grade");
			
		}
	}
}
