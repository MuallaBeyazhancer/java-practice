package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		
	
	/* 
	 program to tell if you are eligible to vote.
	 votingAge = 18
	 */
   Scanner input = new Scanner(System.in);
   
  
   int votingAge = 18;
   System.out.println("How old are You: ");
   int yourAge = input.nextInt();
   
   int years = yourAge - votingAge;
   if(yourAge>=votingAge) {
	   
	   System.out.println("You are eligible to vote");
	   System.out.println("You have been eligible for "+ years +" years");
   }else {
	   System.out.println("You are not eligible to vote");
	   System.out.println("You still have "+(-years)+" more years");
   }
	
	
	
}
}