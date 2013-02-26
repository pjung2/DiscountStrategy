package discountstrategy;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
public interface DiscountStrategy
{
    public double getDiscount(int quantity, double price);    
}
