public class SingleQuarterPounder
{
	double price = 4.99;
    String name = "Single Quarter Pounder";
    boolean pickes;

    public Burger(boolean isCombo)
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
class DoubleQuarterPounder
{
	double price = 5.99;
    String name = "Double Quarter Pounder";
    boolean pickes;

    public Burger(boolean isCombo)
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
class TrippleQuarterPounder
{
	double price = 6.99;
    String name = "Tripple Quarter Pounder";
    boolean pickes;

    public Burger(boolean isCombo)
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