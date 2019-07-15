package day55_abstraction;

public abstract class Shape {
	/*
	 * 
1,Create a Shape abstract lass
2,create instance fields name, area;
3,create 2 abstract method as below : 
calculateArea() return double, no arg
draw() void 
4,create one constructor that set name-value
	 */
String name;
double area;

public Shape(String name) {
	this.name = name;
}

public abstract double calculateArea() ;


public abstract void draw();
}
