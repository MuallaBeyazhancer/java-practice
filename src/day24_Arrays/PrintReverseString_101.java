package day24_Arrays;

import java.util.Scanner;

public class PrintReverseString_101 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    String subs ="";
    //TODO: Type your code below
    String[] str = sentence.split(" ");
    for(int i = str.length-1; i >= 0; i-- ){
      System.out.println(str[i]);
      
    }
    
  }
}
