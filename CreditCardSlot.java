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
            screen = world.getObjects(Screen.class).get(0);
            screen.insertCreditCard();
            
            world.removeObject(getCreditCard);
            Greenfoot.delay(100);
            world.addObject(getCreditCard,100, 100);
        }
    } 
}
