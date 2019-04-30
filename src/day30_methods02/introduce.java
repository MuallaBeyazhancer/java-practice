package day30_methods02;

import java.util.*;

public class introduce {
	public static void main(String[] args) {
//	 method name: introduce()
//	params/arg: nothing
//	return type: void
//	it will ask for a name and say Nice to meet you
		introduce();
		introduce();
		rangePrint();
	}

	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, " + name);
	}
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(num1 > num2) {
			for(int i = num1; i>=num2; i--) {
				System.out.print(i+" ");
			}
		}else if (num1 < num2) {
			for(int j = num1; j<= num2; j++) {
				System.out.print(j+" ");
			}
				
		}else {
			System.out.print(num1);
		}
		System.out.println();
		}
	}

