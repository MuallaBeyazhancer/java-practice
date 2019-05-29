package day44_constructor02;

import java.util.*;

public class Dice {

	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2 = new Job("Java Developer");
		Job job3 = new Job("SDET", "Amazon", 130_000.0);
		
        System.out.println(job1.toString());
        System.out.println(job2.toString());
        System.out.println(job3.toString());
        
        //create a list of Job s
        //and add 5 different jobs, with, company, salary, title
        
       List<Job> jobsList = new ArrayList<>();
       jobsList.add(job3);
       jobsList.add(new Job("Scrum Master", "Google", 123000));
       jobsList.add(new Job("SDET", "FreddieMac", 100000));
       jobsList.add(new Job("BA", "Leidos", 98000));
       jobsList.add(new Job("Senior QA Tester", "Delta", 150_000));
       
       System.out.println(jobsList.toString());
       //find the highest paying and print toString for that
       int highestIndex = -1;
       double maxAnnualS = 0;
       for(int i =0; i < jobsList.size(); i++ ) {
    	   if(jobsList.get(i).getAnnualSalary()> maxAnnualS) {
    		 maxAnnualS = jobsList.get(i).getAnnualSalary();
    		 highestIndex = i;
    	   }
       }
       Job bestJob = jobsList.get(highestIndex);
       System.out.println("Highest Salary: "+bestJob);
	}
}
