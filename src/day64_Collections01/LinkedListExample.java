package day64_Collections01;

import java.util.*;

public class LinkedListExample {
public static void main(String[] args) {
	List<Integer> list = new LinkedList<>();
	LinkedList<Integer> list2 = new LinkedList<>();
	
	list.add(50);
	list.add(500);
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	
	System.out.println(list.contains(50));
	list2.add(56);
	list2.add(40);
	list2.add(30);
	
	System.out.println(list2.getFirst());
	System.out.println(list2.getLast());
	list2.addFirst(1);
	list2.addLast(99999);
	System.out.println(list2.toString());
	list2.add(30);
}
}
