import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Screen extends Actor
{
    
    private Message message = new Message();
    private String showText ="START";
    private Keypad keypad;
    //private List<Button> Buttons;
    
    private CreditCard creditCard;
    //private static String zipcode = null;
    private String fuelType;
    private static State state;
    private boolean isWashed;
    private boolean soundHasPlayed = false;
    private boolean isReciptPrint = false;
    private ZipcodeHandler zipcodeHandler;
    private NeedHelp needHelp;
    private SelectFuelType selectFuelType;
    private CarWash carWash;
    private PumpGas pumpGas;
    private ShowRecipt showRecipt;
    private ReciptState reciptState;
    private long gasPumpTime;
    private static StationState stationState = StationState.getInstance();
    /**
     * Constructor for objects of class Zipcode
     */
    private static Screen singleton;

    
    private Screen() {
        showText = "";
        GreenfootImage image = getImage();
        image.scale(300, 200);
    }
    
    public static Screen getInstance() {
        if (singleton == null) {
            singleton = new Screen();
        }
        return singleton;
    }
   
    
    
    /*public Screen() {
        GreenfootImage image = getImage();
        image.scale(300, 200);
        //zipcode = null;
        this.isWashed = false;
        
    }*/
    public void act() 
    {
        setMessage ();
        
        //setMessage();// Add your action code here.
        /*zipcodeHandler = new ZipcodeHandler(this);
        needHelp = new NeedHelp(this);
        selectFuelType = new SelectFuelType(this);
        carWash = new CarWash(this);
        pumpGas = new PumpGas(this);*/
        //showRecipt = new ShowRecipt(this);
        
        //if (stationState.canEnterZip()) {
            //zipcodeHandler.insertCreditCard();
            //notifyAllObservers();
        //}

    }
        /*if (state == State.WRONGZIPCODE) {
           zipcodeHandler.wrongZipcode();
           notifyAllObservers();
        }*/
        /*if (state == State.NEEDHELP){ 
            needHelp.needHelp();
        }
        if (state == State.HELPINFO){
            needHelp.helpInformation();
        }
        if (state == State.PROCEDE){
           
            needHelp.chooseProceed();
        }
        if(state == State.FUELTYPE){
            selectFuelType.chooseFuelType();
            notifyAllObservers();
        }
        if(state == State.SHOWFUEL)
        {
            selectFuelType.showFuelType();
        }
        if(state == State.CARWASH)
        {
            carWash.chooseWashOrNot();;
        }
        if(state == State.SHOWRECIPT)
        {
            showRecipt.showReceipt();
        }
        if(state == State.BEEP)
        {
            beep();
            setState(State.WELCOME);
            zipcode = null;
        }
        if (state == State.PUMPGAS) {
            pumpGas.pumpingGas();
        }
        if (state == State.PRINTRECIPT) {
            reciptState.printRecipt();
            setMessage();
        }
    }*/
    public void setMessage (String str) 
    {
       showText = str;
    }
    public void setMessage () 
    {
       message.setText(showText);
       getWorld().addObject(message,400,160);
    }
    public void setShowText(String str)
    {
        this.showText = str;
    }
    /*public static void setState(State s) {
        state = s;
    
    }
  
     public State getState()
    {
        return state;
    }
   
       
     public void setFuelType(String str)
    {
        fuelType = str;
    }
    public String getFuelType()
    {
        return fuelType;
    }
    public boolean getIsWashed() {
        return this.isWashed;
    }
     public void setIsWashed(boolean wash) {
       this.isWashed = wash;
    }
  /* public void beep() {
        if (!soundHasPlayed)
        {
            sound.play();
            soundHasPlayed = true; 
        }
        String str = "Beep!\n\nPlease insert credit card first\nand try again!";
        setShowText(str);
        setMessage();
        state = State.WELCOME;
    }*/
    /*public void setExit()
    {
    ExitCommand exitCommand = new ExitCommand();
        Controller controller = new Controller();
        exitCommand.setReceiver(controller);
        exitCommand.execute();
    }
    public void setPrintState( ReciptState reciptState ){
        this.reciptState = reciptState;
    }
    
    public long getPumpTime(){
        return gasPumpTime;
    }
    public void setPumpTime(long time){
        this.gasPumpTime = time;
    }
    
    public void attach(Button button){
        Buttons.add(button);
    }
    
    public void notifyAllObservers(){
        
        for(Button B : Buttons)
        {
            B.execute(this.getState());
        }
    }*/
}
