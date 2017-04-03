import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keypad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keypad extends Actor
{
    /**
     * Act - do whatever the Keypad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Keypad() {
        GreenfootImage image = getImage();
        image.scale(150, 150);
    }
    public void act() 
    {
        // Add your action code here.
    }
    public int checkEnteredNum() {
        if (Greenfoot.mousePressed(this)) {
           // MouseInfo mouse = Greenfoot.getMouseInfo();
            //if (mouse.getX() == getX() + 5 && mouse.getY() == getY() + 5) {
                return 1;
            //}
           // return 1;
        }
        return -1;
    }
}
