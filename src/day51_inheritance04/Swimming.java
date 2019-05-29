package day51_inheritance04;

public class Swimming extends Exercise{
	@Override
	public int perform(int minutes) {
    	int Totalcal = 11*minutes;
    	System.out.println("Swimming");
    	return Totalcal; 
    }
}
