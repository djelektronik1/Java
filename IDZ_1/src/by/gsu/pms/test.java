package by.gsu.pms;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class test {
	
	public static void main(String[] args) {
        BaseBus base = new BaseBus();
        base.addBus(new Bus("Евгений Ц.З.", 1321, 11, null, 1998, 2_000));
        base.addBus(new Bus("Андрей Ж.П.", 1812, 10, null, 1984, 3_000));
        base.addBus(new Bus("Сергей Е.М", 1163, 15, null, 2001, 4_000));
        base.addBus(new Bus("Павел П.П.", 1100, 10, null, 2013, 5_000));
        base.addBus(new Bus("Виталий М.П.", 0022, 11, null, 1990, 6_000));
        base.addBus(new Bus("Арсений О.Л", 1525, 16, null, 1995, 7_000));
        base.addBus(new Bus("Григорий Ф.И.", 2065, 17, null, 2020, 8_000));
        base.addBus(new Bus("Фелекс Я.Ь.", 2565, 12, null, 2018, 84_000));
        base.addBus(new Bus("Егор Х.К.", 2455, 11, null, 2016, 800_000));
        base.addBus(new Bus("Влад П.И.", 0565, 10, null, 2015, 108_000));
 
        
        System.out.println("Все автобусы");
        printArrayBus(base.getAllBus());
 
           	System.out.println("Автобусы на 11 маршруте");
        	printArrayBus(base.getBusRoute(11));
         
        		System.out.println("Автобусы со стажем работы > 20 лет");
        		printArrayBus(base.getBusByYear(20));
         
        			System.out.println("Автобусы с пробегом более > 6_000 км");
        			printArrayBus(base.getBusByMileage(6_000));
    }
 
    public static void printArrayBus(Bus[] array) 
    {
        if (array != null) 
        {
            for (Bus bus : array)
            {
                System.out.println(bus);
            }
        }
        System.out.println();
    }
}
 
class BaseBus 
{
    private static final int DEFAULT_LENGTH = 10;
 
    private Bus[] buses;
    private int size;
 
    public BaseBus() 
    {
        this.buses = new Bus[DEFAULT_LENGTH];
    }
 
    public int size() 
    {
        return this.size;
    }
 
    public boolean isEmpty() 
    {
        return this.size == 0;
    }
 
    public boolean addBus(Bus bus) 
    {
        boolean result;
        if (result = bus != null) 
        {
            this.increaseArray();
            this.buses[size++] = bus;
        }
        return result;
    }
 
    private void increaseArray() 
    {
        if (this.size == this.buses.length) 
        {
            this.buses = Arrays.copyOf(this.buses, this.buses.length * 3 / 2 + 1);
        }
    }
 
    public Bus[] getBusRoute(int numberRoute) 
    {
        Bus[] array = new Bus[this.size];
        int count = 0;
        for (int index = 0; index < this.size; index++) 
        {
            if (this.buses[index].getNumberRoute() == numberRoute)
            {
                array[count++] = this.buses[index];
            }
        }
        return Arrays.copyOf(array, count);
    }
 
    public Bus[] getBusByYear(int amountYear) 
    {
        Bus[] array = new Bus[this.size];
        int nowYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
        int count = 0;
        for (int index = 0; index < this.size; index++) 
        {
            if (nowYear - this.buses[index].getYearOperation() > amountYear) 
            {
                array[count++] = this.buses[index];
            }
        }
        return Arrays.copyOf(array, count);
    }
 
    public Bus[] getBusByMileage(int mileage)
    {
        Bus[] array = new Bus[this.size];
        int count = 0;
        for (int index = 0; index < this.size; index++) 
        {
            if (this.buses[index].getMileage() > mileage) 
            {
                array[count++] = this.buses[index];
            }
        }
        return Arrays.copyOf(array, count);
    }
 
    public Bus[] getAllBus() 
    {
        return Arrays.copyOf(this.buses, this.size);
    }
}
 
class Bus
{
    private static final int DEFAULT_YEAR = 2000;
    	private static final String DEFAULT_STR = "unknown";
    		private static final int DEFAULT_NUMBER = 0;
    			private static final int TABS = 4;
     		private final String surnameDriver;
    	private final int numberBus;
    private final int numberRoute;
    		private final String brand;
    	private final int yearOperation;
    private final int mileage;
 
    public String getSurnameDriver() 
    {
        return surnameDriver;
    }
 
    public int getNumberBus() 
    {
        return numberBus;
    }
 
    public int getNumberRoute() 
    {
        return numberRoute;
    }
 
    public String getBrand() 
    {
        return brand;
    }
 
    public int getYearOperation() 
    {
        return yearOperation;
    }
 
    public int getMileage() 
    {
        return mileage;
    }
 
    public Bus(String surnameDriver, int numberBus, int numberRoute, String brand, int yearOperation, int mileage) 
    {
        this.surnameDriver = surnameDriver == null ? DEFAULT_STR : surnameDriver;
        this.numberBus = numberBus < 0 ? DEFAULT_NUMBER : numberBus;
        this.numberRoute = numberRoute < 0 ? DEFAULT_NUMBER : numberRoute;
        this.brand = brand == null ? DEFAULT_STR : brand;
        this.yearOperation = this.checkYear(yearOperation);
        this.mileage = mileage < 0 ? DEFAULT_NUMBER : mileage;
    }
 
    private int checkYear(int year) 
    {
        return String.valueOf(year).length() != 4 ? DEFAULT_YEAR : year;
    }
 
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        String tabs = String.format(String.format("%s%s%s", "%", TABS, "s"), "");
        sb.append("Номер маршрута: ").append(this.numberRoute).append(System.lineSeparator());
        sb.append("_____________Автобус________________").append(System.lineSeparator());
        sb.append(tabs).append("ФИО Водителя: ").append(this.surnameDriver).append(" ").append(System.lineSeparator());
        sb.append(tabs).append("Ввод в эксплуатацию: ").append(this.yearOperation).append(";").append(System.lineSeparator());
        sb.append(tabs).append("№ Автобуса:   ").append(this.numberBus).append(";").append(System.lineSeparator());
        sb.append(tabs).append("Модель:       ").append(this.brand).append(";").append(System.lineSeparator());
        sb.append(tabs).append("Пробег:       ").append(this.mileage).append(" Km;").append(System.lineSeparator());
        sb.append("_____________________________________").append(System.lineSeparator());
        return sb.toString();
    }

}
