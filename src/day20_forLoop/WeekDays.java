package day20_forLoop;

public class WeekDays {
public static void main(String[] args) {
	 
	for (int weekDay = 1; weekDay <= 7; weekDay++) {
		switch(weekDay) {
		case 1:
			System.out.println(weekDay+" - Monday");
			break;
		case 2:
			System.out.println(weekDay+" - Tuesday");
			break;
		case 3:
			System.out.println(weekDay+" - Wednesday");
			break;
		case 4:
			System.out.println(weekDay+" - Thursday");
			break;
		case 5:
			System.out.println(weekDay+" - Friday");
			break;
		case 6:
			System.out.println(weekDay+" - Saturday");
			break;
		case 7:
			System.out.println(weekDay+" - Sunday");
			break;
			default:
				System.out.println("Invalid day!!");
		}
	}
}
}
