/**
 * Write a description of class IActionCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitCommand implements IActionCommand
{
    IActionListener target ;
    
    public void execute() 
    {
        target.handleActionEvent( Constants.EXIT_EVENT ) ;
    }
    
    public void setReceiver( IActionListener t ) 
    {
        target = t ;
    }
}
