import greenfoot.*;
/**
 * Write a description of class PumpGas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PumpGas extends ScreenState
{
    // instance variables - replace the example below with your own
    private GasPumper gaspumper;
    /**
     * Constructor for objects of class PumpGas
     */
    public PumpGas(Screen screen)
    {
        this.screen = screen;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
     public void pumpingGas(){
        gaspumper = screen.getWorld().getObjects(GasPumper.class).get(0);
        if(Greenfoot.mousePressed(gaspumper) && !gaspumper.isStarted()){
            //let's pump
            //System.out.println("let's pump");
            gaspumper.startPump();
        } else if(Greenfoot.mousePressed(gaspumper) && gaspumper.isStarted()){
            //stop pumping, show time & cost.
            //System.out.println("stop pumping, show time & cost.");
            gaspumper.endPump();
            //state = State.SHOWRECIPT;
            //screen.setState(state);
            //screen.setPumpTime(gaspumper.getPumpTime());
        }
    }
    public GasPumper getGasPumper() {
        return gaspumper;
    }
}
