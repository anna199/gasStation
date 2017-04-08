import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasGrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasGrade extends Actor
{
    /**
     * Act - do whatever the GasGrade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Screen screen;
    
    public GasGrade() {
        GreenfootImage image = getImage();
        image.scale(200, 150);//
    }
    public void act() 
    {
        
        if (Greenfoot.mousePressed(this))
        {
          MouseInfo mouse = Greenfoot.getMouseInfo();
          screen = getWorld().getObjects(Screen.class).get(0);
          String type = chooseFuelType(mouse.getX(),mouse.getY());
          screen.setFuelType(type);
        }
         //String str = "a87";
        
        //MouseInfo mouse = Greenfoot.getMouseInfo();
        //str += chooseFuelType(mouse.getX(),mouse.getY());
        //screen.setFuelType(str);// Add your action code here.
    }
    public String getType(){
        
        String type = " ";
        if (Greenfoot.mousePressed(this))
        {
            
            MouseInfo mouse = Greenfoot.getMouseInfo();
            type = chooseFuelType(mouse.getX(),mouse.getY());
        }
        return type;
    }
    public String chooseFuelType(int x, int y) {
        if ( x < getX() -35)
       {
           return "87";
       }
       else if( x > getX() -35 && x < getX() + 35)
       {
           return "89";
        }
         else if( x > getX() + 35)
       {
           return "91";
       }
       return "test";
    }
       
}
