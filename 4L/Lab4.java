

// --------------- imports ------------------------------
import wheelsunh.users.*;
import java.awt.Color;
/** 
 * Lab4.java.
 * 
 * 
 * 
 * @author rdb and mlb
 * 
 */
public class Lab4 
{
    //---------------- instance variables ------------------------------
    
    // -----------------------------------------------------------------
    /** 
     * Constructor for the Lab4 class.
     */
    public Lab4( )
    {
        // local "constant" variables define location/size of each circle
        int    target1X   = 0, target1Y = 0;
        int    targetSize = 80;
        
       
        int    target2X =300, target2Y =300;
        
       
        
        
        // Add declarations for data needed for sizes/offsets of inner rings 
        int    ring1Size = 60;
        int    offset = (targetSize - ring1Size)/2;
        int    ring2Size = 40;
        int    offset2 = (targetSize - ring2Size)/2;
        int    ring3Size = 20;
        int    offset3 = (targetSize - ring3Size)/2;
        
    
        
        
        // local variables to reference
        // the Wheels objects used to draw target.
        Ellipse    target1, target2;
        Ellipse circle;
        Ellipse circle2, circle3, circle4, circle5, circle6, circle7, circle8;
        
        
        // Add declarations for Wheels variables for inner circles 
        
        
        //create the blue "target"
        circle = new Ellipse( 300, 0 );
        circle.setSize( 80, 80 );
        circle.setColor( Color.BLUE );
        
        // add your code to create the yellow circle centered
        // on the blue circle
        
        circle2 = new Ellipse( 310,10);
        circle2.setSize( 60, 60);
        circle2.setColor( Color.YELLOW); 
        
        // create the outer circle or the red target
        target1 = new Ellipse( target1X, target1Y );
        target1.setSize( targetSize, targetSize );
        target1.setColor( Color.RED );
        
        // create the 3 inner circles
        //  Add code here to create the inner circles
        
        circle3 = new Ellipse( target1X + offset, target1X + offset); 
        circle3.setSize( ring1Size, ring1Size);
        circle3.setColor( Color.BLUE);
        
        circle4 = new Ellipse( target1X + offset2, target1X + offset2);
        circle4.setSize( ring2Size, ring2Size);
        circle4.setColor( Color.GREEN);
        
        circle5 = new Ellipse( target1X + offset3, target1X + offset3);
        circle5.setSize( ring3Size, ring3Size); 
        circle5.setColor( Color.ORANGE);
        
        target2 = new Ellipse( target2X, target2Y );
        target2.setSize( targetSize, targetSize );
        target2.setColor( Color.RED );
        
        circle6 = new Ellipse( target2X + offset, target2X + offset); 
        circle6.setSize( ring1Size, ring1Size);
        circle6.setColor( Color.BLUE);
        
        circle7 = new Ellipse( target2X + offset2, target2X + offset2);
        circle7.setSize( ring2Size, ring2Size);
        circle7.setColor( Color.GREEN);
        
        circle8 = new Ellipse( target2X + offset3, target2X + offset3);
        circle8.setSize( ring3Size, ring3Size); 
        circle8.setColor( Color.ORANGE);
       
        target2X = 100;
        target2Y = 100;
        
        target2 = new Ellipse( target2X, target2Y );
        target2.setSize( targetSize, targetSize );
        target2.setColor( Color.RED );
        
        circle6 = new Ellipse( target2X + offset, target2X + offset); 
        circle6.setSize( ring1Size, ring1Size);
        circle6.setColor( Color.BLUE);
        
        circle7 = new Ellipse( target2X + offset2, target2X + offset2);
        circle7.setSize( ring2Size, ring2Size);
        circle7.setColor( Color.GREEN);
        
        circle8 = new Ellipse( target2X + offset3, target2X + offset3);
        circle8.setSize( ring3Size, ring3Size); 
        circle8.setColor( Color.ORANGE);
       
        
    } 
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      * 
      * @param  args String
      */
    public static void main( String[] args )
    {
        new Frame( );
        Lab4 app = new Lab4();
    }
} //End of Class Lab4