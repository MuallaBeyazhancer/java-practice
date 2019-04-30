package day20_forLoop;

public class ForLoop1 {
public static void main(String[] args) throws InterruptedException {
	
	//Using for loop print "Love Java!" 10 times
	for ( int i= 1; i<=10; i++) {
		System.out.println("Love Java! " +i);
	}
	
	for (int i = 5; i<=15; i++) {
		System.out.println(i);
	}
	// for loop- print 20-10
	for( int i = 20; i >= 10; i-- ) {
		System.out.print(i+" ");
		Thread.sleep(456);
	}
}
}
