package day28_multid_arrays;

import java.util.Arrays;

public class FootballTeams {

	public static void main(String[] args) {
		// declare multiD Array with 2 rows and 6 cols
		String[][] teams = new String[2][6];
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjan";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dimitry";
		
		System.out.println("First player of first team:");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]); //Habib
		System.out.println(teams[1][5]);
		
		//print how many rows/teams/arrays
		System.out.println("Number of teams: "+ teams.length);
		System.out.println("People in first team: "+ teams[0].length);
		System.out.println("People in second team: "+ teams[1].length);
	
	    System.out.println(Arrays.deepToString(teams));
	    
	    int[][] cities = new int[3][4];
	    cities[0][0] = 100; 
	    cities[0][1] = 500;
	    cities[0][2] = 1234;
	    cities[0][3] = 5434;
	    
	    cities[1][0] = 54544;
	    cities[1][1] = 64546;
	    cities[1][2] = 257776;
	    cities[1][3] = 999776;
	    
	    cities[2][0] = 54343;
	    cities[2][1] = 145463;
	    cities[2][2] = 28976;
	    cities[2][3] = 112776;
	    
	    System.out.println(Arrays.deepToString(cities));
	    System.out.println(Arrays.toString(cities[0]));
	    
	    int[][] scores = { {3,5,10} , {6,4,2,10} };
	    System.out.println("Days played/Number of arrays:" + scores.length);
	    System.out.println("Number of values in 1st: "+ scores[0].length);
	    System.out.println("Number of values in 2nd: "+ scores[1].length);
	    
	    System.out.println();
	    
	    int[][] values = new int[4][];
	    values[0] = new int[] {34,23,5};
	    values[1] = new int[] {34,45,6,5,7,3,234,345,67};
	    
	    values[2] = new int[2];
	    values[2][0] = 55; values[2][1] = 88;
	    
	    values[3] = new int[] {5,12,23,4,23};
	    
	    System.out.println("Length of multiD Array: "+ values.length);
	    
	    System.out.println("Length of Array 1: "+values[0].length);
	    System.out.println("Length of Array 2: "+values[1].length);
	    System.out.println("Length of Array 3: "+values[2].length);
	    System.out.println("Length of Array 4: "+values[3].length);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
