package day57_interface;

public interface Electric {
	public static final boolean HAS_BATTERIES = true;
	int MAX_BATTERIES = 100_000; // automotically public static final
	
	public abstract void charge();
	
}
