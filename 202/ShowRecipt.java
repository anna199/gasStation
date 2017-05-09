import greenfoot.*;
/**
 * Write a description of class ShowRecipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShowRecipt extends ScreenState  
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ShowRecipt
     */
    private Price price; 
    private GasPumper gaspumper;
    private PrintRecipt printRecipt= new PrintRecipt();
    private NotPrintRecipt notPrintRecipt= new NotPrintRecipt();
    private String fuelType;
    public ShowRecipt(Screen screen)
    {
        this.screen = screen;
        this.price = new Price();
        keypad = screen.getWorld().getObjects(Keypad.class).get(0);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void showReceipt()
    {
        /*long time = screen.getPumpTime();
        state = State.SHOWRECIPT;
        String receipt = "You pumped " + time + " sec."; 
        fuelType = screen.getFuelType();
        double cost = price.calculatePrice(time,Integer.parseInt(fuelType),screen.getIsWashed());
        receipt += "\n total cost is $" + cost;
        receipt += "\n print receipt?";
        screen.setMessage(receipt);
        if(keypad.getNum() == -1)//YES
        {
            String reciptResult = "This is your recipt:\n";
            reciptResult += "Gas grade: #" + screen.getFuelType() +"\n";
            reciptResult += "Time used: " + time +" sec\n";
            reciptResult += "Money cost: $" + cost +"\n";
            System.out.println(reciptResult);
            screen.setPrintState(printRecipt);
            state = State.PRINTRECIPT;
            screen.setState(state);
            
        }*/
        /*else if(keypad.getNum() == -2)//NO
        {
            screen.setPrintState(notPrintRecipt);
            state = State.PRINTRECIPT;
            screen.setState(state);
        }*/
    }
}
