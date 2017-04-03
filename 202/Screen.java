import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor
{
    /**
     * Act - do whatever the screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private Message message = new Message();
     private Keypad keypad;
    public Screen() {
        GreenfootImage image = getImage();
        image.scale(300, 200);
       // String str = "Welcome to Super 5 Gas Station" + "\n" +"Please insert card";
        //setMessage(str);
    }
    public void act() 
    {
        // Add your action code here.
        
    } 
    public void setMessage (String str) 
    {
       message.setText(str);
       getWorld().addObject(message,400,150);
    }
    public void welcome() {
        String str = "Welcome to Super 5 Gas Station" + "\n" +"Please insert card";
        setMessage(str);
        
    }
    public void insertCreditCard()
    {
        keypad = getWorld().getObjects(Keypad.class).get(0);
        String str = "Credit card inserted" +"\n" + "Please enter zipcode\n";
        setMessage(str);
        //if (Greenfoot.mousePressed(Keypad.class)) {
        int i = 0;
       if (Greenfoot.mousePressed(Keypad.class) == true)
        {
            str = str + keypad.checkEnteredNum();
            setMessage(str);
            i++;
        }
       // }
    }
}
