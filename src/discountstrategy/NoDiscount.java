package discountstrategy;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
public class NoDiscount implements DiscountStrategy
{   
    @Override
    public double getDiscount(int quantity, double price)
    {
        return quantity * price;
    }
}
