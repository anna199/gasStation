import java.util.*;
/**
 * Write a description of class Price here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Price  
{
    public static final double DISCOUNT = 0.9;
    public static final double PUMP_SPEED = 13; // 13 gallons/min
    // instance variables - replace the example below with your own
    private Map<Integer, Double> fuelPriceMap;
    private static Price price;
    private int gasType;
    private long time;
    private boolean carWash;

    /**
     * Constructor for objects of class Price
     */

    public Price(){
        fuelPriceMap = new HashMap<>();
        fuelPriceMap.put(87, 2.57);
        fuelPriceMap.put(89, 2.67);
        fuelPriceMap.put(91, 2.77);
    }

    public static Price getInstance() {
        if(price == null) {
            price = new Price();
        }
        return price;
    }

    public void setType(int type)
    {
        this.gasType = type;
    }

    public void setTime(long time)
    {
        this.time = time;
    }
    public int getType()
    {
        return this.gasType;
    }
    public long getTime()
    {
        return this.time;
    }
    public void setCarWash(boolean carWash)
    {
        this.carWash = carWash;
    }
    /**
     * Assume gas pump pumps 13 US gallons per minute
     * 
     * @param  time  How long user pump the nozzel, in second unit
     *         fuelType 87/89/91
     * @return     calculated price 
     */
    public double calculatePrice(double time, int fuelType, boolean isWashed) {
        
        double temp = (time / 60) * PUMP_SPEED * fuelPriceMap.get(fuelType);
        double temp1 = isWashed ? temp * DISCOUNT : temp;
        return round(temp1,2);
    }
    public double getPrice()
    {
        return calculatePrice(time,gasType,carWash);
    } 
    public boolean getCarWash()
    {
        return carWash;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
