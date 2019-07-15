package day55_abstraction;

public class Cat extends Mammal{

	public Cat(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		
		System.out.println("meooooow...");
	}

	@Override
	public void eat() {
		System.out.println(getName()+" eats");
		
	}

	@Override
	public void prdoceAMilk() {
		
		
	}

	
}
