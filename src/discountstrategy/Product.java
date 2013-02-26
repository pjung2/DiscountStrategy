package discountstrategy;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
public class Product
{
    DiscountStrategy discountStrategy;
    
    private String productId;
    private String productName;
    private double productCost;

    public Product(String productId, String productName, double productCost, DiscountStrategy discountStrategy)
    {
        this.discountStrategy = discountStrategy;
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }
    public double getDiscount(int quantity, double price)
    {
        return discountStrategy.getDiscount(quantity, price);
    }
    public DiscountStrategy getDiscountStrategy()
    {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy)
    {
        this.discountStrategy = discountStrategy;
    }

    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public double getProductCost()
    {
        return productCost;
    }

    public void setProductCost(double productCost)
    {
        this.productCost = productCost;
    }

    @Override
    public String toString() {
        return "Product{" + "discountStrategy=" + discountStrategy + ", productId=" + productId + ", productName=" + productName + ", productCost=" + productCost + '}';
    }
    
    
}
