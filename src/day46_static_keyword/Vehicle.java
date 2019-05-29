package day46_static_keyword;

public class Vehicle {
	String type; // instance variable, every object has its own type
	static int numberOfVehicles;// shared, one central value

	public static void vehicleInfo() {
    // System.out.println("type: "+type);< will not compile. data type is non-static>
	System.out.println("Number Of Vehicles: "+numberOfVehicles);
	int count = getNumberOfVehicles();
		String make = "Kia";
		make = make.toUpperCase();
		System.out.println("Make: "+make);
		//System.out.println(toString()); static cannot reach non-static method
		//Vehicle vh = new Vehicle();
		//vh.toString();
	}
	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}
	public String toString() {
		return "Vehicle type: "+type+" | count"+numberOfVehicles;
	}
}
