package day57_interface;

public class Cat implements Pet, Callable{

	@Override
	public void respond() {
		System.out.println("Cat is reponding meoww meoww");
		
	}

	@Override
	public void keepAsPet() {
		System.out.println("Cat is kept inside home");
		
	}

}
