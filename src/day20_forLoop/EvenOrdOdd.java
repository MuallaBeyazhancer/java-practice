package day20_forLoop;

public class EvenOrdOdd {
public static void main(String[] args) {
	int evenSum = 0;
	for( int i = 1; i <= 100; i++) {
		if( i % 2 == 0) {
		System.out.print(i+ " ");
		evenSum = evenSum + i; 
		}
	}
	System.out.println("Sum of Even number: "+evenSum);
	System.out.println();
	
	int oddSum = 0;
	for ( int i = 1; i <= 100; i++) {
		if( i % 2 == 1) {
		System.out.print(i+ " ");
		oddSum = oddSum + i;
		}
	}
	System.out.println("Sum of odd numbers: "+ oddSum);
	
}
}
