package day37_arrayList;
import java.util.*;
public class ArrayAsList {

	public static void main(String[] args) {
		List<String> cars = Arrays.asList("Tesla", "Porsche", "Lexus", "Honda");
       
		// declare and add values in single statement
		// Array class
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8); // not modifiable anymore
		System.out.println(nums.size());
		System.out.println(nums.toString());
		
		// create arrayList prices
		//assign values using Arrays.asList method
		List<Double> prices = Arrays.asList(34.3, 52.1, 120.5, 140.5, 520.5,
				                            545.3, 100.2, 700.7, 43.2, 800.0);
				
		
		System.out.println(prices);
		//calculate the sum of all prices
		double sum = 0;
		for(Double price : prices) {
			sum += price;
		}
		System.out.println("Sum: "+sum);
		
		double sum2 = 0;
		for(int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("Sum2: "+sum2);
		
		// create new List expensive 
		// add prices that are more than 100;
		List<Double> expensive = new ArrayList<>();
		for(Double each : prices) {
			if(each > 100.0) {
		     expensive.add(each) ;		
				
			}
			System.out.println("Expensive: "+ expensive);
			//remove all expensive prices from prices
//			prices.removeAll(expensive);
//			
//			System.out.println(prices.toString());
		}
	}

}
