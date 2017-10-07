/** 
 * Bug.java:
 * Displays a pad for building a Bug.
 * @author Benjamin Miller 3P
 * mb 9/15
 * 
 */
import wheelsunh.users.*;
import java.awt.Color;

 /** 
 * Creates 4 different bugs based on one method.
 * @author Benjamin Miller
 */ 
public class Buglaser extends Bug
{  
  
  
    //---------------- instance variables ------------------------------
    private Rectangle r1, laser1;
    private Ellipse c1;
  /**
   * Buglaser makes the bug with a laser.
   * @param x is the x coordinate. 
   * @param y is the y coordinate.
   */
    public Buglaser( int x , int y )
    {
     super( x , y );
  
        c1 = new Ellipse( x + 43 , y - 13 );
        c1.setSize( 14, 10 );
        c1.setColor( Color.GREEN );
  
        r1 = new Rectangle( x + 43 , y - 5 );
        r1.setSize( 14, 15 );
        r1.setColor( Color.BLACK );
  
 
        laser1 = new Rectangle( x + 48, y - 114 );
        laser1.setSize( 3, 100 );
        laser1.setColor( Color.RED );
        laser1.hide();
  
  
  
  
  
  
  
  
    
  
  
    }
  /**
   * activate makes the laser on the bug show up.
   * 
   */
    public void activate()
    {
    
        laser1.show();
    }
  /**
   * deactivate makes the laser go away again.
   */
    public void deactivate()
    {
    
        laser1.hide();
    
    }
  
  /**
   * main tests the bug and its methods.
   * @param args is the args.
   */
    public static void main( String[] args ) 
    {
        new Frame();
        Buglaser bL1 = new Buglaser( 100, 100 );
        Utilities.sleep( 1000 );
        bL1.activate();
        Utilities.sleep( 1000 );
        bL1.deactivate();
       
      
      
      
      
      
      
    }
}