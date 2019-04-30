package march_16_SaturdayHw;
import java.util.Scanner;
public class MediumNumber {
public static void main(String[] args) {
	 //WRITE YOUR CODE HERE
    Scanner scan = new Scanner(System.in);
    int num1, num2, num3; 
        System.out.println("Enter first number:");
    num1 = scan.nextInt();
        System.out.println("Enter second number:");

    num2 = scan.nextInt();
       System.out.println("Enter third number:");

    num3 = scan.nextInt();
    
    
    if(num1>num2 && num2>num3 || num2>num1 && num2<num3){
      System.out.println("Medium value is: "+num2);
    }else if(num2>num1 && num1>num3 || num1>num2 && num1<num3){
       System.out.println("Medium value is: "+num1);
    }else 
      System.out.println("Medium value is: "+num3);
    
  }

}  

	