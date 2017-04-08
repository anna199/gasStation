import greenfoot.*; 
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
public class Message extends Actor
{
    public Message()
    {
        updateImage("");;
    }
     
    public Message(String text)
    {
        updateImage(text);
    }
     
    public void setText(String text)
    {
        updateImage(text);
    }
     
    private void updateImage(String text)
    {
       GreenfootImage g=new GreenfootImage(200,80);
       g.setColor(greenfoot.Color.WHITE);
       g.fill();
       g.setColor(greenfoot.Color.BLACK);
       g.drawString(text,10,20);
       setImage(g);  
    }
    
}

