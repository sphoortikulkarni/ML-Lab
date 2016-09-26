package src;


public class PurchaseBill {
	private int iBillID;
	private int iQty;
	private double dBillAmt;
	private double discount;
	private double finalBill;

	public PurchaseBill(int iBillID, int iQty , double dBillAmt) {
		// TODO Auto-generated constructor stub
	}

	double calculateBill(){
		if(iQty<=0||iQty>5)
			System.out.println("Quantity must be greater than 0 and less than 5");
		
		if(dBillAmt>0 && dBillAmt<500)
		{
			discount=0;
		}
		else if(dBillAmt>=500 && dBillAmt<1000){
			discount=0.05*dBillAmt;
		}
		else if(dBillAmt>=1000){
			discount=0.10*dBillAmt;
		}
		finalBill=dBillAmt-discount;
		return finalBill;
	}
	
	void displayPurchaseBill(){
		System.out.println("Bill ID:" +iBillID);
		System.out.println("Quantity:" +iQty);
		System.out.println("Final Bill:" +finalBill);
	}

	public int getiBillID() {
		return iBillID;
	}

	public int getiQty() {
		return iQty;
	}

	public double getdBillAmt() {
		return dBillAmt;
	}

	public double getDiscount() {
		return discount;
	}

	public double getFinalBill() {
		return finalBill;
	}
	
}
