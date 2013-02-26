package discountstrategy;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
public class QuantityDiscount implements DiscountStrategy
    {
    private int minimumQuantity = 5;
    private double discountBaseRate = .10;

    public QuantityDiscount(int quantity, double discountBaseRate)
    {
        this.minimumQuantity = quantity;
        this.discountBaseRate = discountBaseRate;
    }
    
    @Override
    public double getDiscount(int quantity, double price)
    {
        if (quantity >= minimumQuantity)
        {
            return quantity * price * discountBaseRate;
        }
        else
        {
            return 0;
        }
    }
}
