import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk
{
    /*
     *  Written by William Gebhart 
     */
    public static void main(String args[])
    {
        System.out.println("Hello, Customer! Welcome to the Self Ordering Kiosk");
        System.out.println("Press ENTER to open the Main Menu.");
        //Wait for Enter key to be pressed
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) 
        {
            if (readString.isEmpty()) 
            {
                break;
            }
            if (scanner.hasNextLine()) 
            {
                readString = scanner.nextLine();
            } else 
            {
                readString = null;
            }
        }
        mainMenu();
        
    }
    /*
     *   mainMenu Written by William Gebhart 
     */
    public static void mainMenu()
    {
        ArrayList<Object> userOrder = new ArrayList();
        System.out.println("Please enter the number corresponding to the menu you would like to view.");
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Burgers \n2. Sides\n3. Deserts\n4. Checkout\n9. Cancel Order");
            int userInput = scan.nextInt();
            if(userInput == 1)//BURGERS MENU
            {
                burgerMenu(userOrder);
            }
            else if(userInput == 2)//SIDES MENU
            {
                sidesMenu(userOrder);
            }
            else if(userInput == 3)//DESERTS MENU
            {
                sidesMenu(userOrder);
            }
            else if(userInput == 4)//CHECKOUT MENU
            {
                if(checkoutMenu(userOrder))//Then the order was sucessfully completed
                {
                    scan.close();
                    break;
                }
                else//The user decided to return and modify their order.
                {
                    continue;
                }
            }
            else if(userInput == 9)//CANCEL ORDER
            {
                break;
            }
            else
            {
                System.out.println("\n\n\n\n\n\nInvalid input! \nYou entered: "+ userInput +" \nPlease enter the number corresponding to the menu you would like to see!");
                continue;
            }
        }
    }
    /*
     *   burgerMenu Written by William Gebhart 
     */
    public static ArrayList<Object> burgerMenu(ArrayList<Object> userOrder)
    {
        System.out.println("\n\n\n\n\n\n\n\n--------------------------------------------------");
        System.out.println("Select the number corresponding to the item you would like to add to your order.");
        Scanner scan = new Scanner(System.in);
        //List all menu Items
        System.out.println("1. Single Quarter Pounder");
        System.out.println("2. Double Quarter Pounder");
        System.out.println("3. Tripple Quarter Pounder");
        System.out.println("4. {NAME}");
        System.out.println("5. {NAME}");
        System.out.println("9. Return to Main Menu");
        int userInput = scan.nextInt();
        if(userInput == 1)
        {
            System.out.println("Enter 1 if you would like for this to be a combo.\nEnter 0 for just the burger.");
            userInput = scan.nextInt();
            if(userInput == 1)
            {
                userOrder.add(new SingleQuarterPounder(true));
                System.out.println("Item Added! Returning to Main Menu.");
            }
            else
            {
                userOrder.add(new SingleQuarterPounder(false));
                System.out.println("Item Added! Returning to Main Menu.");
            }
        }
        else if(userInput == 2)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			System.out.println("Enter 1 if you would like for this to be a combo.\nEnter 0 for just the burger.");
            userInput = scan.nextInt();
            if(userInput == 1)
            {
                userOrder.add(new DoubleQuarterPounder(true));
                System.out.println("Item Added! Returning to Main Menu.");
            }
            else
            {
                userOrder.add(new DoubleQuarterPounder(false));
                System.out.println("Item Added! Returning to Main Menu.");
            }
        }
        else if(userInput == 3)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			System.out.println("Enter 1 if you would like for this to be a combo.\nEnter 0 for just the burger.");
            userInput = scan.nextInt();
            if(userInput == 1)
            {
                userOrder.add(new TrippleQuarterPounder(true));
                System.out.println("Item Added! Returning to Main Menu.");
            }
            else
            {
                userOrder.add(new TrippleQuarterPounder(false));
                System.out.println("Item Added! Returning to Main Menu.");
            }
        }
        else if(userInput == 4)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
        }
        else if(userInput == 5)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
        }
        else if(userInput == 9)
        {
          System.out.println("Returning to Main Menu.");
        }
        else
        {
            System.out.println("Invalid Input. Returning to Main Menu");
        }
        return userOrder;
    }
    /*
     *   sidesMenu Written by William Gebhart 
     */
    public static ArrayList<Object> sidesMenu(ArrayList<Object> userOrder)
    {
        System.out.println("\n\n\n\n\n\n\n\n--------------------------------------------------");
        System.out.println("Select the number corresponding to the item you would like to add to your order.");
        Scanner scan = new Scanner(System.in);
        //List all menu Items
        System.out.println("1. Fries");
        System.out.println("2. Onion Rings");
        System.out.println("3. Tater Tots");
        System.out.println("4. Curly Fries");
        System.out.println("5. Hash Browns");
        System.out.println("9. Return to Main Menu");
        int userInput = scan.nextInt();
        if(userInput == 1)
        {
			System.out.println("Enter 1 if you would like for this to be salted.\nEnter 0 for no salt.");
            userInput = scan.nextInt();
            if(userInput == 1)
            {
                userOrder.add(new Fries(true));
                System.out.println("Item Added! Returning to Main Menu.");
            }
            else
            {
                userOrder.add(new Fries(false));
                System.out.println("Item Added! Returning to Main Menu.");
            }
        }
        else if(userInput == 2)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			System.out.println("Enter 1 if you would like for this to be salted.\nEnter 0 for no salt.");
            userInput = scan.nextInt();
            if(userInput == 1)
            {
                userOrder.add(new OnionRings(true));
                System.out.println("Item Added! Returning to Main Menu.");
            }
            else
            {
                userOrder.add(new OnionRings(false));
                System.out.println("Item Added! Returning to Main Menu.");
            }
        }
        else if(userInput == 3)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			System.out.println("Enter 1 if you would like for this to be salted.\nEnter 0 for no salt.");
            userInput = scan.nextInt();
            if(userInput == 1)
            {
                userOrder.add(new TaterTots(true));
                System.out.println("Item Added! Returning to Main Menu.");
            }
            else
            {
                userOrder.add(new TaterTots(false));
                System.out.println("Item Added! Returning to Main Menu.");
            }
        }
        else if(userInput == 4)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			System.out.println("Enter 1 if you would like for this to be salted.\nEnter 0 for no salt.");
            userInput = scan.nextInt();
            if(userInput == 1)
            {
                userOrder.add(new CurlyFries(true));
                System.out.println("Item Added! Returning to Main Menu.");
            }
            else
            {
                userOrder.add(new CurlyFries(false));
                System.out.println("Item Added! Returning to Main Menu.");
            }
        }
        else if(userInput == 5)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			System.out.println("Enter 1 if you would like for this to be salted.\nEnter 0 for no salt.");
            userInput = scan.nextInt();
            if(userInput == 1)
            {
                userOrder.add(new HashBrowns(true));
                System.out.println("Item Added! Returning to Main Menu.");
            }
            else
            {
                userOrder.add(new HashBrowns(false));
                System.out.println("Item Added! Returning to Main Menu.");
            }
        }
        else if(userInput == 9)
        {
         	System.out.println("Returning to Main Menu.");
        }
        else
        {
            System.out.println("Invalid Input. Returning to Main Menu");
        }
        return userOrder;
    }
    /*
     *   desertMenu Written by William Gebhart 
     */
    public static ArrayList<Object> desertMenu(ArrayList<Object> userOrder)
    {
        System.out.println("\n\n\n\n\n\n\n\n--------------------------------------------------");
        System.out.println("Select the number corresponding to the item you would like to add to your order.");
        Scanner scan = new Scanner(System.in);
        //List all menu Items
        System.out.println("1. Cookie");
        System.out.println("2. Apple Pie");
        System.out.println("3. Cinnamon Bun");
        System.out.println("4. Chocolate Shake");
        System.out.println("5. Strawberry Shake");
        System.out.println("9. Return to Main Menu");
        //Take user input
        int userInput = scan.nextInt();
        //Add items to order
        if(userInput == 1)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			userOrder.add(new Cookie());
        }
        else if(userInput == 2)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			userOrder.add(new ApplePie());
        }
        else if(userInput == 3)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			userOrder.add(new CinnamonBun());
        }
        else if(userInput == 4)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			userOrder.add(new ChocolateShake());
        }
        else if(userInput == 5)
        {
            //ADD TO ORDER: userOrder.add(new ItemName());
			userOrder.add(new StrawberryShake());
        }
        else if(userInput == 9)
        {
           System.out.println("Returning to Main Menu.");
        }
        else
        {
            System.out.println("Invalid Input. Returning to Main Menu");
        }
        return userOrder;
    }
    
    public static Boolean checkoutMenu(ArrayList<Object> userOrder)
    {
        //Placeholder: Print contents of userOrder
        System.out.println("\n\n\n\n\n\n\n\n--------------------------------------------------");
        System.out.println("User Order: ");
        for(int i=0; i<userOrder.size(); i++)
        {
            System.out.println(userOrder.get(i));
        }
        //Calculate total
        //Give user options to add/remove items
        //Return true if user has finished placing their order
        //Return false if user chose to return to main menu to modify their order

        return true;
    }
}




/*
	Abstact flass for all Menu Items.
	-Brady
*/
abstract class Item
{
	double price;
	String name;
	public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
} 




/*
	All Burger Menu Items.
	-Brady
*/
class SingleQuarterPounder extends Item
{
	double price = 4.99;
    String name = "Single Quarter Pounder";
    boolean pickes;

    public SingleQuarterPounder(boolean isCombo)
    {
        if(isCombo)
        {
            price = 6.99;
            name = "Single Quarter Pounder, Fries, Drink Combo";
        }
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
class DoubleQuarterPounder extends Item
{
	double price = 5.99;
    String name = "Double Quarter Pounder";
    boolean pickes;

    public DoubleQuarterPounder(boolean isCombo)
    {
        if(isCombo)
        {
            price = 7.99;
            name = "Double Quarter Pounder, Fries, Drink Combo";
        }
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
class TrippleQuarterPounder extends Item
{
	double price = 6.99;
    String name = "Tripple Quarter Pounder";
    boolean pickes;

    public TrippleQuarterPounder(boolean isCombo)
    {
        if(isCombo)
        {
            price = 8.99;
            name = "Tripple Quarter Pounder, Fries, Drink Combo";
        }
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






/*
	All Side Menu Items.
	-Johnny
	-Brady
*/
class Fries extends Item
{
    double price = 0.99;
    String name = "French Fries";
    Boolean salted = true;

    public Fries(boolean salt)
    {	
		salted = salt;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean getSaltedStatus()
    {
        return salted;
    }
    public void setSaltedStatus(Boolean status)
    {
        salted = status;
    }
}
class OnionRings extends Item
{
    double price = 1.50;
    String name = "Onion Rings";
    Boolean salted = true;

    public OnionRings(boolean salt)
    {
		salted = salt;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean getSaltedStatus()
    {
        return salted;
    }
    public void setSaltedStatus(Boolean status)
    {
        salted = status;
    }
}
class TaterTots extends Item
{
    double price = 1.30;
    String name = "Tater Tots";
    Boolean salted = true;

    public TaterTots(boolean salt)
    {
		salted = salt;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean getSaltedStatus()
    {
        return salted;
    }
    public void setSaltedStatus(Boolean status)
    {
        salted = status;
    }
}
class CurlyFries extends Item
{
    double price = 0.99;
    String name = "Curly Fries";
    Boolean salted = true;

    public CurlyFries(boolean salt)
    {
		salted = salt;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean getSaltedStatus()
    {
        return salted;
    }
    public void setSaltedStatus(Boolean status)
    {
        salted = status;
    }
}
class HashBrowns extends Item
{
    double price = 1.50;
    String name = "Curly Fries";
    Boolean salted = true;

    public HashBrowns(boolean salt)
    {
		salted = salt;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean getSaltedStatus()
    {
        return salted;
    }
    public void setSaltedStatus(Boolean status)
    {
        salted = status;
    }
}







/*
	All Desert Menu Items.
	-Brett
	-Brady
*/
class Cookie extends Item
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
class ApplePie extends Item
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
class CinnamonBun extends Item
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
class ChocolateShake extends Item
{
    double price = 3.20;
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
class StrawberryShake extends Item
{
    double price = 3.20;
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















