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
    /**
     * Constructor for objects of class GassPumper
     */
    public GasPumper()
    {
        System.out.println("test1");
       int mouseX, mouseY ;
       isPumpStarted = false;
        
    }
    
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            System.out.println("test");
            //pumper image should be disappear, which meanas it's pumping
            //todo: show another image?
            if(!isPumpStarted){
                startPump();
                isPumpStarted = true;
            } else {
                endPump();
                pumperTimeUsed = (endPumpTime-startPumpTime)/1000;
                System.out.println("you pumped " + pumperTimeUsed + " sec");
                /*
                System.out.println(startPumpTime);
                System.out.println(endPumpTime);
                System.out.println(pumperTimeUsed);
                */
            }
        }
    }
    
    private void startPump(){
        this.startPumpTime =  System.currentTimeMillis();
    }
    
    private void endPump(){
        this.endPumpTime =  System.currentTimeMillis();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
