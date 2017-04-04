import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    private void prepare()
    {
        Screen screen = new Screen();
        addObject(screen, 400, 200);
        addObject(new CreditCard(), 100, 100);
        addObject(new CreditCardSlot(), 310, 400);
        addObject(new Keypad(), 450, 400);
        addObject(new GasGrade(), 650, 400);
        screen.welcome();
    }
}
