package by.gsu.pms;

public class PercentPurchase extends Purchase 
{
    private static int UNITS = 7;
    private int discount = 15;

    public PercentPurchase() 
	{
    }

    public PercentPurchase(String name, int price, int units) 
	{
        super(name, price, units);
    }

    public static int getUNITS() 
	{
        return UNITS;
    }

    public static void setUNITS(int UNITS)
	{
        PercentPurchase.UNITS = UNITS;
    }

    public int getDiscount() 
	{
        return discount;
    }

    public void setDiscount(int discount) 
	{
        this.discount = discount;
    }

    @Override
        public int getCost() 
		{
            if(getUnits() > UNITS)
			{
                return getPrice() * getUnits() * (100 - discount) / 100;
            }
			
			else 
			{
                return super.getUnits();
            }
        }
    }


