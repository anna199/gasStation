/**
 * Write a description of class IActionCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IActionCommand
{
    void execute() ;
    void setReceiver( IActionListener target ) ;
}
