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
public class Program5 
{  
  
  
    //---------------- instance variables ------------------------------
  
  /**
   * Program 5 tests all of the classes and methods.
   */
    public Program5( )
    {
 
  
  
    }
  
  /**
   * main tests the classes.
   * @param args is the args.
   */
    public static void main( String[] args ) 
    {
        new Frame();
        Bug b1 = new Bug ( 100 , 100 );
        Button button1 = new Button( 20 , 250 , b1 );
        Bughat b2 = new Bughat( 200 , 100 );
        Button button2 = new Button( 200 , 250 , b2 ); 
        Buglaser b3 = new Buglaser( 300 , 100 );
        Button button3 = new Button( 450 , 250 , b3 );
     
      
      
      
      
      
    }
}