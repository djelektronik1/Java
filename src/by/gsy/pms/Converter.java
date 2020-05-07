package by.gsy.pms;

import java.text.DecimalFormat;

public class Converter 
{
    public static String convertMoney(int val) 
	{
        double money = Double.parseDouble((val/1000) + "." + (val%1000)/100 + val%100);
        return new DecimalFormat("#0.00").format(money);
    }
}
