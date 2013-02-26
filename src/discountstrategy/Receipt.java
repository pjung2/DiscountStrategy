/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Paul
 */
public class Receipt
{ 
    private double total;
    private double grandTotal;
    private double totalDiscount;
    NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
    // Created an array with only one index to show that the resizing method
    // works as intended
    private LineItem[] lineItems = new LineItem[0];
    
    // Here's how Receipt class adds a purchased product as a LineItem
    // Note that the Receipt must have a LineItem[]  lineItems array property
    public void addLineItem(Product product, int qty)
    {
        LineItem item = new LineItem(product, qty);
        
        addToArray(item);
    }
	// Since arrays are fixed in size, to add a new element you must resize
	// the array, but wait, you can't do that in Java! Well, you can fake it. Here's how:
	// Create a new temporary array that's one larger than the original. Then,
	// copy all the data from the original into the temporary array.
	// Finally, add the new item to the new element in the temporary array. Then,
	// set the original = temporary. That's it!
    private void addToArray(LineItem item)
    {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    public void printReceipt()
    {
        for(LineItem l : lineItems)
        {
            System.out.println("Quantity: " + l.getQuantity());
            System.out.println("Product: " + l.getProduct().getProductName());
            System.out.println("Price: " + l.getProduct().getProductCost());
            System.out.println("Product Total: " + n.format(l.getTotalPrice()));
            System.out.println("Discount: " + n.format(l.getProduct().getDiscount(l.getQuantity(), l.getProduct().getProductCost())));
            System.out.println("Total with Discount: " + n.format(l.getTotalPrice() - l.getProduct().getDiscount(l.getQuantity(), l.getProduct().getProductCost())));
            System.out.println("");
            total += l.getTotalPrice();
            totalDiscount += (l.getProduct().getDiscount(l.getQuantity(), l.getProduct().getProductCost()));
            this.grandTotal += (total - totalDiscount);
	}
            System.out.println("Total: " + this.grandTotal);
            System.out.println("Grand Total with Discount: " + n.format(total));
            System.out.println("Discount Total: " + n.format(totalDiscount));
    }
}
