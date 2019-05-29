package day39_arrayList04;

import java.util.*;

public class CustomListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
       printList(numsList);
       
       List<Double> m = new ArrayList<>();
       m.add(2.3);
       m.add(4.5);
       
       System.out.println("sum: "+sumList(m));
       
       
       System.out.println(getList(5));
       
       ArrayList<Integer> list = getList(15);
       System.out.println(list.toString());
       
       System.out.println(getRandomList(5));
       
       List<Integer> rList=getRandomList(10);
		Collections.sort(rList);
		System.out.println(rList);
		
		printList( (ArrayList<Integer>) getRandomList(7));
		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("128");
		strNums.add("3");
		
		List<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);

	}
	public static void printList(ArrayList<Integer> nums) {
		for(Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public static double sumList(List<Double> n) {
		
		double sum = 0;
		for(Double num : n) {
			sum += num;
		}
		return sum;
	}
	public static ArrayList<Integer> getList(int size){
	   ArrayList<Integer> newList = new ArrayList<>();
	   for(int w = 1; w <= size; w++) {
		   newList.add(w);
	   }
	   return newList;
	}
	public static List<Integer> getRandomList(int size){
		Random rand = new Random();  // 
		List<Integer> randomList = new ArrayList<>();
		for(int k = 1; k <= size; k++) {
			randomList.add(rand.nextInt(101));
		   }
		   return randomList;
		 
	}
	public static List<Integer> convertToIntList(List<String> strL){
		List<Integer> newList = new ArrayList<>();
		for(String str : strL) {
			newList.add(Integer.parseInt(str));
		}
		return newList;
	}

}
