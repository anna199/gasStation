import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit_card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditCard extends Actor
{
    /**
     * Act - do whatever the Credit_card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String zipcode;
    public CreditCard() {
        GreenfootImage image = getImage();
        image.scale(150, 100);
        zipcode ="95112";
    }
    public void act() 
    {
        // Add your action code here.
          int mouseX, mouseY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
        }
        
    }
    public boolean checkZipcode(String str)
    {
        //System.out.format("'%s' ? '%s'\n", str, zipcode);
        return str.equals(zipcode);
    }
}
