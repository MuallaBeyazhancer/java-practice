package day59_polymorphism;

public class PropaneTank implements Flammable{

	@Override
	public void catchFire() {
    System.out.println("Use caution: Propane tank might catch fire");		
	}

}
