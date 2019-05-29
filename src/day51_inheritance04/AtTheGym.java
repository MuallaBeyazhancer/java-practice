package day51_inheritance04;

public class AtTheGym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Exercise e = new Exercise();
       Swimming swim = new Swimming();
       Yoga yoga = new Yoga();
       Running run = new Running();
       JuiJitsu juij = new JuiJitsu();
       Sprint sp = new Sprint();
     
       
       System.out.println(e.perform(180));
       System.out.println(swim.perform(30));
       System.out.println(yoga.perform(45));
       System.out.println(run.perform(40));
       System.out.println(juij.perform(20));
       System.out.println(sp.perform(34));
       System.out.println("=================");
       Snowboarding sn = new Snowboarding();
       System.out.println(sn.perform(100));
	}

}
