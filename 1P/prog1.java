/** 
 * P1Start.java:
 * Displays a pad for building a Bug.
 *
 * mb 9/15
 * 
 */
import wheelsunh.users.*
import java.awt.Color

Program1
{
    
    //---------------- instance variables ------------------------------
    
    private  Rectangle pad;
    
   
    
    
    // -----------------------------------------------------------------
    /** Constructor 
      */
    public P1Start( )
    {
        pad = new wheelsunh.users.Rectangle( 200, 200 );
        pad.setFillColor( java.awt.Color.WHITE );
        pad.setFrameColor( java.awt.Color.BLACK );
        pad.setSize( 130, 110 );
        //--------------------------------------------
        
        // add your code here
        
        
        
    } 
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      */
    public static void main(String[] args)
    {
        new Frame( );
        P1Start app = new P1Start();
    }
}//End of Class P1Start