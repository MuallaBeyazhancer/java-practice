package day44_constructor02;

public class WhatsApp {
private String tonumber;
private String message;
private boolean delivered;

public WhatsApp() {
	System.out.println("No-args constructor");
}
public WhatsApp(String tonumber, String message) {
	this();
	System.out.println("2-args constructor");
this.message = message;	
this.tonumber = tonumber;
}
public WhatsApp(String tonumber) {
	//toNumber, "[]"
	this(tonumber, "[]");
	System.out.println("1 arg constructor");
}

public String toString() {
	return "WhatsApp [tonumber=" + tonumber + ", message=" + message + ", delivered=" + delivered + "]";
}
public String getTonumber() {
	return tonumber;
}
public void setTonumber(String tonumber) {
	this.tonumber = tonumber;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public boolean isDelivered() {
	return delivered;
}
public void setDelivered(boolean delivered) {
	this.delivered = delivered;
}

}
