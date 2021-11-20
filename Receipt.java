import java.util.ArrayList;

public class Receipt {
	
	public static void main(String args[]) {

		ArrayList<Item> userOrder = new ArrayList();

		userOrder.add(new Item("Item1", 1));
		userOrder.add(new Item("Item2", 2));
		userOrder.add(new Item("Item3", 3));
		userOrder.add(new Item("Item4", 4));
		userOrder.add(new Item("Item5", 5));
		userOrder.add(new Item("Item6", 6));
		userOrder.add(new Item("Item7", 7));
		userOrder.add(new Item("Item8", 8));
		userOrder.add(new Item("Item9", 9));
		userOrder.add(new Item("Item10", 10));

		printReceipt(userOrder);
	}
	
	public static void printReceipt(ArrayList<Item> userOrder) {
		
		System.out.println("Receipt: Customer Copy\nItem ------- Price\n");
		for(Item item : userOrder) {
			System.out.println(item.getName() + " ------- $" + item.getPrice());
		}
		System.out.println("\nSub total ------- " + "total()");
		System.out.println("  Tax (6%) ------- " + "total() * 0.06");
		System.out.println("\nTotal ------- " + "total() * 1.06");

		System.out.println("\nHave a Great Day :) Come Back Again!\n");
	}
}

class Item {
	
	double price = 0.50;
	String name = "item";

	public Item(String n, int p) {
		name = n;
		price = price * p;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
