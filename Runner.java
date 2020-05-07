import by.gsy.pms.Employe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Runner 
{
    public static void main(String[] args) throws FileNotFoundException 
	{
        FileReader file = new FileReader("src/in.txt");
        Scanner sc = new Scanner(file);

        double dailyRate = Double.parseDouble(sc.nextLine().split("=")[1]);
        int[] indices = Arrays.stream (sc.nextLine().split("=")[1].split(";")).mapToInt(Integer::parseInt).toArray();

        Employe[] employes = new Employe[indices.length];
		
		
        for (int i=0; i<indices.length; i++)
		{
            String account = sc.nextLine().split("=")[1];
            int transport = Integer.parseInt(sc.nextLine().split("=")[1]);
            int days = Integer.parseInt(sc.nextLine().split("=")[1]);

            employes[i] = new Employe(account, transport, days);

        }
		
		
        Arrays.sort(employes, Comparator.comparing(Employe::getTotal).reversed());

        for (Employe employe: employes)
		{
            employe.show();
        }
    }
}
