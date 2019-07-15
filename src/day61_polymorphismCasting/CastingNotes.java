package day61_polymorphismCasting;

public class CastingNotes {
/*Only reference type decides WHAT is accessible
 * CASTING - DOWN Casting
 * A
 * B
 * C
 * D
 * A obj2 = new (D); Casting options: B, C, D
 * 
 * When using polymorhism, reference type decides what methods and variables are accesible.

If you want to call methods or variables from the actual object , we can use downcasting.

Animal class:
	speak()

Goat extends Animal
	eat(String smth)

Animal an = new Goat();
an.speak();
To call eat method we need to downcast it.

1) Goat gt = (Goat)an;
   gt.eat("grass");

2) ((Goat)an).eat("apples");


Selenium example:(WILL USE OFTEN)
	Webdriver driver = new ChromeDriver();
    ((TakesScreenShot)driver).takeScreenshot("image.png");
 * ========================
 * 
 * Casting done only when polymorphism there.
 * 
 * Another use of polymorphism in programming is the ability to write methods
 * that return or accept polymorphic parameters.
 * 
 * meaning:
 * return type of a method
 * or 
 * parameter of the method can be parent class/interface 
 * and when we call this method, we can pass any sub class object
 * 
 * Animal > Cat
 * 		  > Racoon
 * 		  > Dog
 * 
 * public static void feed(Animal animal){
 * }
 * 
 * Animal an1 = new Cat();
 * feed(an1);
 * 
 * Animal an2 = new Racoon();
 * feed(an2);
 * 
 * feed(new Dog());
 * 
 * ===================
 * benefits of Polymorphism
 *     -a single variable with reference type of parent class
 *     is able to refer to any object of child type
 *     
 *     WebDriver driver = new ChromeDriver();
 *     driver = new FirefoxDriver();
 *  ================================   
 *     String browser = "firefox";
 *     WebDriver driver;
 *     if(browser.equals("firefox")){
 *     driver = new FirefoxDriver();
 *     }else if(browser.equals("chrome"){
 *     driver = new ChromeDriver();
 *     
 *     =======================
 *     -using polymorphism with data structures(Arrays, ArrayList)
 *     We can create array or arraylist of parent class/interface type
 *     andd add any object from a sub class.So we have flexible code
 *     that helps to deal with multiple types of data
 *     
 *     Card[] cards = new Card[3];
 *     cards[0] = new VIsa();
 *     cards[1] = new Amex();
 *     cards[2] = ndw MasterCard();
 *     ============================
 *     -Using polymorphism with custom methods:
 *     
 *     ===============
 *     
 *     REFERENCE TYPE DECIDES WHAT IS ACCESSIBLE
 *     to addres it we can access members from sub class/object using downcasting.
 *     
 *     Card cc = new Visa();
 *     Visa vi = (Visa) cc;
 *     
 *     ==================
 *     Summary:
    OOP
    - Encapsulation -> data hiding by making instance variables private and providing public getter/setter methods
    Benefit: control of data conditions using setter methods
    - Inheritance -> variables and methods of one class can be inherited/extended to another class.
    Super class > Subclass
    Parent class to Child class
    Benefit: Code reusability
             Organized code
             Maintainable code
    - Abstraction: Concentrating/Focusing on what to do, instead of how to do.
            General definition: Focusing on essencial and ignoring un-important details.
             2 Ways to achieve:
                - absract class
                - interface
    Benefit:
        code reusabily
        organizing the sub classes into single parent type
        able to focus on what to do instead of how to do
        etc.
    - Polymorhism: many forms, the ability of reference type to be super class/interface and object can be any child class
    2 Types of polymorhism:
        1) static polymorhism | static binding | compile time polymorhism
        -> is method overloading(same method name, different params)
        2) dynamic Polymorhism | Run-Time Polymorhism 
        -> is method overriding(same method name, same parameter)
 *     
 */
}
