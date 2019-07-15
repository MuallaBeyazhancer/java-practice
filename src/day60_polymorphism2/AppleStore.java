package day60_polymorphism2;

public class AppleStore {

	public static void main(String[] args) {
		AppleDevice mac = new Mac();
		mac.use();
		//mac.code(); code is not visible.(Reference type decides)
		//AppleDevice methods only can be callled.

		Mac myMac = new Mac();
		myMac.use();
		myMac.code();
		
		AppleDevice watch = new Watch();
		watch.use();
		
		AppleDevice dev1 = new Mac();
		System.out.println(dev1.startingPrice);
		//System.out.println(dev1.model);  <== ERROR
		
		AppleDevice dev2 = new Ipad();
		System.out.println(dev2.startingPrice);
		//System.out.println(dev2.maxScreenSize); NO
		Ipad ipad = new Ipad();
		System.out.println(ipad.startingPrice);
		System.out.println(ipad.macScreenSize);
	}

}
