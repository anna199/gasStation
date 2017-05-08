/**
 * Write a description of class ButtonFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonFactory  
{
   //use getButton method to get object of Button
    public Button getButton(String type, String label){
        switch(type) {
            case "NUMBER": return new NumberButton(label);
            case "FUNCTION": return new FunctionButton(label);
            case "FUELTYPE": return new FuelTypeButton(label);
        }
       return null;
    }

    
}
