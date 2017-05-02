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
     * Initialize new MyWorld object
     */
    private Screen screen;
    private static MyWorld world;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        screen = new Screen();
        prepare();
    }
    private void prepare()
    {
        addObject(screen, 400, 200);
        addObject(new CreditCard(), 100, 100);
        addObject(new CreditCardSlot(), 310, 400);
        addObject(new Keypad(screen), 450, 400);
        addObject(new GasGrade(), 650, 400);
        addObject(new GasPumper(), 130, 400);
        addObject(new PrintRecipt(), 0,0);
        screen.setState(State.WELCOME);
    }
    public static MyWorld getWorld(){
        return world;
    }
}
