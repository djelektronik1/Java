package by.gsu.pms;

public class DiscountPurchase extends Purchase 
{
    private int discount = 15;

    public DiscountPurchase(String name, int price, int units) 
	{
        super(name, price, units);

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
        return getPrice() * getUnits() * (100 - discount) / 100;
    }

}

