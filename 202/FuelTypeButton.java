import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fuelTypeButtons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelTypeButton extends Button implements Buttons
{
    /**
     * Act - do whatever the fuelTypeButtons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int size = 50;
    private String Value;
    private boolean isClicked = false;
    private GreenfootImage image;
    private String type;
    private Screen screen = Screen.getInstance();;
    private StationState state = StationState.getInstance();

    public FuelTypeButton (String label) {
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
     * Act - do whatever the functionButtons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String getNumber() 
    {
        if(this.Value.equals("GAS0")) {
            return "87";
        }
        else if(this.Value.equals("GAS1"))
            return "89";
        else if(this.Value.equals("GAS2"))
            return "91";
        return "";
        // Add your action code here.
    } 

    public void act()
    {

        if(!state.canEnterGasType()) {
            // make beep
            //state.currentState();
            return;
        }

        else if (Greenfoot.mousePressed(this))
        {  
            System.out.println(this.Value);
            Price.getInstance().setType(Integer.parseInt(getNumber()));
          
            screen.setMessage("You have choosed  " + getNumber() +"\n Please remove the pump");
            //Greenfoot.delay(300);
            //screen.setMessage("please remove the pump");
             state.moveToNextState();
        }
    }  

    public String GetContent()
    {
        return type;
    }

}
