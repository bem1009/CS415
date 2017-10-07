import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;

/**
 * Tree class makes a tree in warm and cold weather.
 * @author Benjamin Miller
 */
public class Tree extends ShapeGroup implements WeatherSensitive, Draggable
{
    protected RoundedRectangle tree1;
    protected Ellipse tree2, snow1, snow2, sun1, apple1, apple2, apple3, apple4;
    private Point lastMousePosition;
    private int xsnow, ysnow, xsun, ysun;
   
  /**
   * Tree makes the tree.
   * @param x is the x coordinate.
   * @param y is the y coordinate.
   */
    public Tree( int x, int y )
    {
        tree1 = new RoundedRectangle( x, y );
        tree1.setSize( 30, 100 );
        tree1.setColor( Color.BLACK );
        add( tree1 );
        
        tree2 = new Ellipse( x - 30, y - 50 );
        tree2.setSize( 90, 90 );
        tree2.setColor( Color.GREEN );
        add( tree2 );
        
       
    }
    /**
     * mousePressed gets the point the mouse is pressed.
     * @param e is the e.
     */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        lastMousePosition = e.getPoint();
    }
    /**
     * mouseDragged is when the mouse is dragged.
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
     * mouseReleased.
     * @param e is the mouse released.
     */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        tree1.setColor( Color.BLACK );
    }
    /**
     * getColor returns the color.
     * @return treecol.
     */
    public Color getColor()
    {
        Color treecol = tree2.getColor();
        return treecol;
    }
    /**
     * setColor changes the color.
     * @param b is the color.
     */
    public void setColor( Color b )
    {
        tree1.setColor( b );
    }
    
   
    /**
     * warmWeather is when the tree is in warm weather.
     */
    public void warmWeather()
    {
        xsun = tree2.getXLocation();
        ysun = tree2.getYLocation();
        sun1 = new Ellipse( xsun + 10, ysun + 25 );
        sun1.setSize( 10, 10 );
        sun1.setFillColor( Color.RED );
        sun1.setFrameColor( Color.BLACK );
        add( sun1 );
      
        apple1 = new Ellipse( xsun + 50, ysun + 30 );
        apple1.setSize( 10, 10 );
        apple1.setFillColor( Color.RED );
        apple1.setFrameColor( Color.BLACK );
        add( apple1 );
      
        apple2 = new Ellipse( xsun + 20, ysun + 60 );
        apple2.setSize( 10, 10 );
        apple2.setFillColor( Color.RED );
        apple2.setFrameColor( Color.BLACK );
        add( apple2 );
      
        apple3 = new Ellipse( xsun + 60, ysun + 70 );
        apple3.setSize( 10, 10 );
        apple3.setFillColor( Color.RED );
        apple3.setFrameColor( Color.BLACK );
        add( apple3 );
      
        apple4 = new Ellipse( xsun + 40, ysun + 10 );
        apple4.setSize( 10, 10 );
        apple4.setFillColor( Color.RED );
        apple4.setFrameColor( Color.BLACK );
        add( apple4 );
      
        snow1.hide();
        snow2.hide();
    }
    /**
     * coldWeather is when the tree is in cold weather.
     */
    public void coldWeather()
    {
        xsnow = tree2.getXLocation();
        ysnow = tree2.getYLocation();
        snow1 = new Ellipse( xsnow + 5, ysnow );
        snow1.setSize( 60, 40 );
        snow1.setFillColor( Color.WHITE );
        snow1.setFrameColor( Color.GREEN );
        add( snow1 );
      
        snow2 = new Ellipse( xsnow + 50 , ysnow + 40 );
        snow2.setSize( 20, 40 );
        snow2.setFillColor( Color.WHITE );
        snow2.setFrameColor( Color.GREEN );
        add( snow2 );
      
        sun1.hide();
        apple1.hide();
        apple2.hide();
        apple3.hide();
        apple4.hide();
      
        
    }

    /**
     * main tests the tree.
     * @param args is the args.
     */
    public static void main( String[] args ) 
    {
        new Frame();
        Tree t1 = new Tree( 200, 200 ); 
     
 
 
    }
}