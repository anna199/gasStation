import greenfoot.*;

/**
 * Write a description of class PrintRecipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintRecipt extends Actor implements ReciptState 
{
    // instance variables - replace the example below with your own
   
   
   public PrintRecipt() {
    }
   public void printRecipt(){
       Screen.setShowText("Your recipt is printed in Console\nThank you!\nBye!");
    }
}
