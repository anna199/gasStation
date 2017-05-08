/**
 * Write a description of class StationState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StationState  
{
    private static StationState stationState;
    
    State initState;
    State ccScanned;
    State transaction;
    State pump;
    State completed;
    
    State state;
    
    /**
     * Constructor for objects of class StationState
     */
    private StationState()
    {
        initState = new InitState(this);
        ccScanned = new CCScanned(this);
        transaction = new Transction(this);
        pump = new Pump(this);
        completed = new Completed(this);   
        
        state = initState;
    }
    
    public static StationState getInstance() {
        if(stationState == null) {
            stationState = new StationState();
        }
            return stationState;
    }

    public void moveToNextState() {
        state.moveToNextState();
    }
    
    public boolean canEnterZip()
    {
        return this.state.canEnterZip();
    }
    public boolean canEnterGasType(){
        return this.state.canEnterGasType();
    }
    public boolean canPump(){
        return this.state.canPump();
    }
    public boolean canPrintReceipt()
    {
        return this.state.canPrintReceipt();
    }
    
    public void setState(State state)
    {
        this.state = state;
    }
     public State getState()
    {
        return this.state;
    }
    
    public State getInitState()
    {
        return initState;
    }
    public State getCCScanned()
    {
        return ccScanned;
    }
    public State getTransaction()
    {
        return transaction;
    }
    public State getPump()
    {
        return pump;
    }
    public State getCompleted()
    {
        return completed;
    }
    
    public void currentState(){
        System.out.println(state.getClass().getName().toString());
    }
}