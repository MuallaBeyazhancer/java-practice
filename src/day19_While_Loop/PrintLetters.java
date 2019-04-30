package day19_While_Loop;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String word = "Amazon";
       int idx = 0;
       
       while (idx < word.length()) {
    	   System.out.println(word.charAt(idx));
    	   idx++;
       }
    // 1 true idx = 0 A
      	//2 true idx = 1 m
	System.out.println("");
      // print each character in reverse order
       int index = word.length()-1;
       while (index >= 0) {
    	   System.out.print(word.charAt(index));
    	   index--;
       }
    	   
	}
}
