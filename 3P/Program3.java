/** 
 * Program3.java:
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
public class Program3  


  
{
    
    //---------------- instance variables ------------------------------
    
    
    
   
    
    
    // -----------------------------------------------------------------
    /** Constructor. 
      */
    private Program3( )
    {
        
        //--------------------------------------------
        
        // add your code here
        
        makeBug( 50, 50, Color.GREEN );
        makeBug( 100, 200, Color.BLUE );
        makeBug( 70, 350, Color.YELLOW );
        makeBug( 300, 330, Color.RED );
        
    } 
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      * @param bugcolor is the color of the bug
      * @param x is the x coordinate
      * @param y is the y coordinate
      */
    private void makeBug( int x, int y, Color bugcolor )
    {
     
      
       
        Ellipse head;
        RoundedRectangle body;
        Line antenna1, antenna2;
        Rectangle leg1, leg2, leg3, leg4, leg5, leg6;
       
       
        head = new Ellipse( x + 40, y + 10 );
        head.setFillColor( Color.RED );
        head.setSize( 20, 20 );
        
        body = new RoundedRectangle( x + 45, y + 30 );
        body.setFillColor( bugcolor );
        body.setSize( 10, 30 );
        
        leg1 = new Rectangle( x + 37, y + 23 );
        leg1.setSize( 4, 15 );
        leg1.setFillColor( Color.GREEN );
        leg1.setRotation( -45 );
        
        leg2 = new Rectangle( x + 60, y + 24 );
        leg2.setSize( 4, 15 );
        leg2.setFillColor( Color.GREEN );
        leg2.setRotation( 45 );
        
        leg3 = new Rectangle( x + 38, y + 36 );
        leg3.setSize( 3, 12 );
        leg3.setFillColor( Color.GREEN );
        leg3.setRotation( 90 ); 
        
        leg4 = new Rectangle( x + 60, y + 36 );
        leg4.setSize( 3, 12 );
        leg4.setFillColor( Color.GREEN );
        leg4.setRotation( 90 ); 
        
        leg5 = new Rectangle( x + 38, y + 48 );
        leg5.setSize( 4, 15 );
        leg5.setFillColor( Color.BLUE );
        leg5.setRotation( 45 );
        
        leg6 = new Rectangle( x + 60, y + 48 );
        leg6.setSize( 4, 15 );
        leg6.setFillColor( Color.GREEN );
        leg6.setRotation( -45 );
         
        antenna1 = new Line( x + 40, y + 3, x + 45, y + 10 );
        antenna1.setColor( Color.BLACK ); 
        
        antenna2 = new Line( x + 55, y + 10, x + 60, y + 3 );
        antenna2.setColor( Color.BLACK );
    }
    /**
       * End of Program3.
       * @author Benjamin Miller.
       * @param args is the args. 
       * 
       */
    public static void main( String[] args ) 
      
    {
        new Frame( );
        Program3 app = new Program3();
    }
} //End of Class Program3