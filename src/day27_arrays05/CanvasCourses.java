package day27_arrays05;

public class CanvasCourses {

	public static void main(String[] args) {
		String url = "https://learn.cybertekschool.com/courses/147";

		String[] url1 = url.split("/");
		
		System.out.println("Length of Array: "+url1.length);

		System.out.println(url1[url1.length - 1]);

		int courseId = Integer.parseInt(url1[url1.length - 1]);
		
		switch (courseId) {
		case 147:
			System.out.println("Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Session");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println("Team Activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		default:
			System.out.println("Invalid Course Number");
			break;
		}

	}

}
