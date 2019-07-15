package day60_polymorphism2;

import day59_polymorphism.*;

public class InstanceOfOperator {

	public static void main(String[] args) {
		Shape shape = new Square();
		//We find out which actual object type we using 
		//with getClass().getName() method
		System.out.println(shape.getClass().getName());
		System.out.println(shape.getClass().getSimpleName());
		
		if(shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("It is a Triangle!");
		}else if(shape.getClass().getSimpleName().equals("Circle")) {
			System.out.println("It is a Circle!");
		}else if(shape.getClass().getSimpleName().equals("Square")){
			System.out.println("It is a Square!");
		}
		
		//same check using instanceOf operator
		System.out.println(shape instanceof Square);
		System.out.println(shape instanceof Circle);
		System.out.println(shape instanceof Triangle);
		
		System.out.println(shape instanceof Shape); // parent will tell true extending classes
		System.out.println(shape instanceof Object);
		
		//
		if(shape instanceof Square) {
			System.out.println("It is a Square!");
			shape.draw();
		}else if(shape instanceof Circle) {
			System.out.println("It is a Circle!");
			shape.draw();
		}else if(shape instanceof Triangle) {
			System.out.println("It is a Triangle!");
			shape.draw();
		}
		
		
		//using for each loop find our number of each type
		Shape[] shapes = {new Triangle(), new Square(), new Circle(),
		          new Triangle(), new Square(), new Circle()};
		int circles = 0, squares = 0, triangles = 0;
		for(Shape sh : shapes) {
			if(sh instanceof Square) {
				squares++;
			}else if(sh instanceof Triangle) {
				triangles++;
			}else if(sh instanceof Circle) {
				circles++;
			}
		}
		System.out.println("Squares: "+squares+" Triangles: "+triangles+" Circles: "+circles);
	}

}
