package by.gsu.pms;

public class PurchaseTransportExpenses extends AbstractPurchase
{
    private double transportExpenses;

    public PurchaseTransportExpenses(Commodity commodity, int units, double transportExpenses) 
	{
        super(commodity, units);
        this.transportExpenses = transportExpenses;
    }

    @Override
    public double getCost() 
	{
        return getCommodity().getPrice() * getUnits() + transportExpenses;
    }
}
