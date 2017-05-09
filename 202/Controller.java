import greenfoot.*;
/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller implements IActionListener
{    
     private Screen screen = Screen.getInstance();
      private StationState stationstate = StationState.getInstance();
    public Controller( )
    {
 
    }
    

    public void handleWindowEvent() { }
    public void handleMouseEvent() { }
    public void handleKeyEvent() { }
    public void handleActionEvent( Constants event ) 
    { 
      if ( event == Constants.EXIT_EVENT )
       {
        Greenfoot.setWorld(new MyWorld());
        screen.setMessage("Welcome to \nSuper 5 Gas Station!" + "\n" +"Please insert card");
        stationstate.setState(stationstate.getInitState());
        Zipcode.getInstance().clear();
        FunctionButton.setCommand("");
    } 
   }
    
}
