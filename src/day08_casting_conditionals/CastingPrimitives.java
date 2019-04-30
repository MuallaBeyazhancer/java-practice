package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		
		//cast double value to int
		int i = (int)3.4;
		System.out.println("i: "+i);
		
		double price =230.50;
		int dollars = (int)price;
		System.out.println("price: "+price);
		
		System.out.println("dollars: "+dollars);
		
		//whole number. Byte, Short, int
		int count = 44;
		byte byteCount = (byte)count;
		
		System.out.println("count: "+count);
		System.out.println("byteCount: "+byteCount);
		
		long longValue = 345645L;
		int intValue = (int)longValue;
		System.out.println("Int Value:" + intValue);
		
		int result = (int)(500.4 / 2.0);
		System.out.println("Result: "+ result);
		
		byte b = 123;
		int z = b;  // it will aotomatically cast it. no need to put (int). (int) will also work
		
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
