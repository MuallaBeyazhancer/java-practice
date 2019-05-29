package day36_wrapperclasses_arraylistintro;
import java.util.*;

public class ArrayListIntro {
  public static void main(String[] args) {
	//Create an ArrayList 
	 ArrayList<String> names = new ArrayList<>();
	 
	 //ArrayList<int> nums = new ArrayList<>(); takes only object
	ArrayList<Integer> nums = new ArrayList<>();
	
	// How to assign values into ArrayList
	names.add("Roman");
	names.add("Orhan");
	names.add("Vlad");
	names.add("Olimjon");
	names.add("Natalia");
	names.add("Maria");
	
	nums.add(4);
	nums.add(100);
	nums.add(99);
	nums.add(656);
	nums.add(8566);
	// read from ArrayList
	System.out.println(names.get(0));
	System.out.println(names.get(1));
	System.out.println(names.get(2));
	
	System.out.println("nums count: "+nums.size());
	System.out.println("Names count: "+ names.size());
	
	
	
}
}
