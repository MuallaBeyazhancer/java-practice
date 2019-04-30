package day_10_logicaloperators_conditionals;

public class LogicalOperator {
	public static void main(String[] args) {
		
		boolean isNiceWeather = true;
		int hourlyRate = 50;
		if (!(hourlyRate>40)) {
			System.out.println("too low");
		}else {
			System.out.println("rate is good");
		}
	}

}
