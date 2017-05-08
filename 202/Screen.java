import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Screen extends Actor
{
    
    private Message message = new Message();
    private String showText ="START";
 
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
