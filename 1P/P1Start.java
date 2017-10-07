/** Ben Miller 1P 
 * Program4.java:
 * Displays a pad for building a Bug.
 *
 * mb 9/15
 * 
 */
import wheelsunh.users.*;
import java.awt.Color;

public class Program4 
{
    
    //---------------- instance variables ------------------------------
    
    private  Rectangle pad;
    public  Ellipse circle;
    public Line line; 
   
    
    
    // -----------------------------------------------------------------
    /** Constructor 
      */
    public Program4( )
    {
       

        
        
        
    } 
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      */
    public static void main(String[] args)
    {
        new Frame( );
        new Bug( 100, 100);
    }
}//End of Class Program4