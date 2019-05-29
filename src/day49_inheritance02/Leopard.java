package day49_inheritance02;

public class Leopard extends Animal{
	
	public Leopard() {
		super();//call parent class no-arg constructor
		System.out.println("leopard constructor");
		setType("Leopard");
	}
	public Leopard(String type) {
		super(type);//call Animal(String Type) constructor
		System.out.println("Leopard one-arg constructor");
	}
}
