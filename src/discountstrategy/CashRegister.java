/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Paul
 */
public class CashRegister
{
    private Receipt receipt = new Receipt();
    
    // When adding an item to a sale you need to look up the item in the database
    // Here we use the prodId to find product in the above array
    public void addItemToSale(String productId, int qty)
    {
        FakeDatabase db =  new FakeDatabase();
        Product product = db.findProduct(productId);
        
	// if found, add the lineItem to the receipt
	// but it's the receipt's job to do this!
        if(product != null)
        {
            receipt.addLineItem(product, qty);
        }    
    }
    public void printReceipt()
    {
        receipt.printReceipt();
    }
}
