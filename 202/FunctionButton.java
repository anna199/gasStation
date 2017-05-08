import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class functionButtons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FunctionButton extends Button implements Buttons
{
    private int size = 30;
    private String Value;
    private boolean isClicked = false;
    private GreenfootImage image;
    private String command = "";
    private Screen screen = Screen.getInstance();
    private CreditCard creditcard;
    private StationState stationstate = StationState.getInstance();
    

    private Zipcode zipcode = Zipcode.getInstance();
    
    public FunctionButton (String label) {
        // set value of the button
        // this value will be repor to Observer when button is click
        super(label);
        this.Value = label;
        this.size = size;
        image = new GreenfootImage(size, size);
        //image.setColor(Color.RED);
        //image.fillRect(0, 0, size, size);
        image.setTransparency(0);
        setImage(image);
        //super.attach();
    }/**
     * Act - do whatever the functionButtons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public String getButton() 
    {
        if(this.Value.equals("30"))
        return "Yes";//yes
        else if(this.Value.equals("31"))
        return "No";//no
        else if(this.Value.equals("32"))
        return "Cancel";//canceal
        else if(this.Value.equals("03"))
        return "Clear";//clear
        else if(this.Value.equals("23"))
        return "Enter";//enter
        else if(this.Value.equals("33"))
        return "Debit";//debit
        return "";
        // Add your action code here.
    } 
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        { 
          execute();}
       
    }
    public String showValue()
    {return this.Value;}
    
    
    public void execute()
    {
       
        if(stationstate.canEnterZip())
        {
            if(getButton() == "Enter")
            {
                creditcard = getWorld().getObjects(CreditCard.class).get(0);
     
                String zip = zipcode.getZipcode();
                    if(creditcard.checkZipcode(zip))
                      {
                          System.out.println("correct");
                          stationstate.moveToNextState();
                          screen.setMessage("Please choose gas type");
         
                      }
                      else
                      { 
                          
                          System.out.println("wrong");
                          wrongZipcode();
                      }
            }
            
            else if(getButton() == "Cancel")
            {
                Greenfoot.setWorld(new MyWorld());
                //new Welcome().run();
            }
            else if(getButton() == "Clear")
            {
                Zipcode.getInstance().remove();
            }
        }
        if(stationstate.canPrintReceipt())
        {
     
           if(getButton() == "Yes")
           {
               Price.getInstance().setCarWash(true);
               

           }
           else if (getButton() == "No")
           {
               Price.getInstance().setCarWash(false);
           }
          Greenfoot.delay(100);
            screen.setMessage("would you like to print your receipt?");
            if(getButton() == "Yes")
            {
                screen.setMessage(String.valueOf(Price.getInstance().getPrice()));
            }
            else if (getButton() == "No")
            {
                
            }
            
               
        }
    }
    
    public void wrongZipcode()
    {
        String str = "Oops, Wrong zipcode.\n Please enter again\n";
        Screen.getInstance().setMessage("");
   
        Zipcode.getInstance().clear();
    }
}
