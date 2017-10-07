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
public class Program7
{  
  
  
    //---------------- instance variables ------------------------------
  
  /**
   * Program 5 tests all of the classes and methods.
   */
    public Program7( )
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
        Watcher w1 = new Watcher();
        b1.addPeer( w1 );
        w1.addPeer( b1 );
        
        
     
      
      
      
      
      
    }
}