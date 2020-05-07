import by.gsy.pms.BusinessTrip;
import by.gsy.pms.Converter;

public class Runner 
{
    public static void main(String[] args)
	{
        BusinessTrip[] trips = 
		{
                new BusinessTrip("Anton", 2600, 5),
                new BusinessTrip("Andrey", 1570, 2),
          null,
                new BusinessTrip("Artur", 5120, 7),
                new BusinessTrip("Alisa", 9350, 10),
                new BusinessTrip("Evgenij", 1200, 6),
                new BusinessTrip()
        };

        for (BusinessTrip trip : trips)
		{
            if (trip != null) 
			{
                trip.show();
            }
        }

        trips[trips.length - 1].setTransport(33);
				System.out.println(("Duration = ") + (trips[0].getDays() + trips[1].getDays()));

        for (BusinessTrip trip : trips)
		{
				System.out.println(trip);
        }

        int totalExpenses = 0;
        for (BusinessTrip trip : trips)
		{
            if (trip != null) 
			{
                totalExpenses += trip.getTotal();
            }
        }
        System.out.println("Summa vseh rashodov: " + totalExpenses);



    }



}
