package discountstrategy;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
public class FlatRateDiscount implements DiscountStrategy
{
    private double discountBaseRate = .05;

    public FlatRateDiscount(double discountBaseRate)
    {
        this.discountBaseRate = discountBaseRate;
    }
    
    @Override
    public double getDiscount(int quantity, double price)
    {
        return quantity * price * discountBaseRate;
    }
}
