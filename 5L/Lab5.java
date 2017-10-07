

// --------------- imports ------------------------------
import wheelsunh.users.*;
import java.awt.Color;


/** 
 * Lab5.java.
 * 
 * The entire target is built in a method, makeTarget.
 * This version only uses a single circle shape to make the target.
 * 
 * After completion of the lab it should:
 * 
 * Display a simple archery target using multiple Wheels Shapes.
 * The entire target is built in a method, makeTarget.
 * 
 *     makeTarget has position arguments.
 *
 * 
 * makeCenteredCircle has x,y, radius, color parameters
 * 
 * 
 * @author rdb
 */
public class Lab5 extends Frame
{
    //---------------- instance variables ------------------------------
    
    // -----------------------------------------------------------------
    /** 
     * Constructor for the Lab5 class.
     */
    public Lab5( )
    {
        makeTarget(300, 50); // this line will be edited to add parameters
     
        // add more calls to the new makeTarget
       
        makeTarget( 100, 100);
        makeTarget( 250, 200);
        
        // add calls to completed makeCenteredCircle
        
        makeCenteredCircle(400, 400, 20, Color.GREEN );
        makeCenteredCircle( 0, 0, 30, Color.RED);
        makeCenteredCircle( 100, 100, 30, Color.BLACK);
        
    } 
    
    // -----------------------------------------------------------------
    /**
     * makeTarget.
     * encapsulates all the Wheelsunh components needed to draw a target
     * 
     * Will need to add (x,y) parameters to the method
     */
    public void makeBug( int x, int y)
    {
        
        int    outerX     =  0,  outerY  = 0;
        int    outerSize  = 80;
        
       
        
        // local variables to reference objects used to draw the target.
        Ellipse    outer;
       
        
       
        
         Ellipse    inner, inner2, inner3;
         
        
        outer = new Ellipse( outerX + x, outerY + y );
        outer.setSize( outerSize, outerSize );
        outer.setColor( Color.RED );
      
        
        
        inner = new Ellipse( outerX + x + 10, outerY + y + 10);
        inner.setSize( outerSize - 20, outerSize - 20);
        inner.setColor( Color.BLUE);
        
        inner2 = new Ellipse( outerX + x + 20, outerY + y + 20);
        inner2.setSize( outerSize - 40, outerSize - 40);
        inner2.setColor( Color.GREEN);
        
        inner3 = new Ellipse( outerX + x + 30, outerY + y + 30);
        inner3.setSize( outerSize - 60, outerSize - 60);
        inner3.setColor( Color.YELLOW);
    }
    // -----------------------------------------------------------------
    /**
     * makeCenteredCircle.
     * create a circle centered on a 
     * point with a given radius and color
     * 
     * @param x int
     * @param y int
     * @param radius int
     * @param color Color
     */
    public void makeCenteredCircle( 
                                 int x, int y, int radius, Color color)
      
      
    
       // <-- Add your code to create a centered circle below -------->
    {   
       
       Ellipse centercirc; 
       
       centercirc = new Ellipse( x - radius, y - radius);
       centercirc.setSize( 2 * radius , 2 * radius);
       centercirc.setColor(color);
      
      
    }
    
    //-----------------------------------------------------------------
    
    
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      * 
      * @param args String
      */
      
    public static void main( String[] args )
    {
        Lab5 app = new Lab5();
    }
} //End of Class Lab5
