package day08_casting_conditionals;

public class IfElseWithVariables {
	
	public static void main(String[] args) {
		
		int temperature = 45;
		if(temperature >= 65) {
			System.out.println("It is a Nice day! Lets code Java");
			
		}else {
			System.out.println("Stay home and code Java");
		}
		
		//2 int variables, teamAScore, teamBScore
		// put a condition. check if teamA won. 
		
		int teamAScore = 85;
		int teamBScore = 90;
		
		if (teamAScore > teamBScore) {
			System.out.println("Team A won Go team A!");
		}else {
			System.out.println("Team B won IT WAS A DRAW!");
			System.out.println("Go teams!");
		}
		
	}

}
