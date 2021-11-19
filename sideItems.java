import java.util.Scanner;

public class sideItems {
    public static void main(String[] args) throws Exception {
        int itemNum = 1;
        String itemString;
		String[] cart = new String[50];
        Scanner input = new Scanner(System.in);
		int x = 0;
        while (itemNum != 0){
            System.out.println("Please select an item");
            System.out.println("Press 1 for french fries");
            System.out.println("Press 2 for onion rings");
            System.out.println("Press 3 for tater tots");
            System.out.println("Press 4 for curly fries");
            System.out.println("Press 5 for hashbrowns");
            System.out.println("Press 6 for a salad");
            System.out.println("Press 7 for mozzarella sticks");
            System.out.println("Press 8 for apple slices");
            System.out.println("Press 0 if you are finished");
			String msg = input.nextLine();
			itemNum = Integer.valueOf(msg);
            switch (itemNum) {
                case 1:  itemString = "french fries";
                        break;
                case 2:  itemString = "onion rings";
                        break;
                case 3:  itemString = "tater tots";
                        break;
                case 4:  itemString = "curly fries";
                        break;
                case 5:  itemString = "hashbrowns";
                        break;
                case 6:  itemString = "salad";
                        break;
                case 7:  itemString = "mozzarella sticks";
                        break;
                case 8:  itemString = "apple slices";
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
}
