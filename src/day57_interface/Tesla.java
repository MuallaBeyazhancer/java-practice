package day57_interface;

public class Tesla extends Vehicle implements Electric, Autonomous{

	@Override
	public void charge() {
		System.out.println("Tesla is charging at charging station");
		
		
	}

	@Override
	public void selfDrive() {
		System.out.println("Tesla is in auto pilot mode. Driving autonomously.");		
	}

}
