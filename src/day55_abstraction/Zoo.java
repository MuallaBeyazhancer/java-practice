package day55_abstraction;

public class Zoo {
  public static void main(String[] args) {
	//Animal animal = new Animal();
	//because animal is not abstract class
	 // we cannot create an object of this class
	  Cat fluffy = new Cat("Fluffy");
	  fluffy.speak();
	  
	  Dog poohchi = new Dog("Rex");
	  poohchi.speak();
	  poohchi.setName("Poohchi");
	  poohchi.eat();
}
}
