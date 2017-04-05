import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keypad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keypad extends Actor
{
    /**
     * Act - do whatever the Keypad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   private Screen screen;
    public Keypad() {
        GreenfootImage image = getImage();
        image.scale(150, 150);
    }
    public int getNum(){
        int num = 0;
        if (Greenfoot.mousePressed(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            num = checkEnteredNum(mouse.getX(),mouse.getY());
        }
        return num;
    }
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)) {
          MouseInfo mouse = Greenfoot.getMouseInfo();
          screen = getWorld().getObjects(Screen.class).get(0);
          int num = checkEnteredNum(mouse.getX(),mouse.getY());
          String str = screen.getZipcode();
          if (str != null) { 
              if(num >= 0)
              {
                  if(str.length() < 5)
                  str = str + num;    
              }
              else if(num == -4)
              {
                 str = ""; //clear
              }
              else if(num == -3)
              {
                  str = "";
                  screen.setState(0);//cancel
              }
              else if(num == -5 && screen.getState() == 1)
              {
                  if(str.length() == 5)
                  {
                      screen.setState(3);
                      
                  }
                  else if(str.length() != 5)
                  {
                      str = "";
                      screen.setState(2);//enter again
                      
                   }
              }
          }
          else{
            str = ""+num;
          }
           screen.setZipcode(str);
        }
    }
 
    public int checkEnteredNum(int x, int y) {
        if ( x < getX() - 35  && y < getY() - 35) {
            return 1;
        }
        else if (x > getX() - 35   && x < getX() && y < getY() - 35) {
            return 2;
        }
        else if (x < getX() + 35   && x > getX() && y < getY() - 35) {
            return 3; 
        }
        else if (x > getX() + 35  && y < getY() - 35) {
            return -1; //Yes 
        }
       else if (x < getX() - 35  && y < getY() && y > getY() - 35) {
            return 4;
        }
       else if (x > getX() - 35   && x < getX() && y< getY() && y > getY() - 35) {
            return 5;
        }
       else if (x > getX() && x < getX() + 35 && y < getY() && y > getY() - 35) {
            return 6;
        }
       else if (x > getX() + 35 && y < getY() && y > getY() - 35) {
            return -2; //NO
        }
       else if (x < getX() - 35 && y > getY() && y < getY() + 35) {
            return 7;
       }
       else if (x > getX() - 35   && x < getX() && y > getY() && y< getY() + 35) {
            return 8;
       }
       else if (x > getX()   && x < getX() + 35  && y > getY() && y< getY() + 35) {
            return 9;
       }
       else if (x > getX() + 35 && y > getY() && y< getY() + 35) {
            return -3; //CANCEL
       }
       else if (x < getX() - 35 && y > getY() + 35) {
            return -4; // CLEAR
       } 
       else if (x > getX() - 35   && x < getX() && y > getY() + 35) {
            return 0;
       }
       else if (x > getX() && x < getX() + 35 && y > getY() + 35) {
            return -5; //ENTER
       }
       else if (x > getX() + 35 && y > getY() + 35) {
            return -6; //DEBIT
       }
       return -7;
    }
}
