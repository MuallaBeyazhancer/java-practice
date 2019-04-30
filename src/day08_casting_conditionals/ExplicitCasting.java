package day08_casting_conditionals;

public class ExplicitCasting {
	public static void main(String[] args) {
		
		System.out.println(10 /2.0); //result is double
		System.out.println(10.0 /2);
		
		int result = (int)(10 / 2.0);
		System.out.println("result: "+result);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		//double average = (double)(rent1+rent2+rent3+rent4) / 4.0;
		double average = (rent1+rent2+rent3+rent4) / 4.0;
		System.out.println("average: "+average);
		
		double d = 40.2;
		int h = (byte)d;
		// in above statemnt both explicit and implicit casting happenning.
		// explicit : bouble > byte ,
		// implicit : byte > int
		
		System.out.println(4+1.0f);
		System.out.println('a'+1);
		System.out.println("1"+2+3);
		System.out.println(5/4);
		
	}

}
