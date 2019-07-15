package day60_polymorphism2;

//import day59_polymorphism.Shape;
//import day59_polymorphism.Triangle;
import day59_polymorphism.*;
import java.util.*;

public class ShapesArray {
public static void main(String[] args) {
	
	
	
	Shape shape = new Triangle();
	shape.draw();// triangle overridden draw method
	
	Shape[] shapes = {new Triangle(), new Square(), new Circle(),
			          new Triangle(), new Square(), new Circle()};
	
	Shape[] shapes2 = new Shape[3];
	shapes2[0] = new Triangle();
	shapes2[1] = new Square();
	shapes2[2] = new Circle();
	
	shapes[0].draw();
	shapes2[2].draw();
	
	System.out.println("#### FOR EACH LOOP ####");
	for(Shape sh : shapes) {
		System.out.println(sh.getClass().getSimpleName()); // comes from the object class
		sh.draw();
	}
	//create a list of shapes and add 5 different child objects
	List<Shape> shapes3 = new ArrayList<>();
	//ArrayList<Shape> shapesArraylist = new ArrayList<>();
	shapes3.add(new Triangle());
	shapes3.add(new Circle());
	Shape newShape = new Square();
	shapes3.add(newShape);
	shapes3.add(new Square());
	shapes3.add(new Triangle());
	
	//draw first shape
	shapes3.get(0).draw();;
	Shape someShape = shapes3.get(1);
	someShape.draw();
	
	System.out.println("#### FOR EACH LOOP ####");
	for(Shape shapeItem : shapes3) {
		System.out.println(shapeItem.getClass().getSimpleName().toUpperCase());
		shapeItem.draw(); // comes from the object class
		
	}
	
	for(int i = 0; i<shapes3.size(); i++) {
		Shape tempSh = shapes3.get(i);
		System.out.println(tempSh.getClass().getSimpleName().toUpperCase());
		tempSh.draw();
	}
}
}
