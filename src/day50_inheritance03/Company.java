package day50_inheritance03;

public class Company {

	public static void main(String[] args) {
		Employee e = new Employee();
		FullTimeEmployee fte = new FullTimeEmployee();
		Contractor contr = new Contractor();
		
		e.calculatePay(40, 40);
		fte.calculatePay(40, 45);
		contr.calculatePay(40, 55);

	}

}
