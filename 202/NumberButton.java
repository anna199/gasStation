import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**3ed2q22
 * Write a description of class NumberButtons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberButton extends Button implements Buttons
{
    private int size = 32;
    private String Value;
    private boolean isClicked = false;
    private GreenfootImage image;
    private Screen screen = Screen.getInstance();
    private Zipcode zipcode = Zipcode.getInstance();
    private boolean soundHasPlayed = false;
    
    private StationState state = StationState.getInstance();
   

    public NumberButton (String label) {
        // set value of the button
        // this value will be repor to Observer when button is click
        super(label);
        this.Value = label;
        this.size = size;
        image = new GreenfootImage(size, size);
        image.setTransparency(0);
        setImage(image);

        
    }
   
    /**
     * Act - do whatever the NumberButtons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String getNumber() 
    {
        if(this.Value.equals("00")) 
            return "1";
        else if(this.Value.equals("10"))
            return "2";
        else if(this.Value.equals("20"))
            return "3";
        else if(this.Value.equals("01"))
            return "4";
        else if(this.Value.equals("11"))
            return "5";
        else if(this.Value.equals("21"))
            return "6";
        else if(this.Value.equals("02"))
            return "7";
        else if(this.Value.equals("12"))
            return "8";
        else if(this.Value.equals("22"))
            return "9";
        else if(this.Value.equals("13"))
            return "0";
        return "";
        // Add your action code here.
    } 

    public String showValue()
    {
        return this.Value;
    }

    public void act()
    {
        if(!state.canEnterZip()) {
            //beep();
            return;
        }
        
        else if (Greenfoot.mousePressed(this))
        {  
            System.out.println(getNumber());
            zipcode.update(getNumber()); 
            
              if ( zipcode.getZipcode() != null && zipcode.getZipcode().length() <= 5) {
                String str = "Credit card inserted" +"\n" + "Please enter zipcode\n";
                str = str + "Zipcode entered is "+ "\n";
                str += zipcode.getZipcode();
                screen.setMessage(str);
                //screen.setMessage();
            }
        }
    }
    /*public void beep() {
        if (!soundHasPlayed)
        {
            sound.play();
            soundHasPlayed = true; 
        }
        String str = "Beep!\n\nPlease insert credit card first\nand try again!";
        setShowText(str);
        setMessage();
        state = State.WELCOME;
    }*/

   
}
