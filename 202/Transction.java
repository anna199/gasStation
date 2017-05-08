/**
 * Write a description of class Init here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transction extends State 
{
    // instance variables - replace the example below with your own
    private StationState stationState;

    /**
     * Constructor for objects of class Init
     */
    public Transction (StationState state)
    {
        stationState = state;
    }

    public void moveToNextState(){
        stationState.setState(stationState.getPump());
    }
    
    public boolean canEnterZip(){
        
        return false;
    }
    public boolean canEnterGasType(){
        
        return true;
    }
    public boolean canPump(){
       
        return false;
    }
    public boolean canPrintReceipt(){
       
        return false;
    }
 
}
