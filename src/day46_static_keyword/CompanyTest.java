package day46_static_keyword;

public class CompanyTest {

	public static void main(String[] args) {
		//print cname variable
		System.out.println(Company.cname);
		System.out.println(Company.cname.toUpperCase());
		
		//Company.cname.toUpperCase();
		// System.out.println();
		
		Company c = new Company();
		System.out.println(c.cname);
		c.companyInfo();
		
	}

}
