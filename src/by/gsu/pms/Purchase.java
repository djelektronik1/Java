package by.gsu.pms;

public class Purchase 
{
    public static final double DISCOUNT = 40;
    private String name;
    private int price;
    private int units;

    public  Purchase()
	{
        this.name = "Product";
        this.price = 0;
        this.units = 0;
    }

    public Purchase(String name, int price, int units) 
	{
        this.name = name;
        this.price = price;
        this.units = units;
    }

    public String getName() 
	{
        return name;
    }
	
    public void setName(String name) 
	{
        this.name = name;
    }
	
    public int getPrice() 
	{
        return price;
    }
	
    public void setPrice(int price) 
	{
        this.price = price;
    }
	
    public int getUnits() 
	{
        return units;
    }
	
    public void setUnits(int units) 
	{
        this.units = units;
    }

    public int getCost()
	{
        return price * units;
    }

    @Override
    public String toString() 
	{
        return name + "; " + price + "; "+ units;
    }

    public boolean equals(Purchase purchase) 
	{
        return this.name.equals(purchase.name) & this.price == purchase.price;
    }

}