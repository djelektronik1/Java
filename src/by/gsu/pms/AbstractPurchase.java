package by.gsu.pms;

public abstract class AbstractPurchase 
{

    private Commodity commodity;
    private int units;

    public AbstractPurchase(Commodity commodity, int units) 
	{
        this.commodity = commodity;
        this.units = units;
    }

    public Commodity getCommodity() 
	{
        return commodity;
    }

    public void setCommodity(Commodity commodity) 
	{
        this.commodity = commodity;
    }

    public int getUnits() 
	{
        return units;
    }

    public void setUnits(int units) 
	{
        this.units = units;
    }

    public abstract double getCost();

    public String toString()
	{
        return commodity.toString() + "; " + units + "; " + getCost();
    }

    public boolean compareTo(AbstractPurchase abstractPurchase)
	{
       return getCost() > abstractPurchase.getCost();
    }
}
