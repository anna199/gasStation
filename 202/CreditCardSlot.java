import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditCardSlot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditCardSlot extends Actor
{
    /**
     * Act - do whatever the CreditCardSlot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Screen screen;
    private CreditCard current_CreditCard;
    private StationState stationstate = StationState.getInstance();
    public CreditCardSlot() {
        GreenfootImage image = getImage();
        image.scale(100, 150);
    }
    public void act() 
    {
        // Add your action code here.
        Actor getCreditCard = getOneObjectAtOffset( 10, 10, CreditCard.class);
        
        if (getCreditCard != null)
        {
            current_CreditCard = (CreditCard) getCreditCard;
            World world = getWorld();
            stationstate.moveToNextState();
            world.removeObject(getCreditCard);
            Screen.getInstance().setMessage("Credit Card Inserted\nPlease type in Zipcode");
            Greenfoot.delay(100);
            world.addObject(getCreditCard,100, 100);
        }
    } 
}
