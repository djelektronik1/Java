package by.gsu.pms;

public class PurchasePercentDiscount extends AbstractPurchase
{
    private double discount;

    public PurchasePercentDiscount(Commodity commodity, int units, double discount) 
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
        return getCommodity().getPrice() * getUnits() * (100 - discount) / 100;
    }
}
