/**
 * Write a description of class Pump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pump extends State 
{
    // instance variables - replace the example below with your own
    private StationState stationState;

    /**
     * Constructor for objects of class Pump
     */
    public Pump(StationState state)
    {
        stationState = state;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void moveToNextState(){
        stationState.setState(stationState.getCompleted());
    }
    
    public boolean canEnterZip(){
        // do nothing
        return false;
    }
    public boolean canEnterGasType(){
        // do nothing
        return false;
    }
    public boolean canPump(){
        // do nothing
        return true;
    }
    public boolean canPrintReceipt(){
        // do nothing
        return false;
    }
   
}
