package termwork;

public class CustomerDemo {
public static void main(String[] args) {
		
		Customer c = new Customer("aaaa", "hubli", 9876574695l, "Male");
		c.display();
		c.selectPackage();
		c.status();
		
		System.out.println("\n");
		Customer c2 = new Customer("bbbb", "bengaluru", 9876245130l, "Female");
		c2.display();
		c2.selectPackage();
		c2.status();
	}
}
