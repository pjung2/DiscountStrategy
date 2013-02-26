/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Paul
 */
public class Customer
{
    private String custName;
    private String custId;

    public Customer(String custId, String custName)
    {
        this.custId = custId;
        this.custName = custName;
    }

    public String getCustId()
    {
        return custId;
    }

    public void setCustID(String custId)
    {
        this.custId = custId;
    }

    public String getCustName()
    {
        return custName;
    }

    public void setCustName(String custName)
    {
        this.custName = custName;
    }
    
}