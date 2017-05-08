/**
 * Write a description of class Zipcode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zipcode  
{
    // instance variables - replace the example below with your own
    private StringBuilder zipcode;
    private static Zipcode singleton;

    /**
     * Constructor for objects of class Zipcode
     */
    private Zipcode() {
        zipcode = new StringBuilder(5);
    }
    
    public static Zipcode getInstance() {
        if (singleton == null) {
            singleton = new Zipcode();
        }
        return singleton;
    }
    
    public void update(String x)
    {
        zipcode.append(x);
        System.out.println(getZipcode());
    }
    
    public void remove() {
        zipcode.deleteCharAt(zipcode.length()-1);
    }//remvove one charactar

    public void clear()
    {
        zipcode = new StringBuilder(5);
    }//remove all charactar
    
    public String getZipcode() {
        return zipcode.toString();
    }

}
