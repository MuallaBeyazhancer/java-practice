package day15_strings_mainpulation;

public class IndexOf {
public static void main(String[] args) {
	            //  012345
	String word1 = "github";
	System.out.println(word1.indexOf('g'));
	System.out.println(word1.indexOf("th"));
	System.out.println(word1.indexOf("hub"));
System.out.println(word1.indexOf("java"));
   // char first = word1.charAt(0);
   // char second = word1.charAt(1);
   // System.out.println(first + second);

     String url = "www.okta.com";
     int i = url.indexOf(".");
     System.out.println("Position of . : "+ i);
     System.out.println(url.charAt(i+1));
     
     String title = "Java - Google Search";
     int dash = title.indexOf("-");
     System.out.println(dash);
     
     
    	 System.out.println( title.charAt(dash - 2));
     
    	 System.out.println(title.charAt(dash + 2));
    
     
     String country ="United States of America";
     int states = country.indexOf("States");
     System.out.println("Position of States: "+states);
     
     String word2 = "java, c++, python, tomcat, eclipse";
     if(word2.contains("c++")) {
    	 System.out.println("c++ is there");
     }else {
    	 System.out.println("c++ is not there");
     }
     
     if(word2.indexOf("c++")> -1) {
    	 System.out.println("c++ is there");
     }else {
    	 System.out.println("c++ is not there");
     }   
}
}
