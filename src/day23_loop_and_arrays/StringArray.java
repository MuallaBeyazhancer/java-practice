package day23_loop_and_arrays;

public class StringArray {
	public static void main(String[] args) {
	String[] words = new String[5];
	String[] words2 = {"Shaun", "Roman", "Vlad", "Burak", "Maria"};
	
	System.out.println(words2[0]);
	System.out.println("Number of items: "+ words2.length);
	String[] countries = {};
	
	//Array has fixed size
	countries[0] = "USA";
	String[] fruits = new String[] {"apples" , "orange"};
	// for each loop stands for collection of data
	// we need specify data type, variable name: our collection of data
	//for each loop
	// or enhanced loop
	for(String fruit: fruits ) {
		System.out.println(fruits);
	}
	
}
}
