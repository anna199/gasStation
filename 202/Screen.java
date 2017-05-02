import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Screen extends Actor
{
   
    private Message message = new Message();
    private static String showText ="";
    private Keypad keypad;
    private CreditCard creditCard;
    private static String zipcode = null;
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
    GreenfootSound sound = new GreenfootSound("sounds/beep.wav");
    
    public Screen() {
        GreenfootImage image = getImage();
        image.scale(300, 200);
       zipcode = null;
        this.isWashed = false;
        
    }
    public void act() 
    {
        // Add your action code here.
        zipcodeHandler = new ZipcodeHandler(this);
        needHelp = new NeedHelp(this);
        selectFuelType = new SelectFuelType(this);
        carWash = new CarWash(this);
        pumpGas = new PumpGas(this);
        showRecipt = new ShowRecipt(this);
       if (state == State.WELCOME){
            (new Welcome(this)).run();
        }
        if (state == State.INSERTCREDITCARD) {
            zipcodeHandler.insertCreditCard();
        }
        if (state == State.WRONGZIPCODE) {
           zipcodeHandler.wrongZipcode();
        }
        if (state == State.NEEDHELP){ 
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
    }
    public void setMessage (String str) 
    {
       message.setText(str);
       getWorld().addObject(message,400,160);
    }
    public void setMessage () 
    {
       message.setText(showText);
       getWorld().addObject(message,400,160);
    }
    public static void setShowText(String str)
    {
        showText = str;
    }
    public static void setState(State s) {
        state = s;
    }
    public static String getZipcode() {
        return zipcode;
    }
     public State getState()
    {
        return state;
    }
     public void setZipcode(String str)
    {
        zipcode = str;
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
   public void beep() {
        if (!soundHasPlayed)
        {
            sound.play();
            soundHasPlayed = true; 
        }
        String str = "Beep!\n\nPlease insert credit card first\nand try again!";
        setShowText(str);
        setMessage();
        state = State.WELCOME;
    }
    public void setExit()
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
}
