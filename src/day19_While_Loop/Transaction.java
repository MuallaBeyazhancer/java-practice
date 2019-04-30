package day19_While_Loop;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		int count = 0;
		
		
		while( balance > 0) {
			count++; //increase transaction by 1
        System.out.println("What is transaction #"+count+" amount?"); 
        double transaction = scan.nextDouble();
        //balance = balance - transaction;
        if( transaction > balance) {
        	System.out.println("Your balance is about to be negative due to this transaction");
        	//continue; // go on top of loop right away
        }
        balance -= transaction;
        System.out.println("Current balance: "+ balance);
       }
		
     System.out.println("You have insufficient funds for any more transactions, your balance is " + balance);
     System.out.println("Transactions total count: "+ count);
	}

}
