package day15_strings_mainpulation;

public class GoogleSearchTest {
public static void main(String[] args) {
	
	String item = "java";
	String pageTitle = item + " - Google Search";
	if(pageTitle.startsWith(item)) {
		System.out.println("PASS: Page Titel check passed");
	}else {
		System.out.println("FAIL: Page title check failed");
	}
	if(pageTitle.endsWith("Google Search")) {
		System.out.println("PASS: Page Titel check passed");
	}else {
		System.out.println("FAIL: Page title check failed");
	}
	
}
}
