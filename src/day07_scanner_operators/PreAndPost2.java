package day07_scanner_operators;

public class PreAndPost2 {
	
	public static void main(String[] args) {
		
		int messages = 10;
		messages++;
		++messages;   // stand alone statements
		System.out.println("Messages: "+messages);
		
		int readMessages = --messages;
		System.out.println("ReadMessages: "+readMessages);   //11
		System.out.println("Messages: "+messages);     //11
		
		int unreadMessages = readMessages--;
		System.out.println("unreadMessages: "+unreadMessages);
		System.out.println("readMessages: "+readMessages);
		
		int total = unreadMessages++ - readMessages--;
		System.out.println("unreadMessages: "+unreadMessages);
		System.out.println("readMessages: "+readMessages);
		System.out.println("total: "+total);
		
		int count = 20;
		int count2= 10;
		      //30         // 21      //9
		int totalCount = ++count + --count2;
				System.out.println("count: "+count);
		System.out.println("count2: "+count2);
		System.out.println("totalCount: "+totalCount);
		             //21        // 23
		int myCount = count++ + ++count;
		System.out.println("myCount: "+myCount);
		System.out.println("count: "+count);
		
		
		
		
		
		
		
		
		
	}

}
