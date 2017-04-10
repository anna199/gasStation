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
     private CreditCard creditCard;
     private GasGrade gasgrade;
     private String zipcode;
     private String fuelType;
     private int state;
     private boolean mouseDown = false;
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
        if (state == 2) {
            wrongZipcode();
        }
        if (state == 3){ 
           needHelp();
        }
   
       if (state == 4){
         helpInformation();
        
        }
        if (state == 5){
           
         chooseProceed();
        }
        if(state == 6){
         
            chooseFuelType();
        }
       if(state == 7)
       {
           showFuelType();
       }
       if(state == 8)
       {
           showReceipt();
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
    public void wrongZipcode()
    {
   
        keypad = getWorld().getObjects(Keypad.class).get(0);
        String str = "Oops,Wrong zipcode.\n Please enter again\n";
        creditCard = getWorld().getObjects(CreditCard.class).get(0);
        setMessage(str);
        state = 2;
        if (zipcode != null && zipcode.length() <= 5) {
            str = str + "Zipcode entered is "+ "\n";
            str += zipcode;
            setMessage(str);
        }
        
        if(keypad.getNum() == -5 && creditCard.checkZipcode(zipcode))
        {
            state = 3;
        }
        
        if(keypad.getNum() == -5 && !creditCard.checkZipcode(zipcode))
        {
            state = 2;
            zipcode="";
            keypad.act();
            
        }
    }
    public void needHelp()
    {
        keypad = getWorld().getObjects(Keypad.class).get(0);
        setMessage("Need Help?\nYes      No");
        state = 3;
            if(keypad.getNum() == -1)//Yes
                       {
                          state = 4;//show help information  
                          
                       }
                       else if(keypad.getNum() == -2)//No
                       {
                           state = 5;//proceed   
                       }
    }
    public void helpInformation()
    {
       keypad = getWorld().getObjects(Keypad.class).get(0);
       setMessage("Help information----------");  
       state = 4;
           if(keypad.getNum() == -5)//proceed
                          { 
                           state = 6;
                          }
                          else if(keypad.getNum() == -3)//home
                          {
                          state = 0;
                          } 
    }
    public void chooseProceed()
    {
         keypad = getWorld().getObjects(Keypad.class).get(0);
         setMessage("press enter to proceed\npress cancel back to pause"); 
         state = 5; 
           if(keypad.getNum() == -5)//proceed
           {
               state = 6;
           }
           else if(keypad.getNum() == -3)//home
           {
               state = 0;
           }
    }
    public void chooseFuelType()
    {
        keypad = getWorld().getObjects(Keypad.class).get(0);
        setMessage("Please choose fuel type!");
        state = 6;

       gasgrade = getWorld().getObjects(GasGrade.class).get(0);
       MouseInfo mouse = Greenfoot.getMouseInfo();
       
       if( state == 6 && mouseDown == false && Greenfoot.mousePressed(gasgrade) )
       {
           state = 7;
           
           mouseDown = true;
        }
          
       }
       
    public void showFuelType()
    {
        state = 7;
        gasgrade = getWorld().getObjects(GasGrade.class).get(0);
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
       
       
        
         if(Greenfoot.mousePressed(gasgrade))
           {
             fuelType = gasgrade.chooseFuelType(mouse.getX(),mouse.getY());
             String showType = "you have choosed #" + fuelType;
             setMessage(showType);
             //state = 8;
             mouseDown = false;
             Greenfoot.delay(50);//pump code here
             setState(8);
           }
        
        
    }
    public void showReceipt()
    {
    state = 8;
    String receipt = "print receipt?";
    setMessage(receipt);
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
    public void setState(int i)
    {  
        state = i;
    }
     public void setFuelType(String str)
    {
        fuelType = str;
    }
    public String getFuelType()
    {
        return fuelType;
    }
    
}
