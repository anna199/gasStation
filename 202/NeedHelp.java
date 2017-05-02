/**
 * Write a description of class NeedHelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NeedHelp extends ScreenState
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class NeedHelp
     */
    public NeedHelp(Screen screen)
    {
        this.screen = screen;
        keypad = screen.getWorld().getObjects(Keypad.class).get(0);
    }

    public void needHelp()
    {
        screen.setMessage("Need Help?\nYes      No");
        state = State.NEEDHELP;
            if(keypad.getNum() == -1)//Yes
            {
                   state = State.HELPINFO;//show help information  
                          
            }
           else if(keypad.getNum() == -2)//No
           {
                  state = State.PROCEDE;//proceed   
           }
           screen.setState(state);
    }
    public void helpInformation()
    {
       screen.setMessage("Help information----------");
       state = State.HELPINFO;
           if(keypad.getNum() == -5)//proceed
           { 
                  state = State.FUELTYPE;
                  screen.setState(state);
           }
           else if(keypad.getNum() == -3)//home
           {
                  state = State.WELCOME;
                  screen.setState(state);
           } 
    }
     public void chooseProceed()
    {
         screen.setMessage("press enter to proceed\npress cancel back to pause");
         state = State.PROCEDE; 
           if(keypad.getNum() == -5)//proceed
           {
               state = State.CARWASH;
               screen.setState(State.CARWASH); // proceed to choose car wash
           }
           else if(keypad.getNum() == -3)//home
           {
               state = State.WELCOME;
               screen.setState(state);
           }
    }
}
