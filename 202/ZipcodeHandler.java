import greenfoot.*; 
/**
 * Write a description of class ZipcodeHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZipcodeHandler extends ScreenState  
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ZipcodeHandler
     */
    private CreditCard creditCard;
    private String zipcode = null;
    public ZipcodeHandler(Screen screen)
    {
        this.screen = screen;
        keypad = screen.getWorld().getObjects(Keypad.class).get(0);
        creditCard =screen.getWorld().getObjects(CreditCard.class).get(0);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
  
    public void insertCreditCard()
    {
        
        Screen.setShowText("Credit card inserted" +"\n" + "Please enter zipcode\n");
          String str = "Credit card inserted" +"\n" + "Please enter zipcode\n";
          screen.setMessage();
          state = State.INSERTCREDITCARD;
          screen.setState(state);
          zipcode = Screen.getZipcode();
            if ( zipcode != null && zipcode.length() <= 5) {
                str = str + "Zipcode entered is "+ "\n";
                str += zipcode;
                Screen.setShowText(str);
                screen.setMessage();
            }
         
        }
    
    public void wrongZipcode()
    {
  
        String str = "Oops, Wrong zipcode.\n Please enter again\n";
        screen.setMessage(str);
        Greenfoot.delay(5);
         zipcode="";
            screen.setZipcode(zipcode);
            
        state = State.INSERTCREDITCARD;
        screen.setState(state);
        
       /* if (zipcode != null && zipcode.length() <= 5) {
            str = str + "Zipcode entered is "+ "\n";
            str += zipcode;
            screen.setMessage(str);
        }
        
        if(keypad.getNum() == -5 && creditCard.checkZipcode(zipcode))
        {
            state = state.NEEDHELP;
            screen.setState(state);
        }
        
        if(keypad.getNum() == -5 && !creditCard.checkZipcode(zipcode))
        {
            zipcode="";
            screen.setZipcode(zipcode);
            keypad.act();
        }*/
    }
}
