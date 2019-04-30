package day25_arrays03;

public class Population {
	public static void main(String[] args) {

		int[] population = new int[5];
		population[0] = 123422;
		population[1] = 45673434;
		population[2] = 5432227;
		population[3] = 43222;
		population[4] = 234455;
		// int[] population ={123422, 45673434, 5432227, 43222, 234455,}
        System.out.println("City 0 population :"+population[0]);
        System.out.println("City 1 population :"+population[1]);
        System.out.println("City 2 population :"+population[2]);
        System.out.println("City 3 population :"+population[3]);
        System.out.println("City 4 population :"+population[4]);
        
        int idx = 0;
        System.out.println("City 0 population :"+population[idx]);
        idx++;
        System.out.println("City 1 population :"+population[idx]);
        
        String str = "abc";
        System.out.println("City 1 population :"+population[str.length()]);
        
        // String array cities =
        String[] cities = {"Miami", "London", "Tokyo", "Rome", "New York"};
        
        // population of miami 123422
        
        System.out.println("Population of "+cities[0]+" is "+ population[0]);
        System.out.println("Population of "+cities[1]+" is "+ population[1]);
        System.out.println("Population of "+cities[2]+" is "+ population[2]);
        System.out.println("Population of "+cities[3]+" is "+ population[3]);
        System.out.println("Population of "+cities[4]+" is "+ population[4]);
       
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
