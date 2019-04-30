package day24_Arrays;

import java.util.Arrays;

public class SumOfTHeNumbers {
	public static void main(String[] args) {

		//lets create an array of length 3
		int[] numbers = new int[3];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;
		// [I@4d591d15 this is hash code
		System.out.println(numbers);
		// toString() method from arrays class can help us to print array as string
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		// please use for loop in order to loop through the array
		//and calculate sum of all elements
		// numbers.length is final instance variable -->returns number of elements in the array
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			
		}
		System.out.println("Sum: "+sum);
		// find the biggest value in the array
		int max = Integer.MIN_VALUE;
		for(int j = 0; j<numbers.length; j++) {
			if(numbers[j] > max) {
				max = numbers[j];
			}
			
		}
		System.out.println("Largest number in the array: "+max);
		
		int min = Integer.MAX_VALUE;
		for(int num = 0; num < numbers.length; num++ ) {
			if(numbers[num] < min) {
				min = numbers[num];
			}
		}
		System.out.println("Smallest number in the array: "+min);
		
		
		
	}
}
