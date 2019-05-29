package day42_customClasses_encapsulation;

public class People {
public static void main(String[] args) {
		
		Person p1 = new Person();
		//p1.age = 1;  not visible
		//p1.name = "Jim"; not visible
		p1.setName("Neda");
		System.out.println(p1.getName());
	}
}
