package day24_Arrays;
import java.util.*;

public class ArraysPrintingReplit_100 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String[] arr = new String[5];
	for (int i=0;i<5;i++)
	{
		arr[i] = input.nextLine();
	
	//leave above alone!  write your code below
	String words = arr[i].substring(0,3);
	System.out.println(words);
	}
}
}