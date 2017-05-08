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
    private Screen screen;
    
    private StationState state = StationState.getInstance();
   

    public NumberButton (String label) {
        // set value of the button
        // this value will be repor to Observer when button is click
        super(label);
        this.Value = label;
        this.size = size;
        image = new GreenfootImage(this.size, this.size);
        image.setColor(Color.YELLOW);
        image.fillRect(0, 0, this.size, this.size);
        //image.setTransparency(0);
        setImage(image);
        //super.attach();

        
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
            // make beep
            return;
        }
        
        if (Greenfoot.mousePressed(this))
        {  
            System.out.println(getNumber());
            Zipcode.getInstance().update(getNumber()); 
        }
    }

    

    public void execute(State state)
    {
        screen = getWorld().getObjects(Screen.class).get(0);
       /* if(state.equals(state.INSERTCREDITCARD))
        {
            Zipcode.getInstance().getZipcode();
        }*/
    }
}
