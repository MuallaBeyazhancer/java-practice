package day50_inheritance03;

public class App {
private String name;
private String developer;
public static int count;

public static void build(String language) {
	System.out.println("Building app using "+ language);
}

public App(String name) {
	this.name = name;
	
}
public String getName() {
	return name;
}
}
