import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Receipt extends Actor
{
    
    private Message message = new Message();
    private String showText;
    
    private CreditCard creditCard;
    //private static String zipcode = null;
    private String fuelType;
    private static State state;
    private boolean isWashed;
    private boolean soundHasPlayed = false;
    private boolean isReciptPrint = false;
    private ZipcodeHandler zipcodeHandler;
    private SelectFuelType selectFuelType;
    private CarWash carWash;
    private PumpGas pumpGas;
    private ShowRecipt showRecipt;
    private ReciptState reciptState;
    private long gasPumpTime;
    private static StationState stationState = StationState.getInstance();
    /**
     * Constructor for objects of class Zipcode
     */
    private static Receipt singleton;

    
    private Receipt() {
        showText = "";
        GreenfootImage image = getImage();
        image.scale(200, 200);
        image.drawRect(650, 200, 200, 200);
        image.setColor(Color.BLUE);
        
//Draw the outline of the specified rectangle.
    }
    
    public static Receipt getInstance() {
        if (singleton == null) {
            singleton = new Receipt();
        }
        return singleton;
    }
   
    public void act() 
    {
        setMessage ();
    }
        
    public void setMessage (String str) 
    {
       showText = str;
    }
    public void setMessage () 
    {
       message.setText(showText);
       getWorld().addObject(message,650,160);
    }
    public void setShowText(String str)
    {
        this.showText = str;
    }
   
}
