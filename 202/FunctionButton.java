import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class functionButtons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FunctionButton extends Button implements Buttons
{
    private int size = 30;
    private String Value;
    private boolean isClicked = false;
    private GreenfootImage image;
    private static String command = "";
    private String help = "";
    private Screen screen = Screen.getInstance();
    private CreditCard creditcard;
    private StationState stationstate = StationState.getInstance();
    private long pauseTime = 0;
    private Zipcode zipcode = Zipcode.getInstance();
    private boolean carWash = false;
    public FunctionButton (String label) {
        // set value of the button
        // this value will be repor to Observer when button is click
        super(label);
        this.Value = label;
        this.size = size;
        image = new GreenfootImage(size, size);
        image.setTransparency(0);
        setImage(image);

    }

    /**
     * Act - do whatever the functionButtons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String getButton() 
    {
        if(this.Value.equals("30"))
            return "Yes";//yes
        else if(this.Value.equals("31"))
            return "No";//no
        else if(this.Value.equals("32"))
            return "Cancel";//canceal
        else if(this.Value.equals("03"))
            return "Clear";//clear
        else if(this.Value.equals("23"))
            return "Enter";//enter
        else if(this.Value.equals("33"))
            return "Debit";//debit
        return "";
        // Add your action code here.
    } 

    public void act()
    {
        if (Greenfoot.mousePressed(this))
        { 
            execute();
        }

    }

    public String showValue()
    {
        return this.Value;
    }

    public void execute()
    {
        if(getButton() == "Cancel")
        {
            backToInit();

        }
        if(stationstate.canEnterZip())
        {   
            help += getButton();
            System.out.println(help);

            if(help.equals("Enter"))
            {
                creditcard = getWorld().getObjects(CreditCard.class).get(0);

                String zip = zipcode.getZipcode();

                if(creditcard.checkZipcode(zip))
                {  
                    screen.setMessage("Do you need help?\nYes      No");

                    System.out.println("correct");

                }
                else
                { 

                    System.out.println("wrong");
                    String str = "Oops, Wrong zipcode.\nPlease enter again\n";
                    screen.setMessage(str);
                    help = "";
                    Zipcode.getInstance().clear();
                }
            }
            else if(help.equals("Clear"))
            {
                Zipcode.getInstance().remove();
                String str = "Credit card inserted" +"\n" + "Please enter zipcode\n";
                str = str + "Zipcode entered is "+ "\n";
                str += zipcode.getZipcode();
                screen.setMessage(str);
                help = "";
            }
          
            if(help.equals("Yes"))
            {
                screen.setMessage("Help information:\nXXXXXXXXXXXXXXXXXX\n\n\nPress Enter to Move\nPress Cancel to cancel process");

            }
            if(help.equals("No"))
            {
                stationstate.moveToNextState();
                screen.setMessage("Please choose fuel Type");
            }
            if(help.equals("EnterEnter"))
            {
                stationstate.moveToNextState();
                screen.setMessage("Please choose fuel Type");
            }

        }

        if(stationstate.canPrintReceipt())
        {
            command += getButton();
            if(command.equals("Yes"))
            {
                Price.getInstance().setCarWash(true);
                screen.setMessage("Print your receipt?");
                carWash = true;
            }
            else if (command.equals("No"))
            {
                Price.getInstance().setCarWash(false); 
                screen.setMessage("Print your receipt?");
                //command += "NotCarWash";
            }
            System.out.println(command);
            //command += getButton();
            
            if(command.equals("YesYes")|| command.equals("YesNo"))
            {
                System.out.println(command);
                screen.setMessage("Thank for choosing \nSuper 5 gas station\nYour price is: " + String.valueOf(Price.getInstance().getPrice()) +"\nYour car wash code is :" + getCarWashCode(1000,9000));
                stationstate.moveToNextState();
                command = "";
            }
            else if(command.equals("NoYes"))
            {               
                screen.setMessage("Thank for choosing \nSuper 5 gas station\nYour price is: " + String.valueOf(Price.getInstance().getPrice()));              
               command = "";
            }
            else if(command.equals("NoNo") )
            {
                screen.setMessage("Thank you for choosing us,Bye!");
                command = "";
            }
            setExit();
        }
    }

    public void wrongZipcode()
    {
        String str = "Oops, Wrong zipcode.\n Please enter again\n";
        Screen.getInstance().setMessage("");

        Zipcode.getInstance().clear();
    }

    public int getCarWashCode(int start,int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }

    public void backToInit()
    {
        Greenfoot.setWorld(new MyWorld());
        screen.setMessage("Welcome to Super 5 Gas Station" + "\n" +"Please insert card");
        stationstate.setState(stationstate.getInitState());
        Zipcode.getInstance().clear();
    } 
    public void setExit()
    {
        ExitCommand exitCommand = new ExitCommand();
        Controller controller = new Controller();
        exitCommand.setReceiver(controller);
        exitCommand.execute();
    }
}

