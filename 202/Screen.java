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
     private String zipcode;
     private int state;
     private CreditCard creditCard;
    public Screen() {
        GreenfootImage image = getImage();
        image.scale(300, 200);
       // String str = "Welcome to Super 5 Gas Station" + "\n" +"Please insert card";
        //setMessage(str);
    }
    public void act() 
    {
        // Add your action code here.
        if (state == 0 ) {
            welcome();
        }
        if (state == 1) {
            insertCreditCard();
        }
        
    } 
    public void setMessage (String str) 
    {
       message.setText(str);
       getWorld().addObject(message,400,160);
    }
    public void welcome() {
        String str = "Welcome to Super 5 Gas Station" + "\n" +"Please insert card";
        setMessage(str);
        state = 0;
        
    }
    public void insertCreditCard()
    {
        keypad = getWorld().getObjects(Keypad.class).get(0);
        creditCard = getWorld().getObjects(CreditCard.class).get(0);
        String str = "Credit card inserted" +"\n" + "Please enter zipcode\n";
        setMessage(str);
        state = 1;
        //if (Greenfoot.mousePressed(Keypad.class)) {
        if (zipcode != null && zipcode.length() <= 5) {
            str = str + "Zipcode entered is "+ "\n";
            str += zipcode;
            setMessage(str);
        }
        //if (zipcode.length() == 5 && creditCard.checkZipcode(zipcode))
       // {
            //selectGrade();
        //}
        
    }
    public void setZipcode(String str)
    {
        zipcode = str;
    }
    public String getZipcode()
    {
        return zipcode;
    }
    public int getState()
    {
        return state;
    }
    
}
