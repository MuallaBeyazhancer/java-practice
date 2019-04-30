package day27_arrays05;

public class Tools {

	public static void main(String[] args) {
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		
		for(String letters : tools ) {
			switch(letters.toLowerCase()) {
			case "java":
				System.out.println("Java --> programming Language");
				break;
			case "selenium":
				System.out.println("Selenium --> Test Automation");
				break;
			case "testng":
			case "junit":
				System.out.println(letters+ "--> Testing tool");
				break;
			case "cucumber":
				System.out.println("Cucumber --> BDD style testing");
				break;
			case "git":
				System.out.println("Git --> Version Control");
				break;
			case "maven":
				System.out.println("Maven --> Building and execution for project");
				break;
			default:
				System.out.println("Unknown Tool");
				break;
			}
		}
	}

}
