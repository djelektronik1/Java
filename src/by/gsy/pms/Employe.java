package by.gsy.pms;

import static by.gsy.pms.Converter.convertMoney;

public class Employe 
{
    private static final int DAILY_RATE = 25000;
    private String account;
    private int transport;
    private int days;

    public Employe(String account, int transport, int days) 
	{
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public Employe() 
	{
        this.account = "";
        this.transport = 0;
        this.days = 0;
    }

    public String getAccount() 
	{
        return account;
    }

    public void setAccount(String account) 
	{
        this.account = account;
    }

    public int getTransport() 
	{
        return transport;
    }

    public void setTransport(int transport) 
	{
        this.transport = transport;
    }

    public int getDays() 
	{
        return days;
    }

    public void setDays(int days) 
	{
        this.days = days;
    }

    public int getTotal()
	{
        return transport + DAILY_RATE * days;
    }

    public void show() {
        System.out.println("daily rate: " + convertMoney(DAILY_RATE));
        System.out.println("account: " + account);
        System.out.println("transport: " + convertMoney(transport));
        System.out.println("days: " + days);
        System.out.println("total: " + convertMoney(getTotal()));
    }

    public String toString() 
	{
        return account + "; " + convertMoney(transport) + "; " + days + "; " + convertMoney(getTotal());
    }
}
