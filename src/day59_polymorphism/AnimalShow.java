package day59_polymorphism;

public class AnimalShow {
	public static void main(String[] args) {
       Animal animal = new Animal();
       //Polymorphism: Refernce Animal, object: Tiger, Cheetah, Zebra
       Animal tiger = new Tiger();
       Animal cheetah = new Cheetah();
       Animal someAnimal = new Zebra();
       animal.talk();
       tiger.talk();
       cheetah.talk();
       someAnimal.talk();
       
       //When we call a method it will call overriddn version
       //from a chil class, if we have overridden the method.
       //If method is not overrriden it will call the parent version
       
       Animal[] animals  = new Animal[3];
       animals[0] = new Tiger();
       animals[1] = new Cheetah();
       animals[2] = new Zebra();
       
       animals[0].talk();
       animals[1].talk();
       animals[2].talk();
       
       
       
       
	}
}
