package day19_While_Loop;

public class DoWHileRunOnes {
public static void main(String[] args) {
	// in this example  do while loop body will run
	//once then test the condition. then exit the loop,
	//as condition is false
	int count = 10;
	do {
		System.out.println("Count: "+ count);
		count++;
	}while(count <= 5);
}
}
