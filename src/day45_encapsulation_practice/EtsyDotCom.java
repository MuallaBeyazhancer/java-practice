package day45_encapsulation_practice;

public class EtsyDotCom {

	public static void main(String[] args) {
		EtsyAccount acct1 = new EtsyAccount();
		System.out.println(acct1.toString());
        acct1.setEmail("beyazhancer3@gmail.com");
        acct1.setFirstName("Mualla");
        acct1.setPassword("Bulgaria123");
        
        System.out.println(acct1.toString());
        
        EtsyAccount acct2 = new EtsyAccount();
        acct2.setEmail("helirova@royalhost.info");
        acct2.setFirstName("helireva123");
        acct2.setPassword("abc12");
        
        System.out.println(acct2.toString());
        
        EtsyAccount acct3 = new EtsyAccount("helirova@royalhost.info",
        		"Helireva","royal234");
        System.out.println(acct3.toString());
        
        EtsyAccount acct4 = new EtsyAccount("woodenspoon@gmail.com", "WdSpoon");
        System.out.println(acct4.toString());
       
	}

}
