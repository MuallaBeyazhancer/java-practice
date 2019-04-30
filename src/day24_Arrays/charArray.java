package day24_Arrays;

public class charArray {
	public static void main(String[] args) {

		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.println(value);
		}
		String str = "Wooden spoon";
		// this method to CharArray( converts string into array of characters
		char[] chars = str.toCharArray();
		for (char c : chars) {
			System.out.print(c);
		}
		System.out.println();
		str = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
			// print characters with help of array of characters one by one
			// if character is equal to 'o' replace it with '*'
		}

		System.out.println();

		for (char c : chars) {
			if (c == 'o') {
				System.out.print("*");
			} else {
				System.out.print(c);
			}

		}
		char[] ch = new char[3];
		System.out.println("Value of char: "+ch[0]);
		
	}
}
