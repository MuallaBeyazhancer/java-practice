package day57_interface;

public interface Pet {
	public static final boolean FRIENDLY = true;

	public abstract void keepAsPet();
	
	//After java 8 started to use 
	public default void play() {
		System.out.println("Playing hide-and-seek with a pet");
	}
	
	//static methods in interface are not inherited to other classes
	public static void feed(String food) {
		System.out.println("Feeding a pet with "+food);
	}
	
}
