import greenfoot.*;
/**
 * Write a description of class NotPrintRecipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NotPrintRecipt extends Actor implements ReciptState
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class NotPrintRecipt
     */


    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private Message message = new Message();
    public void printRecipt()
    {
        // put your code here
         Screen.setShowText("Thank you!\nBye!");
    }
}
