package day43_encapsulation_constructor;

public class TeslaDealer {

	public static void main(String[] args) {
		Tesla tesla1 = new Tesla();
		tesla1.setModel("Model Y");
		tesla1.setRange(310);
		tesla1.setZeroTo60(3.2);
		tesla1.setPrice(51450);
		tesla1.setSelfDriving(true);
		
		System.out.println("Model: "+tesla1.getModel());
		System.out.println("Range: "+tesla1.getRange());
		System.out.println("ZeroTo60: "+tesla1.getZeroTo60());
		System.out.println("Price: "+ tesla1.getPrice());
		System.out.println("Self Driving: "+tesla1.isSelfDriving());
        
		System.out.println(tesla1);
		System.out.println(tesla1.toString());
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		
		if(tesla1.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println(myTesla.getModel()+" is faster");
			System.out.println("0-60 speed: "+myTesla.getZeroTo60());
		}else {
			System.out.println(tesla1.getModel()+" is faster");
			System.out.println("0-60 speed: "+ tesla1.getModel());
		}
		buy(myTesla);
		buy(tesla1);
		System.out.println(testDrive("Model S"));
		System.out.println();
		Tesla testCar = testDrive("Model 3");
		System.out.println(testCar.toString());
	}
	public static Tesla testDrive(String model) {
		System.out.println( "I would like to test drive - "+model);
		System.out.println("Sure, let me build the object and return it, momentarily");
		Tesla car = new Tesla();
        car.setTeslaInfo(model, 310, 2.5, 95000, false);
		return car;
	}
	public static void buy(Tesla car) {
		System.out.println("Puschasing: "+ car.toString());
	}
	

}
