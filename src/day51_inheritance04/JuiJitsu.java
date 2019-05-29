package day51_inheritance04;

public class JuiJitsu extends Exercise{
	@Override
	public int perform(int minutes) {
    	int Totalcal = 12*minutes;
    	System.out.println("Doing JuiJitsu");
    	return Totalcal; 
    }
}
