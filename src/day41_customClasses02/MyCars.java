package day41_customClasses02;

public class MyCars {
public static void main(String[] args) {
	
	Car car1 = new Car();
	
	car1.make = "Ford";
	car1.model = "Fiesta";
	car1.color = "Grey";
	car1.currentSpeed = 55;
	
	car1.printCarInfo();
	car1.showCurrentSpeed(70);
	car1.showCurrentSpeed(35);
	car1.drive();
	System.out.println("before: "+ car1.currentSpeed);
	car1.accellerate(20);
	System.out.println("after: "+car1.currentSpeed);
	
	BMW car=new BMW();
	System.out.println(car.make);
	car.model="740i";
	car.showPrice();
	System.out.println(car.price);
	
	BMW bmw2 =new BMW();
	bmw2.model="X3";
	bmw2.showPrice();
	
	
	
}
}
