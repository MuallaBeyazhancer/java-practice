package day59_polymorphism;
import java.util.*;
public class Store {
	public static void main(String[] args) {
		HairSpray hp = new HairSpray();
		   hp.catchFire();
		   
		   Flammable hairSp = new HairSpray();
		   hairSp.catchFire();
		   //interface      // implementing class
		   Flammable pTank = new PropaneTank();
		   pTank.catchFire();
		   //Above line will work, if PropaneTank implements flammable.
		   Flammable item;
		   item = new HairSpray();
		   item = new PropaneTank();
	   List<Flammable> items = new ArrayList<>();
	}

}
