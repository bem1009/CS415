/** 
 * Piano.java:
 * Displays a pad for building a Piano.
 * @author Benjamin Miller 3P
 * mb 9/15
 * 
 */
import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;

/**
 * Bug is a shapegroup that implements weathersensitive and draggable.
 * @author Benjamin Miller.
 */
public class Bug extends ShapeGroup implements WeatherSensitive, Draggable


  
{
        
    
    //---------------- instance variables ------------------------------
    
    protected Ellipse head, hat3, mit1, mit2, sunglas4, sunglas5;
    protected RoundedRectangle body, hat1, hat2;
    protected Line antenna1, antenna2;
    protected Rectangle leg1, leg2, leg3, leg4, leg5, leg6, head2;
    protected Rectangle sunglas1, sunglas2, sunglas3;
    protected Color bugColor;
    protected int xLocation, yLocation, xhat, yhat, xsun, ysun;
    private Point lastMousePosition;
    
    
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
        lastMousePosition = e.getPoint();
    }
    /**
     * mouseDragged changes the location as the bug is being dragged.
     * @param e is the e.
     */
    public void mouseDragged( java.awt.event.MouseEvent e )
    {
        Point currentPoint = e.getPoint();
        int diffX = currentPoint.x - lastMousePosition.x;
        int diffY = currentPoint.y - lastMousePosition.y;
        setLocation( getLocation().x + diffX, getLocation().y + diffY );
        lastMousePosition = currentPoint;
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
     * warmWeather changes the state of the bug.
     */
    public void warmWeather()
    {
        xsun = head.getXLocation();
        ysun = head.getYLocation();
        sunglas4 = new Ellipse( xsun + 3, ysun + 6 );
        sunglas4.setSize( 5, 6 );
        sunglas4.setColor( Color.BLACK );
        add( sunglas4 );
      
        sunglas5 = new Ellipse( xsun + 12, ysun + 6 );
        sunglas5.setSize( 5, 6 );
        sunglas5.setColor( Color.BLACK );
        add( sunglas5 );
      
        sunglas1 = new Rectangle( xsun + 6, ysun + 7 );
        sunglas1.setSize( 9, 1 );
        sunglas1.setColor( Color.BLACK );
        add( sunglas1 );
      
        sunglas2 = new Rectangle( xsun - 3 , ysun + 6 );
        sunglas2.setSize( 9, 2 );
        sunglas2.setColor( Color.BLACK );
        sunglas2.setRotation( 30 );
        add( sunglas2 );
      
        sunglas3 = new Rectangle( xsun + 14, ysun + 6 );
        sunglas3.setSize( 9, 2 );
        sunglas3.setColor( Color.BLACK );
        sunglas3.setRotation( -30 );
        add( sunglas3 );
      
        hat1.hide();
        hat2.hide();
        hat3.hide();
        mit1.hide();
        mit2.hide();
    }
    /**
     * coldWeather changes the state of the bug.
     */
    public void coldWeather()
    {
        xhat = head.getXLocation();
        yhat = head.getYLocation();
        hat1 = new RoundedRectangle( xhat - 2 , yhat - 7 );
        hat1.setSize( 20 , 7 );
        hat1.setFillColor( Color.WHITE );
        hat1.setFrameColor( Color.BLACK );
        hat1.setFrameThickness( 2 );
        add( hat1 );
      
        hat2 = new RoundedRectangle( xhat + 4, yhat - 25 );
        hat2.setSize( 10 , 20 );
        hat2.setFillColor( Color.RED );
        hat2.setRotation( 10 );
        add( hat2 );
      
        hat3 = new Ellipse( xhat + 6, yhat - 32 );
        hat3.setSize( 10 , 10 );
        hat3.setFillColor( Color.WHITE );
        hat3.setFrameColor( Color.BLACK );
        add( hat3 );
      
        mit1 = new Ellipse( xhat - 10, yhat + 11 );
        mit1.setSize( 9, 9 );
        mit1.setColor( Color.BLACK );
        add( mit1 );
      
        mit2 = new Ellipse( xhat + 22, yhat + 12 );
        mit2.setSize( 9, 9 );
        mit2.setColor( Color.BLACK );
        add( mit2 );
      
        sunglas1.hide();
        sunglas2.hide();
        sunglas3.hide();
        sunglas4.hide();
        sunglas5.hide();
      
                   
      
      
                                  
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
        
      
      
      
      
      
    }   
}