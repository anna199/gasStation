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
    private StationState stationState;
    private Screen screen;
    private Receipt receipt;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        screen = Screen.getInstance();
        receipt = Receipt.getInstance();
        stationState = StationState.getInstance();
        prepare();
    }
    private void prepare()
    {
        addObject(screen, 400, 200);
        addObject(new CreditCard(), 100, 100);
        addObject(new CreditCardSlot(), 310, 400);
        addObject(new Keypad(screen), 450, 400);
        addObject(receipt,650,200);
        // add overlay buttons
        int x = 400-4;
        int y = 350-3;
        int size = 35;
        for (int i = 0; i < 3; ++i) {
            for(int j = 0; j < 4; ++j) {
                // create button label
                if(j != 3)
                {
                StringBuilder strBuild = new StringBuilder(2);
                strBuild.append(i);
                strBuild.append(j);
                ButtonFactory factory = new ButtonFactory();
                addObject(factory.getButton("NUMBER",strBuild.toString()), x + i*size, y + j*size);
              
                }
                else
                {
                    if(i == 1)
                    {
                        StringBuilder strBuild = new StringBuilder(2);
                        strBuild.append(i);
                        strBuild.append(j);
                         ButtonFactory factory = new ButtonFactory();
                         addObject(factory.getButton("NUMBER",strBuild.toString()), x + i*size, y + j*size);
                    }
                }
                
                // create new button with button label
                
            }
        }//add number buttons
        
           for (int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                // create button label
                if(j != 3)
                {
                    if(i == 3)
                {
                StringBuilder strBuild = new StringBuilder(2);
                strBuild.append(i);
                strBuild.append(j);
                ButtonFactory factory = new ButtonFactory();
                addObject(factory.getButton("FUNCTION",strBuild.toString()), x + i*size, y + j*size);
                }
            }
                else
                {
                    if(i != 1)
                    {
                        StringBuilder strBuild = new StringBuilder(2);
                        strBuild.append(i);
                        strBuild.append(j);
                        ButtonFactory factory = new ButtonFactory();
                        addObject(factory.getButton("FUNCTION",strBuild.toString()), x + i*size, y + j*size);
                    }
                }
                
                // create new button with button label
                
            }
        }//add function buttons
        
        addObject(new GasGrade(), 650, 400);
        
        for(int i = 0; i < 3; ++i) {
            ButtonFactory factory = new ButtonFactory();
            addObject(factory.getButton("FUELTYPE","GAS"+i) , 600 + 60*i, 450);
        }
        
        addObject(new GasPumper(), 130, 400);
        
    }
}
