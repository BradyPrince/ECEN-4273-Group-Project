/*import java.util.Scanner;

public class desertItems {
    public static void main(String[] args) throws Exception {
        int itemNum = 1;
        String itemString;
		String[] cart = new String[50];
        Scanner input = new Scanner(System.in);
		int x = 0;
        while (itemNum != 0){
            System.out.println("Please select an item");
            System.out.println("Press 1 for cookies");
            System.out.println("Press 2 for a apple pie");
            System.out.println("Press 3 for a cherry pie");
            System.out.println("Press 4 for ice cream");
            System.out.println("Press 5 for a dipped ice cream cone");
            System.out.println("Press 6 for cinnamon buns ");
            System.out.println("Press 7 for strawberry shake");
            System.out.println("Press 8 for chocolate shake");
            System.out.println("Press 0 if you are finished");
			String msg = input.nextLine();
			itemNum = Integer.valueOf(msg);
            switch (itemNum) {
                case 1:  itemString = "cookies";
                        break;
                case 2:  itemString = "apple pie";
                        break;
                case 3:  itemString = "cherry pie";
                        break;
                case 4:  itemString = "ice cream";
                        break;
                case 5:  itemString = "dipped ice cream cone";
                        break;
                case 6:  itemString = "cinnamon buns";
                        break;
                case 7:  itemString = "strawberry shake";
                        break;
                case 8:  itemString = "chocolate shake";
                        break;
                default: itemString = "Invalid Item";
                        break;
            }
			if (itemNum == 0){
				System.out.println("Thank you for your selection");
				System.out.println();
			}
			else if(itemString == "Invalid Item"){
				System.out.println("You selected an invalid number, please choose again");
				System.out.println();
			}
			else{
				System.out.println("You added " + itemString + " to your cart");
				System.out.println();
				cart[x] = itemString;
				x++;
			}
		}
		System.out.println("Your cart currently has");
		for(int i = 0; i < x; i++){
			System.out.println(cart[i]);
		}
    }
}*/


class Cookie
{
    double price = 0.50;
    String name = "Cookie";
    
    public HashBrowns()
    {
		
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
}
class ApplePie
{
    double price = 2.99;
    String name = "Apple Pie";
    
    public HashBrowns()
    {
		
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
}
class CinnamonBun
{
    double price = 1.99;
    String name = "Cinnamon Bun";
    
    public CinnamonBun()
    {
		
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
}
class ChocolateShake
{
    double price = 1.99;
    String name = "Chocolate Shake";
    
    public ChocolateShake()
    {
		
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
}
class StrawberryShake
{
    double price = 1.99;
    String name = "Strawberry Shake";
    
    public StrawberryShake()
    {
		
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
}