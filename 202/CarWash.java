import greenfoot.*;
/**
 * Write a description of class CarWash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWash extends ScreenState
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class CarWash
     */
    public CarWash(Screen screen)
    {
        this.screen = screen;
        keypad = screen.getWorld().getObjects(Keypad.class).get(0);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void chooseWashOrNot() {
        String questionary = "Would you like to wash your car? \n Discount will be applied!";
        screen.setMessage(questionary);
        screen.setState(State.CARWASH);
        
        if (keypad.getNum() == -1) {
            screen.setIsWashed(true);
            String resultString = Price.DISCOUNT * 100 + "% will applied to gas expense!";
           screen.setMessage(resultString);
            Greenfoot.delay(50);
            screen.setState(State.FUELTYPE);
        } else if (keypad.getNum() == -2) {
            screen.setState(State.FUELTYPE);// after choosing car wash, continue to choose fuel type
        }     
    }
}
