package src;

public class ItemDetails {

	private int iItemID;
	private double dItemPrice;
	
	public ItemDetails(int iItemID, int dItemPrice) {
		// TODO Auto-generated constructor stub
	}
	void validateID(){
		if(iItemID==1001||iItemID==1002||iItemID==1003||iItemID==1004||iItemID==1005)
		System.out.println("item id is valid");
		else 
			System.out.println("Invalid Item ID");
	}
	void displayItem(){
		System.out.println("Item ID:" +iItemID);
		System.out.println("Item price:" +dItemPrice);
	}
	public int getiItemID() {
		return iItemID;
	}
	public double getdItemPrice() {
		return dItemPrice;
	}
	
}
