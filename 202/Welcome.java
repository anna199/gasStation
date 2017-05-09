import greenfoot.*;
/**
 * Write a description of class Welcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welcome extends ScreenState
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Welcome
     */
    private boolean soundHasPlayed = false;
    GreenfootSound sound = new GreenfootSound("sounds/beep.wav");
    private StationState stationState = StationState.getInstance();
    private Zipcode zipcode = Zipcode.getInstance();
    private Screen screen = Screen.getInstance();
    public Welcome()
    {
        this.state = stationState.getInitState();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void run()
    {
       new InitState(stationState);
        this.screen.setMessage("Welcome to Super 5 Gas Station" + "\n" +"Please insert card");
        if (zipcode.getZipcode()!= null) {
            beep();
        }
    
       
    }
    
    public void beep() {

        if (!soundHasPlayed)
        {
            sound.play();
            soundHasPlayed = true; 
        }
        String str = "Beep!\n\nPlease insert credit card first\nand try again!";
        this.screen.setShowText(str);
        this.screen.setMessage();
    }
}
