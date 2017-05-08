/**
 * Write a description of class Init here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InitState extends State 
{
    // instance variables - replace the example below with your own
    private StationState stationState;
  
    /**
     * Constructor for objects of class Init
     */
   
    public InitState (StationState state)
    {
        stationState = state;
        Screen.getInstance().setMessage("Welcome to Super 5 Gas Station" + "\n" +"Please insert card");
    }
    public void act()
    {
        
    }

     public void moveToNextState(){
        stationState.setState(stationState.getCCScanned());
    }
    
    public boolean canEnterZip(){
        
        return false;
    }
    public boolean canEnterGasType(){
        
        return false;
    }
    public boolean canPump(){
       
        return false;
    }
    public boolean canPrintReceipt(){
       
        return false;
    }
 
}
