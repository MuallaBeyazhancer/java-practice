package day26_arrays04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {
	public static void main(String[] args) {

		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };
		
		System.out.println(names.length);
		//print all names in single line
		System.out.println(Arrays.toString(names));
		// print in column format
		// 2 names in each line 
		boolean isFemale = false;
		for(int i = 0; i<names.length; i+=2) {
			System.out.println(names[i]+", " +names[i+1]);
					
		}
		System.out.println("********MALE NAMES**********");
		for(int i = 0; i<names.length; i++) {
		if(i % 2 == 0)	{
			if(i == names.length-2) {
			System.out.print(names[i]);
		}else {
			System.out.print(names[i]+ ", ");
		}
		}
		}
		System.out.println();
		System.out.println("************FEMALE NAMES***********");
		for(int j = 0; j<names.length; j++) {
			if(j % 2 != 0)	{
				if(j == names.length-1) {
					System.out.print(names[j]);	
				}else {
				System.out.print(names[j]+ ", ");
			}
			}
			}
			// print random name from this array
		//use random class
			System.out.println("\nRandom Name");
			Random random = new Random();
			int r = random.nextInt(names.length);
			System.out.println("Random name: "+ names[r]);
			//print all names that are up to 4 characters, in uppercase, in same line
			int count = 0;
//			for(String name: names){
//        if(names.length()<=4){
//           System.out.println(name.toUpperCase()+" ")
			for(int n=0; n<names.length; n++) {
				if(names[n].length()<=4) {
					System.out.print(names[n].toUpperCase()+", ");
					count++;
				}
			}
			System.out.println("Names less than 5 characters: " +count);
			System.out.println("\nNames Length sort");
			String namesUpto4 = "";
			String names5to6 = "";
			String names7orMore = "";
			for(String name: names) {
				if( name.length()<=4) {
					namesUpto4 += name+", ";
				}else if(name.length()== 5 ||name.length()== 6 ) {
					names5to6 += name+", ";
				}else if(name.length() >= 7 ) {
					names7orMore += name + ", ";
					
				}
			}
			System.out.println("##names up to 4 characters##: "+namesUpto4.substring(0,namesUpto4.length()-2));
			System.out.println("##names 5 to 6 characters##: "+names5to6.substring(0,names5to6.length()-2));
			System.out.println("##names 7 or more characters##: "+names7orMore.substring(0,names7orMore.length()-2));
		
			System.out.println(Arrays.toString(names));
			//SWAP seats
			//Code Here
			
			for(int i = 0; i<names.length; i+=2) {
				String temp = names[i];
				names[i] = names[i+1];
				names[i+1] = temp;
			}
			System.out.println(Arrays.toString(names));
				
			
			
		}
}
