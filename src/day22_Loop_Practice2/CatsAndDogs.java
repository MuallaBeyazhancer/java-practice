package day22_Loop_Practice2;

public class CatsAndDogs {
	public static void main(String[] args) {
		String str = "mycatyourcat";
        int cats = 0;
        for (int i = 0; i < str.length()-2; i++) {
            String temp = str.substring(i, i+3);
            
            if (temp.contentEquals("cat")) {
                cats++;
            }
        }
            System.out.println("Cat count: " +cats);
    }
}




