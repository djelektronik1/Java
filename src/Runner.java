import by.gsu.pms.DiscountPurchase;
import by.gsu.pms.PercentPurchase;
import by.gsu.pms.Purchase;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner 
{
    public static void main(String[] args) throws IOException 
	{
        Purchase[] purchases = new  Purchase[6];
        FileReader fileReader = new FileReader("src/in.txt");
        Scanner sc = new Scanner(fileReader);

        double maxCost = 0;
        Purchase maxPurchase = new Purchase();

        for (int i=0; i<purchases.length; i++)
		{
            Purchase purchase = purchases[i];
            String[] st = sc.nextLine().split(" ");
            String type = st[0];
            String name = st[1];
            int price = Integer.parseInt(st[2]);
            int count = Integer.parseInt(st[3]);

            switch (type)
			{
                case ("Purchase"):
                    purchases[i] = new Purchase(name, price, count);
                    break;
                case ("Discount"):
                    purchases[i] = new DiscountPurchase(name, price, count);
                    break;
                case ("GeneralDiscount"):
                    purchases[i] = new PercentPurchase(name, price, count);
                    break;
            }
            System.out.println(purchases[i]);

            if (purchases[i].getCost() > maxCost)
			{
                maxCost = purchases[i].getCost();
                maxPurchase = purchases[i];
            }
        }
        fileReader.close();

        System.out.println("Max cost: " + maxCost);
    }

}