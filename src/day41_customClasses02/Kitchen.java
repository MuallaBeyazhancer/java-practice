package day41_customClasses02;

public class Kitchen {

	public static void main(String[] args) {
		Microwave mic = new Microwave();
         mic.brand = "LG";
         mic.turnOn();
         mic.heat("pizza with mushrooms&anchovy");
         mic.turnOff();
         
	}

}
