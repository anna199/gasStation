/**
 * Write a description of class StateMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class State  
{
    
    public abstract void moveToNextState(); 
    public abstract boolean canEnterZip();
    public abstract boolean canEnterGasType();
    public abstract boolean canPump();
    public abstract boolean canPrintReceipt();
}
