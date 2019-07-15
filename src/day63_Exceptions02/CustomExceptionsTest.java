package day63_Exceptions02;

public class CustomExceptionsTest {

	public static void main(String[] args) {
		double balance = 2000;
		double transaction = 210;
		
		if(transaction > balance) {
			throw new InsufficientFundsException();
		}else {
			System.out.println("Purchase Successful");
			balance-=transaction;
		}

	}

}
