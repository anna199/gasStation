import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Screen extends Actor
{
    
    private Message message = new Message();
    private String showText ="START";
    private Keypad keypad;
    //private List<Button> Buttons;
    
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
    private static Screen singleton;

    
    private Screen() {
        showText = "";
        GreenfootImage image = getImage();
        image.scale(300, 200);
    }
    
    public static Screen getInstance() {
        if (singleton == null) {
            singleton = new Screen();
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
       getWorld().addObject(message,400,160);
    }
    public void setShowText(String str)
    {
        this.showText = str;
    }
   
}
