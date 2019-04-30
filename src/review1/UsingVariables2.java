package review1;

public class UsingVariables2 {
	public static void main(String[] args) {
		int num1, num2, num3;
		num1 = 200;
		num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		
		num2 = 400;
		num3 = num1;
		num1 = num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		int apples = 42;
		int kiwis = apples;
		int mangoes = 71;
		kiwis = mangoes;
		
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangoes);
	}

}
