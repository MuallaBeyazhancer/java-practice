package day57_interface;

public class InterfaceTests {
	 public static void main(String[] args) {
		    //Electric el=new Electric(); // you cannot create an object from abstraction mentality // cannot instantiate an interface 
		        
		        Tesla t= new Tesla();
		        BMWi8 i8= new BMWi8 ();
		        
		        t.charge();
		        i8.charge();
		        
		        t.drive();
		        i8.selfDrive();
		        
		        Electric el2= new Tesla();// we cannot create  object from Interface !!!
		        
		    //List interface > ArrayList
		        Cat cat = new Cat();
		        cat.keepAsPet();
		        cat.play();
		        Pet.feed("dry food");
		        
		        System.out.println(Pet.FRIENDLY);
		    
		}
		}
