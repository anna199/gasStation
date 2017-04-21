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

    /**
     * Constructor for objects of class Price
     */
    public Price(){
        fuelPriceMap = new HashMap<>();
        fuelPriceMap.put(87, 2.57);
        fuelPriceMap.put(89, 2.67);
        fuelPriceMap.put(91, 2.77);
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
        return isWashed ? temp * DISCOUNT : temp;
    }
}
