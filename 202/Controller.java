/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller implements IActionListener
{    
    public Controller( )
    {
 
    }
    

    public void handleWindowEvent() { }
    public void handleMouseEvent() { }
    public void handleKeyEvent() { }
    public void handleActionEvent( Constants event ) 
    { 
      if ( event == Constants.EXIT_EVENT )
        System.out.println( "  Goodbye!" ) ;
    }
    
}
