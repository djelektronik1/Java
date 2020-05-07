package by.gsu.pms;

public class PurchasePriceDiscount extends AbstractPurchase
{
    private double discount;

    public PurchasePriceDiscount(Commodity commodity, int units, double discount) 
	{
        super(commodity, units);
        this.discount = discount;
    }

    public double getDiscount() 
	{
        return discount;
    }

    public void setDiscount(double discount) 
	{
        this.discount = discount;
    }

    @Override
    public double getCost() 
	{
        return (getCommodity().getPrice() - discount) * getUnits();
    }
}
