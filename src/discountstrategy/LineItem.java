/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Paul
 */
public class LineItem
{
    private Product product;
    private int quantity;
    private double totalPrice;
    
    public LineItem(Product product, int qty)
    {
        this.product = product;
        this.quantity = qty;
    }
    // not using delete me
    public double getTotalPrice()
    {
        return quantity * product.getProductCost();
    }
    
    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
}
