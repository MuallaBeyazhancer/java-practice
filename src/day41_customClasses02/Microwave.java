package day41_customClasses02;

public class Microwave {
   String brand;
   boolean isOn;  // false
   
   public void turnOn() {
	   if(isOn) {
		   System.out.println(brand+" microwave is already on");
	   }else {
		   System.out.println("Turning on "+brand+ " microwave");
		   isOn = true;
	   }
   }
   public void turnOff() {
	   if(!isOn) {
		   System.out.println("It is already off");
	   }else {
		   System.out.println("Turning off "+brand+ " microwave");
		   isOn = false;
	   }
   }
   public void heat(String food) {
	   if(isOn) {
		   System.out.println("Heating the "+food);
	   }else {
	  
		   System.out.println("Microwave is OFF cannot heat "+food);
	   }
   }
}
