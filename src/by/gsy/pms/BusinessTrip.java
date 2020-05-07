package by.gsy.pms;
import static by.gsy.pms.Converter.convertMoney;

public class BusinessTrip 
{
    private static final int RATE = 25000;
    private String account;
    private int transport;
    private int days;

    public BusinessTrip() 
	{
        super();
    }

    public BusinessTrip(String account, int transport, int days) 
	{
        super();
			this.account = account;
			this.transport = transport;
			this.days = days;
    }

    public String getAccount() 
	{
        return account;
    }

    public int getTransport() 
	{
        return transport;
    }

    public int getDays() 
	{
        return days;
    }

    public void setAccount(String account) 
	{
        this.account = account;
    }

    public void setTransport(int transport) 
	{
        this.transport = transport;
    }

    public void setDays(int days) 
	{
        this.days = days;
    }

    public int getTotal() 
	{
        return transport + RATE * days;
    }

    public void show() 
	{
        System.out.println("RATE: " + convertMoney(RATE) + "\n"
                + "account: " + account + "\n"
                + "transport: " + convertMoney(transport) + "\n"
                + "days: " + days + "\n"
                + "total: " + convertMoney(getTotal()) + "\n\n");
    }

    public String toString() 
	{
        return account + "; " + convertMoney(transport) + "; " + days + "; " + convertMoney(getTotal());
    }



}