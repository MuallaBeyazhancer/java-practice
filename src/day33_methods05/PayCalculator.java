package day33_methods05;

public class PayCalculator {
	public static void main(String[] args) {
		
		System.out.println("Total pay for 40 hours: "+getHourlyPay(0, 80));
	}

	public static int getHourlyPay(int hours, int rate) {
		
		if(hours == 0 || hours < 0) {
			System.out.println("Invalid Hours");
			return 0;  // if it is true exit the method
		}
		if (rate == 0 || rate < 0) {
			System.out.println("Invalid rate");
			return 0;
		}
		int total = hours * rate;
		return total;
	}
}
