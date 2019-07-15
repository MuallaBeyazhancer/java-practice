package day65_Collections02;
import java.util.*;

public class LoopMap {
public static void main(String[] args) {
	Map<String, String> dataMap = new HashMap<>();
	dataMap.put("Url", "qa3.vytrack.com");
	dataMap.put("userName", "user66");
	dataMap.put("password", "USerUSer123");
	dataMap.put("browser", "chrome");
	dataMap.put("truckDriver", "Roman");
	dataMap.put("storemanager", "John DOe");
	dataMap.put(null, "example");
	
	//keySet -> returns set with all the keys in the map
	//values -> returns list with all the values in he map
	System.out.println("*******KEYS********");
	for(String key : dataMap.keySet()) {
		System.out.println(key);
	}
	System.out.println("**********VALUES**********");
	for(String value : dataMap.values()) {
		System.out.println(value);
	}
	
	//Url  | qa3.vytrack.com
	System.out.println("****KEY | VALUES*****");
	for(String key : dataMap.keySet()) {
	System.out.println(key +" | " + dataMap.get(key));
	}
	Map<Integer, Student> studentsMap = new HashMap<>();
	Map<String, String[]> data = new HashMap<>();
	Map<Integer, List<String[]>> data2 = new HashMap<>();
	Map<String, Map<Integer, City>> data3 = new HashMap<>();
	
}
}
