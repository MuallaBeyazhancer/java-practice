package day24_Arrays;

public class Cities {
	public static void main(String[] args) {
		String[] cities = { "Washington D.C.", "Kiev", "Annandale", "Moscow", "Istanbul", "Baku", "Miami",
				"Silver Spring", "McLean" };
		System.out.println(cities.length);
		// print all cities startswith M;
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}

		}
		//same thing with for each loop
		System.out.println();
		for(String city : cities) {
			if(city.startsWith("M")) {
				System.out.println(city);
			}
		}
	}
}
