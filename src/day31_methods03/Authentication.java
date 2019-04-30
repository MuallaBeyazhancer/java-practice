package day31_methods03;

public class Authentication {
	
	public static void main(String[] args) {
		login("mentoring@cybertekschool.com", "mentor001");
		login("mentoring@cybertekschool.com", "mentor003");
		
	}
/*
 * Name: Login
 * Return type: void
 * 2 Stringd args/params: username, password
 * Inside the method:
 * validUsername = "mentoring@cybertekschool.com"
 * validPassword = "mentor001"
 * if username and password match, print "Login Successful! Welcome to Okta"
 * if not : "Sign in failed!"
 */
	public static void login(String username, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		if (username.equals("mentoring@cybertekschool.com") && password.equals("mentor001")) {
			System.out.println("Login Successful! Welcome to Okta");
		}else {
			System.out.println("Sign in failed!");
		}
	}
}
