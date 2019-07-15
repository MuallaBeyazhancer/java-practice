package day54_InheritanceReview;
class lion{
public lion(double b) {
		
	}
	public lion(int a) {
		System.out.println("A");
	}
}
public class constructorPractice2 extends lion{
   constructorPractice2() {
	super(9);
}
   constructorPractice2(boolean isLion){
	   super(9);
   }
   
}
