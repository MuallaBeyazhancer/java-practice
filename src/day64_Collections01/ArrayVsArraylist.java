package day64_Collections01;
import java.util.*;
public class ArrayVsArraylist {

	public static void main(String[] args) {
		//Arrays are fixed size
		int[] numsArray = {30, 50, 5011, 30, 5, 5};
		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		
		
		//ArrayList
		List<Integer> numsList = new ArrayList<>();//polymorphic way more common
		//ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(100);
		numsList.add(44);
		numsList.add(44);
		
		System.out.println(numsArray[0]);
		System.out.println(numsList.get(0));
		
		System.out.println(Arrays.toString(numsArray));
		System.out.println(numsList);
	}

}
