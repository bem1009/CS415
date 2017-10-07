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
public class Bug  


  
{
        
    
    //---------------- instance variables ------------------------------
    
    private Ellipse head;
    private RoundedRectangle body;
    private Line antenna1, antenna2;
    private Rectangle leg1, leg2, leg3, leg4, leg5, leg6;
    protected Color bugColor;
    protected int xLocation, yLocation;
       
        
        
    
   
    
    
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
        
        body = new RoundedRectangle( x + 45, y + 30 );
        body.setFillColor( Color.RED );
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
        leg5.setFillColor( Color.GREEN );
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
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      * 
      */
   
    
    public Bug( ) 
    {
        head = new Ellipse(  10 ,  10 );
        head.setFillColor( Color.RED );
        head.setSize( 20, 20 );
        
        body = new RoundedRectangle( 15 , 30 );
        body.setFillColor( Color.RED );
        body.setSize( 10, 30 );
        
        leg1 = new Rectangle( 7 , 23 );
        leg1.setSize( 4, 15 );
        leg1.setFillColor( Color.GREEN );
        leg1.setRotation( -45 );
        
        leg2 = new Rectangle( 30, 24 );
        leg2.setSize( 4, 15 );
        leg2.setFillColor( Color.GREEN );
        leg2.setRotation( 45 );
        
        leg3 = new Rectangle( 8 , 36 );
        leg3.setSize( 3, 12 );
        leg3.setFillColor( Color.GREEN );
        leg3.setRotation( 90 ); 
        
        leg4 = new Rectangle( 30 , 36 );
        leg4.setSize( 3, 12 );
        leg4.setFillColor( Color.GREEN );
        leg4.setRotation( 90 ); 
        
        leg5 = new Rectangle( 8 , 48 );
        leg5.setSize( 4, 15 );
        leg5.setFillColor( Color.GREEN );
        leg5.setRotation( 45 );
        
        leg6 = new Rectangle( 30 , 48 );
        leg6.setSize( 4, 15 );
        leg6.setFillColor( Color.GREEN );
        leg6.setRotation( -45 );
         
        antenna1 = new Line( 10, 3, 15, 10 );
        antenna1.setColor( Color.BLACK ); 
        
        antenna2 = new Line( 25, 10, 30, 3 );
        antenna2.setColor( Color.BLACK );
      
    }
    /**
     * Bug makes a bug using the color as its variable.
     * @param bugcolor is the color of the body of the bug.
     */
    public Bug( Color bugcolor )
    {
        
        
        head = new Ellipse(  10 ,  10 );
        head.setFillColor( Color.RED );
        head.setSize( 20, 20 );
        
        body = new RoundedRectangle( 15 , 30 );
        body.setFillColor( bugcolor );
        body.setSize( 10, 30 );
        
        leg1 = new Rectangle( 7 , 23 );
        leg1.setSize( 4, 15 );
        leg1.setFillColor( Color.GREEN );
        leg1.setRotation( -45 );
        
        leg2 = new Rectangle( 30, 24 );
        leg2.setSize( 4, 15 );
        leg2.setFillColor( Color.GREEN );
        leg2.setRotation( 45 );
        
        leg3 = new Rectangle( 8 , 36 );
        leg3.setSize( 3, 12 );
        leg3.setFillColor( Color.GREEN );
        leg3.setRotation( 90 ); 
        
        leg4 = new Rectangle( 30 , 36 );
        leg4.setSize( 3, 12 );
        leg4.setFillColor( Color.GREEN );
        leg4.setRotation( 90 ); 
        
        leg5 = new Rectangle( 8 , 48 );
        leg5.setSize( 4, 15 );
        leg5.setFillColor( Color.GREEN );
        leg5.setRotation( 45 );
        
        leg6 = new Rectangle( 30 , 48 );
        leg6.setSize( 4, 15 );
        leg6.setFillColor( Color.GREEN );
        leg6.setRotation( -45 );
         
        antenna1 = new Line( 10, 3, 15, 10 );
        antenna1.setColor( Color.BLACK ); 
        
        antenna2 = new Line( 25, 10, 30, 3 );
        antenna2.setColor( Color.BLACK );
      
    }
    /**
     * setLocation sets the location of the Bug.
     * @param x is the x location that the bug is being set to.
     * @param y is the y location that the bug is being set to.
     */
    public void setLocation( int x, int y )
    {
        head.setLocation( x + 10 , y + 10 );
        body.setLocation( x + 15 , y + 30 );
        leg1.setLocation( x + 7 , y + 23 );
        leg2.setLocation( x + 30 , y + 24 );
        leg3.setLocation( x + 8 , y + 36 );
        leg4.setLocation( x + 30 , y + 36 );
        leg5.setLocation( x + 8 , y + 48 );
        leg6.setLocation( x + 30 , y + 48 );
        antenna1.setLocation( x + 10 , y + 3 );
        antenna2.setLocation( x + 25, y + 10 );
     
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
    * moveUp moves the object towards the top of the frame.
    * @param dy is the number of pixels that the bug will move up.
    * 
    */
    public void moveUp( int dy )
    {
        int getXLocation = body.getXLocation();
        int getYLocation = body.getYLocation();
     
        int x = head.getXLocation();
        int y = head.getYLocation();
        head.setLocation( x  , y - dy );
     
        int xb = body.getXLocation();
        int yb = body.getYLocation();
        body.setLocation( xb , yb - dy );
     
        int x1 = leg1.getXLocation();
        int y1 = leg1.getYLocation();
        leg1.setLocation( x1  , y1 - dy );
     
        int x2 = leg2.getXLocation();
        int y2 = leg2.getYLocation();
        leg2.setLocation( x2 , y2 - dy );
     
        int x3 = leg3.getXLocation();
        int y3 = leg3.getYLocation();
        leg3.setLocation( x3 , y3 - dy );
     
        int x4 = leg4.getXLocation();
        int y4 = leg4.getYLocation();
        leg4.setLocation( x4  , y4 - dy );
     
        int x5 = leg5.getXLocation();
        int y5 = leg5.getYLocation();
        leg5.setLocation( x5 , y5 - dy );
     
        int x6 = leg6.getXLocation();
        int y6 = leg6.getYLocation();
        leg6.setLocation( x6  , y6 - dy );
     
        int x7 = antenna1.getXLocation();
        int y7 = antenna1.getYLocation();
        antenna1.setLocation( x7 , y7 - dy );
     
        int x8 = antenna2.getXLocation();
        int y8 = antenna2.getYLocation();
        antenna2.setLocation( x8 , y8 - dy );
     
      
      
     
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
    * getXLocation accesses the x location of the bug.
    * @return bugXLocation gives the bug its location.
    */
    public int getXLocation( )
    {
        int bugXLocation = body.getXLocation();
        return bugXLocation;
    }
   /**
    * getYLocation accesses the y location of the bug.
    * @return bugYLocation gives the bug its location.
    */
    public int getYLocation( )
    {
        int bugYLocation = body.getYLocation();
        return bugYLocation;
    }
   
 
    /**
       * End of Bug.
       * @author Benjamin Miller.
       * @param args is the args. 
       * 
       */
    public static void main( String[] args ) 
      
    {
        new Frame( );
        Bug b1 = new Bug();
        Bug b2 = new Bug( 100, 300 );
        Bug b3 = new Bug( Color.BLUE );
        b1.setLocation( 300, 300 );
        b2.setColor( Color.GREEN );
        b2.moveUp( 250 );
        Color bugColor = b1.getColor();
        b1.setColor( Color.ORANGE );
        b2.getXLocation();
        b2.getYLocation();
        
        
        
   
       
     
    }
} //End of Class Bug