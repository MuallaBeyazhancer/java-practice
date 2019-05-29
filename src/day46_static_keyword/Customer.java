package day46_static_keyword;

public class Customer {
private String name;
private String email;
static int count; //shared by all object
                 // one central copy of this variable


public Customer() {
	this.name = "undefined";
	email = "undefined";
	count++;
}
public Customer(String name, String email) {
	this.name = name;
	setEmail(email);
	count++;
}

public String toString() {
	return "Customer [name=" + name + ", email=" + email + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	// conditions
	this.email = email;
}


}
