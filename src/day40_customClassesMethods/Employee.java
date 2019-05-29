package day40_customClassesMethods;

public class Employee {
	
	public String name;  // can be used anywhere in project
	public String jobTitle;
	double salary; // can only be used in same package
	
	public void work() {
		System.out.println(name + " goes to work");
	}
	public void goToBreak() {
		System.out.println(name + " goes to break");
	}
   public void attendMeeting() {
	   System.out.println(name+" attends meeting");
   }
   public void introduce() {
	   System.out.println("Name["+name+ "], jobTitle [" +jobTitle +
			   "], salary["+salary+"]" );
   }
}
