package discountstrategy;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Startup
{
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args)
    {
        CashRegister cashRegister = new CashRegister();
        
        cashRegister.addItemToSale("A101", 3);
        cashRegister.addItemToSale("B205", 6);
        
        cashRegister.printReceipt();
//        DiscountStrategy discountStrategy = new FlatRateDiscount();
//        double discount = discountStrategy.getDiscount(2, 5);
//        System.out.println(n.format(discount));
        
//        DiscountStrategy discountStrategy = new NoDiscount();
//        double discount = discountStrategy.getDiscount(5, 10);
//        System.out.println(n.format(discount));
        
//        DiscountStrategy discountStrategy = new QuantityDiscount();
//        double discount = discountStrategy.getDiscount(5, 10);
//        System.out.println(n.format(discount));
    }
}
