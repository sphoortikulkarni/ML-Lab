package termwork;

import java.util.Scanner;


public class Customer extends HolidayBuddy{
	String sName;
	String sAddress;
	long lTeleNo;
	String gender;
	
	
	public Customer(String sName, String sAddress, long lTeleNo, String gender) {
		super();
		this.sName = sName;
		this.sAddress = sAddress;
		this.lTeleNo = lTeleNo;
		this.gender=gender;
	}	
		
		void display(){
		System.out.println("Customer Details:");
		System.out.println("Name: "+sName);
		System.out.println("Address: "+sAddress);
		System.out.println("Contact No: "+lTeleNo);
		System.out.println("Gender: "+gender);
	}
	
		Scanner sc=new Scanner(System.in);
		
		
		void selectPackage(){
			System.out.println("Enter the choice of package:\n1 for Travel only\n2 for Holiday Package\n3 for Bed and Breakfast\n");
			choice = sc.nextInt();
			
			switch(choice){
				case 1: packageName="Travel Only Package";
						System.out.println(packageName+" is booked");
						packageAmt=10000d;
						System.out.println("Package Amount = Rs."+packageAmt);
						count++;
						calDisc(packageAmt);
						System.out.println("Total Amount=Rs."+checkGender(packageAmt, gender));		
						break;
				case 2: packageName="Holiday Package";
						System.out.println(packageName+" is booked");
						packageAmt = 20000d;
						System.out.println("Package Amount = Rs."+packageAmt);
						count++;
						calDisc(packageAmt);
						System.out.println("Total Amount=Rs."+checkGender(packageAmt, gender));
						break;
				case 3: packageName="Bed and breakfast Package";
						System.out.println(packageName+" is booked");
						packageAmt=5000d;
						System.out.println("Package Amount = Rs."+packageAmt);
						count++;
						calDisc(packageAmt);
						System.out.println("Total Amount = Rs."+checkGender(packageAmt, gender));
						break;
				default: System.out.println("Wrong choice");
			}
		}	
		
		void calDisc(double totalAmt){
			double disc;
		
			if(count>=2){
				disc=totalAmt*0.10;
				totalAmt=totalAmt-disc;
				System.out.println("Total Amount (the customer has visited more than one time)= Rs."+totalAmt);
			}
			else{
				disc=0;
				System.out.println("Total Amount (the customer has visited only once) = Rs."+ totalAmt);
			}
			
		}
		double checkGender(double packageAmt, String gender){
			
			if(this.gender=="Female"){
				discount=packageAmt*0.02;
				totAmt = packageAmt-discount;
				System.out.println("Discount (based on gender)= Rs."+discount);
				return totAmt;
			}
			else{
				discount=0;
				System.out.println("Discount(based on gender) = Rs."+discount);
				totAmt=packageAmt-discount;
				return totAmt;
			}
		}	
		
		void status(){
			
			System.out.println("Status:");
			System.out.println("Package :"+ packageName);
			System.out.println("Total Amount = Rs."+totAmt);
			 
		}
		
}	

	

	
	

	
	
	
	


