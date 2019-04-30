package day15_strings_mainpulation;

public class StsrtsEndsWith {
public static void main(String[] args) {
	
	String word1 = "eclipse";
	
	
	System.out.println(word1.startsWith("ecli"));
	System.out.println(word1.startsWith("e"));
	System.out.println(word1.startsWith("eclipse"));
	
	System.out.println(word1.startsWith("EC"));
	System.out.println(word1.endsWith("e"));
	System.out.println(word1.endsWith("ipse"));
	System.out.println(word1.endsWith("eclipse"));
	
	String name = "Dr. Jackson";
	if(name.startsWith("Mr.")) {
		System.out.println("man");
	}else if ( name.startsWith("Mrs.")) {
		System.out.println("woman");
	}else if (name.startsWith("Ms")){
		System.out.println("some woman");
	}else if (name.startsWith("Dr.")){
		System.out.println("Dr man or woman");
	}else 
		System.out.println("Unknown Status");
}


}

