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
    public Welcome(Screen screen)
    {
        state = State.WELCOME;
        this.screen = screen;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void run()
    {
        Screen.setShowText("Welcome to Super 5 Gas Station" + "\n" +"Please insert card");
        screen.setMessage();
        if (Screen.getZipcode() != null) {
            state = state.BEEP;
        }
        setState();
    }
    public void setState()
    {
        Screen.setState(state);
    }
}
