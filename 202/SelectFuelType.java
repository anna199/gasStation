import greenfoot.*;
 
/**
 * Write a description of class FuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectFuelType extends ScreenState
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class NeedHelp
     */
    private GasGrade gasgrade;
    private boolean mouseDown = false;
    private String fuelType;
    public SelectFuelType(Screen screen)
    {
        this.screen = screen;
        keypad = screen.getWorld().getObjects(Keypad.class).get(0);
    }
  public void chooseFuelType()
    {
        //setMessage("Please choose fuel type!");
        screen.setShowText("Please choose fuel type!");
        screen.setMessage();
        state = State.FUELTYPE;

       gasgrade = screen.getWorld().getObjects(GasGrade.class).get(0);
       MouseInfo mouse = Greenfoot.getMouseInfo();
       
       if( state == State.FUELTYPE && mouseDown == false && Greenfoot.mousePressed(gasgrade) )
       {
           state = State.SHOWFUEL;
           
           mouseDown = true;
        }
        screen.setState(state); 
   }
     public void showFuelType()
    {
        if(state == State.FUELTYPE ){
            state = State.SHOWFUEL;
        } else {
            state = State.PUMPGAS;
        }
        screen.setState(state);
        gasgrade = screen.getWorld().getObjects(GasGrade.class).get(0);    
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(Greenfoot.mousePressed(gasgrade))
        {
            fuelType = gasgrade.chooseFuelType(mouse.getX(),mouse.getY());
            screen.setFuelType(fuelType);
            String showType = " you have chosen #" + fuelType +"\n the pumper is ready.\n please lift the pumper to start";
            screen.setMessage(showType);
            mouseDown = false;
            //Greenfoot.delay(50);//pump code here
        }
    }
}
