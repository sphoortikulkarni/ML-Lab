package src;

public class Customer {
private int iCustID;
private String sName;
private String sAddress;
private long telNo;

public Customer(int iCustID, String sName, String sAddress, int telNo) {
	// TODO Auto-generated constructor stub
}
boolean validateTelNo(){
	if(telNo%1000000000==7||telNo%1000000000==8||telNo%1000000000==9)
		return true;
		else  
			return false;
	}
boolean validateName(){
	if(sName.length()<4||sName.length()<20)
		return false;
	else 
		return true;
}
void display(){
	System.out.println("Customer ID:" +iCustID);
	System.out.println("Name : " +sName);
	System.out.println("Address: " +sAddress);
	System.out.println("Telephone number:" +telNo);
}
public int getiCustID() {
	return iCustID;
}
public String getsName() {
	return sName;
}
public String getsAddress() {
	return sAddress;
}
public long getTelNo() {
	return telNo;
}

}

