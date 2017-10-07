/** 
 * Piano.java:
 * Displays a pad for building a Piano.
 * @author Benjamin Miller 3P
 * mb 9/15
 * 
 */
import wheelsunh.users.*;
import java.awt.Color;


public class Bug extends ShapeGroup


  
{
        
    
    //---------------- instance variables ------------------------------
    
    protected Ellipse head;
    protected RoundedRectangle body;
    protected Line antenna1, antenna2;
    protected Rectangle leg1, leg2, leg3, leg4, leg5, leg6, head2;
    protected Color bugColor;
    protected int xLocation, yLocation;
    
    
    protected ShapeGroup bug1;
    
    protected Color colorbug = Color.BLUE;
       
        
        
    
   
    
    
    // -----------------------------------------------------------------
    /** Constructor. 
      * @param x is the x location
      * @param y is the y location
      * 
      */
    public Bug( int x, int y )
    {
        head = new Ellipse( x + 40, y + 10 );
        head.setFillColor( Color.RED );
        head.setSize( 20, 20 );
        add( head );
        
        body = new RoundedRectangle( x + 45, y + 30 );
        body.setFillColor( Color.BLUE );
        body.setSize( 10, 30 );
        add( body );
        
        leg1 = new Rectangle( x + 37, y + 23 );
        leg1.setSize( 4, 15 );
        leg1.setFillColor( Color.GREEN );
        leg1.setRotation( -45 ); 
        add( leg1 );
        
        leg2 = new Rectangle( x + 60, y + 24 );
        leg2.setSize( 4, 15 );
        leg2.setFillColor( Color.GREEN );
        leg2.setRotation( 45 );
        add( leg2 );
        
        leg3 = new Rectangle( x + 38, y + 36 );
        leg3.setSize( 3, 12 );
        leg3.setFillColor( Color.GREEN );
        leg3.setRotation( 90 ); 
        add( leg3 );
        
        leg4 = new Rectangle( x + 60, y + 36 );
        leg4.setSize( 3, 12 );
        leg4.setFillColor( Color.GREEN );
        leg4.setRotation( 90 ); 
        add( leg4 );
        
        leg5 = new Rectangle( x + 38, y + 48 );
        leg5.setSize( 4, 15 );
        leg5.setFillColor( Color.GREEN );
        leg5.setRotation( 45 );
        add( leg5 );
        
        leg6 = new Rectangle( x + 60, y + 48 );
        leg6.setSize( 4, 15 );
        leg6.setFillColor( Color.GREEN );
        leg6.setRotation( -45 );
        add( leg6 );
         
        antenna1 = new Line( x + 40, y + 3, x + 45, y + 10 );
        antenna1.setColor( Color.BLACK ); 
        add( antenna1 );
        
        antenna2 = new Line( x + 55, y + 10, x + 60, y + 3 );
        antenna2.setColor( Color.BLACK );
        add( antenna2 );
        
        
      
    } 
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      * 
      */
   
    
   
    /**
     * Piano makes a bug using the color as its variable.
     * @param bugcolor is the color of the body of the bug.
     */
    public Bug( Color bugcolor )
    {
        
        
        head = new Ellipse(  10 ,  10 );
        head.setFillColor( Color.RED );
        head.setSize( 20, 20 );
        add( head );
        
        body = new RoundedRectangle( 15 , 30 );
        body.setFillColor( bugcolor );
        body.setSize( 10, 30 );
        add( body );
        
        leg1 = new Rectangle( 7 , 23 );
        leg1.setSize( 4, 15 );
        leg1.setFillColor( Color.GREEN );
        leg1.setRotation( -45 );
        add( leg1 );
        
        leg2 = new Rectangle( 30, 24 );
        leg2.setSize( 4, 15 );
        leg2.setFillColor( Color.GREEN );
        leg2.setRotation( 45 );
        add( leg2 );
        
        leg3 = new Rectangle( 8 , 36 );
        leg3.setSize( 3, 12 );
        leg3.setFillColor( Color.GREEN );
        leg3.setRotation( 90 ); 
        add( leg3 );
        
        leg4 = new Rectangle( 30 , 36 );
        leg4.setSize( 3, 12 );
        leg4.setFillColor( Color.GREEN );
        leg4.setRotation( 90 ); 
        add( leg4 );
        
        leg5 = new Rectangle( 8 , 48 );
        leg5.setSize( 4, 15 );
        leg5.setFillColor( Color.GREEN );
        leg5.setRotation( 45 );
        add( leg5 );
        
        leg6 = new Rectangle( 30 , 48 );
        leg6.setSize( 4, 15 );
        leg6.setFillColor( Color.GREEN );
        leg6.setRotation( -45 );
        add( leg6 );
        
        antenna1 = new Line( 10, 3, 15, 10 );
        antenna1.setColor( Color.BLACK ); 
        add( antenna1 );
        
        antenna2 = new Line( 25, 10, 30, 3 );
        antenna2.setColor( Color.BLACK );
        add( antenna2 );
      
    }
   
    
   /**
    * setColor changes the color based on a variable.
    * @param c is the color the bug is being set to.
    */
    public void setColor( Color c )
    {
        body.setColor( c );
     
    }

    
    /**
     * getColor accesses the color of the bug.
     * @return bug2Color gives the bug its color.
     */
    public Color getColor( )
    {
        Color bug2Color = body.getColor();
     
        return bug2Color;
     
     
    }
    /**
     * mousePressed changes the color of the bug when the mouse is pressed.
     * @param e is the e.
     */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        body.setColor( Color.GREEN ); 
    }
    /**
     * mouseReleased changes color of bug back to its original state.
     * @param e is the mouse released.
     */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        body.setColor( Color.BLUE );
    }
    /**
     * activate rotates the bugs legs to make it look like its dancing.
     */ 
    public void activate()
    {
        leg5.setRotation( -70 );
        leg6.setRotation( 70 );
       
    }
    /**
     * deactivate changes the legs back it original state.
     */
    public void deactivate()
    {
        leg5.setRotation( 45 );
        leg6.setRotation( -45 );
    }
  
   
 
    /**
       * End of Piano.
       * @author Benjamin Miller.
       * @param args is the args. 
       * 
       */
    public static void main( String[] args ) 
    {
        new Frame();
        Bug b1 = new Bug( 100, 100 );
        Utilities.sleep( 1000 );
        b1.activate();
        Utilities.sleep( 1000 );
        b1.deactivate();
      
      
      
      
      
    }   
}