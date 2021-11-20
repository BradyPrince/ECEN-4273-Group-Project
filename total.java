// Brett Zacharias
// this is code to total up the price of the menu items
public class total{
	int t=0;
	//passes the cost of an item and adds it to the total
	public void total1 ( int item ){
		t = t + item;
	}
	// prints out the total
	public int getTotal(){
		System.out.println("Your order total is: $" + t);
		return t;
	}
	


	public static void main(String []args){
		int x = 3;
		total myTotal = new total();
		myTotal.getTotal();
		myTotal.total1(x);
		myTotal.getTotal();
		
		
	}
}