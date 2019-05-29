package day50_inheritance03;

public class TestAnimals {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog  = new Dog();
		Duck duck = new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		System.out.println();
		an.move(120);
		cat.move(34);
		dog.move(56);
		duck.move(21);
		
	}

}
