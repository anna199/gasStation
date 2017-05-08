/**
 * Write a description of class Init here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CCScanned extends State 
{
    // instance variables - replace the example below with your own
    private StationState stationState;
  
    /**
     * Constructor for objects of class Init
     */
    public CCScanned (StationState state)
    {
        stationState = state;
    }

    public void moveToNextState(){
        stationState.setState(stationState.getTransaction());
    }
    
    public boolean canEnterZip(){
       
        return true;
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
