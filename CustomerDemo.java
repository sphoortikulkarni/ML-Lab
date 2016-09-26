package src;

public class CustomerDemo {
public static void main(String args[]){
	Customer c1= new Customer(101,"Sphoorti","Keshwapur,Hubli",944940619);
	c1.validateName();
	c1.validateTelNo();
	c1.display();
	
	PurchaseBill p=new PurchaseBill(311,4,980.5);
	p.calculateBill();
	p.displayPurchaseBill();

	ItemDetails it=new ItemDetails(1001,50);
	it.validateID();
	it.displayItem();
	
}
}
