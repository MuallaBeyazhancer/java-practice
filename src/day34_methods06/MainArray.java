package day34_methods06;
import java.util.*;
public class MainArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
     int [] nums = CountArray.getArray();
     System.out.println(Arrays.toString(nums));
	
    // for(;;) {// while(true) ==> both ar infinite loop
	int[] r = CountArray.getRandomArray(10);
	System.out.println(Arrays.toString(r));
	
	//}
	}
}
