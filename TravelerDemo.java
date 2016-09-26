package q1;

public class TravelerDemo {

	public static void main(String[] args) {
Traveler one=new Traveler(123,"ram",7795868795l,05f,true,2012);
		
		one.validateName();
		one.validateContactNo();
		one.displayInformation();
		
		Checks checking=new Checks();
		boolean a=checking.checkBaggage(one);
		boolean b=checking.checkImmigration(one);
		boolean c=checking.checkSecurity(one);
		if(a==true && b==true && c==true)
			System.out.println("allow traveler to fly");
		else
			System.out.println("detain traveler for rechecking");
		
	}

}
