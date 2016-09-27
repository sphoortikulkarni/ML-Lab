package termwork;


public abstract class HolidayBuddy {
	static int count;
	String packageName;
	double packageAmt;
	int choice;
	String gender;
	double discount;
	double totAmt;

	abstract void selectPackage();
	abstract void calDisc(double totalAmt);
	abstract double checkGender(double packageAmt, String gender);
	abstract void status();
	
}