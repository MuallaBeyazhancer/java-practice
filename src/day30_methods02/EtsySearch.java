package day30_methods02;

public class EtsySearch {
	public static void main(String[] args) {
		navigateToEtsy();
		searchForWoodenSpoon();
		printResults();
	}

	public static void navigateToEtsy() {
		System.out.println("Launch chrome browser");
		System.out.println("Navigate to www.etsy.com");
	}

	public static void searchForWoodenSpoon() {
		System.out.println("Type 'wooden spoon' into search field");
		System.out.println("Click on search Button");
	}

	public static void printResults() {
		System.out.println("wooden spoon (14,720 Results)");
	}
}
