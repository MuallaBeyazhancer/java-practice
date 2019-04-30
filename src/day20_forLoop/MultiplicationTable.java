package day20_forLoop;
import java.util.*;

public class MultiplicationTable {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number ");
	int num = scan.nextInt();
	if(num<1 || num>10) {
		System.out.println("ERROR: Invalid input");
		return;
		//System.exit(0); stop execution here
	}
	
	for(int i=1; i<=10; i++) {
		int times = num * i;
		System.out.println(num+ "*" + +i+  "= "+ times);
		
	}
	}
}

