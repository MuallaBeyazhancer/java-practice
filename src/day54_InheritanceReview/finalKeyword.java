package day54_InheritanceReview;

class data1{
	private String password = "12345";
	private final int age = 40;
	
	public String getPassword() {
		return password;
	}
	public int getAge() {
		return age;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public void setAge(int age) { final variable cannot be set
//		this.age =age;
//	}
}

public class finalKeyword {
/*
 * final: value cannot be changed
 *       variable, class and methods
 *       
 *       variable:
 *       	1.local variable: does not beed to initalized immidiately
 *       						cannot be re-assigned
 *          2.instance var : needs to be initialized immidiately
 *                           can be initialized in either instance block or constructor
 *          3. static var : needs to be iitialized immidaitely
 *          					can be initialized in static block
 *          
 *         class: cannot be inherited,
 *         		 abstract class cannot be final
 *         
 *         method : cannot be override
 */
	
	final String name; 
	
	{name = "Batch 11";
	}
	public finalKeyword(){
	// name = "Batch 13"; u can inititalize it once either in init or constructor
	}
	
	final static String school;
	static {
		school = "Cybertek"; //only static block can initialize the final static
	}
	public static void main(String[] args) {
		final boolean resul = false;
		//result = true; cannot be re-assigned
	}
}
