package day22_Loop_Practice2;
import java.util.*;

public class HTML_94 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
   // String html = scan.nextLine();
  String html ="<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"mynewid\"></p></body></html>";
  if(!html.contains("<html>")){
    System.out.println("Invalid input!");
  }else {
    String myId = html.substring(html.indexOf("\"")+1, html.lastIndexOf("\""));
    System.out.println(myId);
  }
  }
}