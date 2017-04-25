import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GassPumper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumper extends Actor
{
    // instance variables - replace the example below with your own
    private long pumperTimeUsed; //time in second    
    private boolean isPumpStarted;
    private long startPumpTime;
    private long endPumpTime;
    private boolean isPumpActive;
    private Screen screen;
    /**
     * Constructor for objects of class GassPumper
     */
    public GasPumper()
    {
       int mouseX, mouseY;
       isPumpStarted = false;
       isPumpActive = false;
    }
    
    public void act() 
    {
		/*
        if (Greenfoot.mousePressed(this)) {
            
            //pumper image should be disappear, which meanas it's pumping
            //todo: show another image?
            if(!isPumpActive){
                //maybe alart "dont touch me!" :p
            } else if(!isPumpStarted){
                startPump();
                isPumpStarted = true;
            } else {
                endPump();
				isPumpActive = false;
                pumperTimeUsed = (endPumpTime-startPumpTime)/1000;
                System.out.println("you pumped " + pumperTimeUsed + " sec");
            }
        }
		*/
    }
    
    public void startPump(){
		isPumpStarted = true;
		screen = getWorld().getObjects(Screen.class).get(0);
		screen.setMessage("Pumping started, \n Click again to stop.");
        this.startPumpTime =  System.currentTimeMillis();
    }
    public void endPump(){
        this.endPumpTime =  System.currentTimeMillis();
    }
	public void activePumper(){
		this.isPumpActive = true;
	}
	public boolean isStarted(){
		return isPumpStarted;
	}
	public long getPumpTime(){
	    pumperTimeUsed = (endPumpTime-startPumpTime)/1000;
	    return pumperTimeUsed;
	}
	
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
