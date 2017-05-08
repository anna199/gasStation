import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String label;
    protected Screen screen;
    protected State state;
    protected StationState stationstate = StationState.getInstance();

    public Button (String label) {
        this.label = label;
        stationstate.attach(this);
        //attach();
    } 
    public void update(State states) {
        this.state = state;  
    }
    

   //public abstract void execute(State state);
   
}
