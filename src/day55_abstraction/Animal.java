package day55_abstraction;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public abstract void speak();// we cannot have abstract method in regular classes
	// dog speaks: woof woof
	//cat speaks: meow meow
	// pig speaks: oink oink
	public abstract void eat();
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


