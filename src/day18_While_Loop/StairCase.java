package day18_While_Loop;

public class StairCase {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 */
		String stairs = "*";
		// 1) with a counter
		//int num = 1;
		//while(num <= 10) {
		//stairs = stairs + "*";
		//System.out.println(stairs);	
		//num++;
		//}
		// 2) checking length(
		while(stairs.length() <= 10) {
			System.out.println(stairs);
			stairs += "*";	
		}
		
	}
}
