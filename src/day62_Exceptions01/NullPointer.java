package day62_Exceptions01;

public class NullPointer {
static String name;
	public static void main(String[] args) {
		try {
			System.out.println(name.toUpperCase());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException happened");
			System.out.println("Here is the message: "+e.getMessage());
			System.out.println("Here is the StackTrace");
			e.printStackTrace();
		}

	}
	
	/*
	 * Setproperty Selenium....
WebDriver driver = new ChromeDriver();

driver.get("https://etsy.com");

driver.quit();//close browser and end the session

try{
	driver.get("https://cybertekschool.com");
}catch(NoSuchSessionException e) {
	e.printStackTrace();
	driver = new ChromeDriver();
	driver.get("https://cybertekschool.com");
}
	 */

}
