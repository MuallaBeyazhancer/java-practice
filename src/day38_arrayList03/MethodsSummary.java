package day38_arrayList03;

import java.util.*;

public class MethodsSummary {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		// add method toe add a new value
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		// add method with index: "yellow will be placed to index 0"
		list1.add(0, "yellow");

		// toString method to print all Values in same line
		System.out.println(list1.toString());
		// size method
		System.out.println("Number of elements: " + list1.size());
		// get method
		System.out.println("3: " + list1.get(3));
		System.out.println("0: " + list1.get(0));

		// remove using index
		list1.remove(0); // removes yellow
		System.out.println(list1);

		// remove using value/element. removes element first occurence
		list1.remove("blue");
		System.out.println(list1);

		// set(index, value) replace certain index with new value
		list1.set(0, "orange"); // red will be replaced by orange
		System.out.println(list1);

		// indexOf(value). returns indexof value in the list
		System.out.println("grey: " + list1.indexOf("grey"));

		System.out.println("green: " + list1.indexOf("green"));

		// isEmpty
		System.out.println("is list Empty? - " + list1.isEmpty());
		System.out.println("is list Empty? - " + (list1.size() == 0));

		// contains(element) ==> returns true if value is present
		System.out.println("white in list?  - " + list1.contains("white"));

		List<String> list2 = new ArrayList<>();
		// AddAll -> adds all values from one list into another
		list2.addAll(list1);
		System.out.println("list2: " + list2.toString());

		// containsAll
		System.out.println("containsAll: " + list1.containsAll(list2));

		// equal(list)
		System.out.println("equals: " + list2.equals(list1));

		list2.add("pink");

		// removeAll removes all matching values from your list that are in other array

		list2.removeAll(list1);
		System.out.println("list2 after removeAll: " + list2);

		// addAll(index, list) adds a new list values starting from
		// given index
		list2.addAll(0, list1);
		System.out.println("list2 after addAll: " + list2);

		list1.clear();
		list2.clear();
		System.out.println("both empty? -" + (list1.isEmpty() && list2.isEmpty()));
		

	}

}
