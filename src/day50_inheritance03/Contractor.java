package day50_inheritance03;

public class Contractor extends Employee{
	@Override
	//public void calculatePay(int hours, double rate)
	public void calculatePay(int hours, double rate) {
	//gets $200 extra for each pay
		double total = hours * rate + 200;
	System.out.println("Contractor employee total pay: "+ total);
}
}
