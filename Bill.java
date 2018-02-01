
/**
 * A class to calculate the bill from items ordered
 *
 * @author (AMenzies)
 * @version (Jan 18)
 */
public class Bill
{
    double mainPrice, sidePrice, sizePrice, totalBill;
    int discount;

    /**
     * Constructor for objects of class Bill
     */
    public Bill(double mainP, double sideP, double sizeP)
    {
        mainPrice = mainP;
        sidePrice = sideP; //calculated when instantiated by calling class
        sizePrice = sizeP; 
        
    }
    public double getMain()
    {
        totalBill = mainPrice + sidePrice + sizePrice;
        return totalBill;
    }
     public double sizeDiscount(double discount)
     {
         mainPrice = mainPrice * discount; 
         return mainPrice;
        }
    }
