/** 
 * P2Start.java:
 * Draws two pads for drawing URV's
 *
 * CS415 
 * Spring 2011
 * 
 */

import wheelsunh.users.*;
import java.awt.Color;

public class P2Start extends wheelsunh.users.Frame
{
    //---------------- instance variables ------------------------------
    private Rectangle pad1, pad2;
    private int x1 = 200, y1 = 200, x2 = 400, y2 = 200;
    private int padX = 130, padY = 110;
    
    // -----------------------------------------------------------------
    /** Constructor for the P2Start class.
     */
    public P2Start( )
    {
        pad1 = new Rectangle( x1, y1 );
        pad1.setFillColor( Color.WHITE );
        pad1.setFrameColor( Color.BLACK );
        pad1.setSize( padX, padY );
       
        pad2 = new Rectangle( x2, y2 );
        pad2.setFillColor( Color.WHITE );
        pad2.setFrameColor( Color.BLACK );
        pad2.setSize( padX, padY );
        //--------------------------------------------
        // add your code starting here
        
        
        
        
    } 
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
     */
    public static void main(String[] args)
    {
        P2Start app = new P2Start();
    }
}//End of Class P2Start