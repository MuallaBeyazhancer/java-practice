package day51_inheritance04;

public class Yoga extends Exercise{
	@Override
	public int perform(int minutes) {
    	int Totalcal = 5*minutes;
    	System.out.println("Doing Yoga");
    	return Totalcal; 
    }
}
