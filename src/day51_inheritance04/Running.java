package day51_inheritance04;

public class Running extends Exercise{
	@Override
	public int perform(int minutes) {
    	int Totalcal = 10*minutes;
    	System.out.println("Running");
    	return Totalcal; 
    }
}
