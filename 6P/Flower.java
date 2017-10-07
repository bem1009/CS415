import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;

/**
 * Flower is another object used in program 6.
 * @author Benjamin Miller
 */
public class Flower extends ShapeGroup implements WeatherSensitive, Draggable
{
    private Rectangle stem;
    private Ellipse flower1, flower2;
    private Point lastMousePosition;
    private RoundedRectangle leaf1, leaf2, dirt1;
    private int xleaf, yleaf;
  
  
  /**
   * Flower makes a flower.
   * @param x is the x coordinate.
   * @param y is the y coordinate.
   */
    public Flower( int x, int y )
    {
        stem = new Rectangle( x, y );
        stem.setSize( 10, 60 );
        stem.setFillColor( Color.GREEN );
        stem.setFrameColor( Color.BLACK );
        add( stem );
       
        flower1 = new Ellipse( x - 20, y - 48 );
        flower1.setSize( 50, 50 );
        flower1.setFillColor( Color.YELLOW );
        flower1.setFrameColor( Color.BLACK );
        add( flower1 );
       
        flower2 = new Ellipse( x - 10, y - 38 );
        flower2.setSize( 30, 30 );
        flower2.setFillColor( Color.ORANGE );
        flower2.setFrameColor( Color.BLACK );
        add( flower2 );
       
      
       
       
       
       
        
        
    }
/**
 * mousePressed is when the mouse is pressed.
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
     * mouseReleased is when the mouse is released.
     * @param e is the e.
     */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
      
    }
    /**
     * setColor changes the color of the flower.
     * @param b is the color
     */
    public void setColor( Color b )
    {
      
    }
    /**
     * warmWeather invokes the warm version of the flower.
     */
    public void warmWeather()
    {
        xleaf = stem.getXLocation();
        yleaf = stem.getYLocation();
      
        flower1.setColor( Color.YELLOW );
        flower2.setColor( Color.ORANGE );
        stem.setColor( Color.GREEN );
      
        leaf1 = new RoundedRectangle( xleaf + 10 , yleaf + 30 );
        leaf1.setSize( 10, 30 );
        leaf1.setFillColor( Color.GREEN );
        leaf1.setFrameColor( Color.BLACK );
        leaf1.setRotation( 50 );
        add( leaf1 );
      
        leaf2 = new RoundedRectangle( xleaf - 10 , yleaf + 35 );
        leaf2.setSize( 10, 30 );
        leaf2.setFillColor( Color.GREEN );
        leaf2.setFrameColor( Color.BLACK );
        leaf2.setRotation( -50 );
        add( leaf2 );
      
        dirt1 = new RoundedRectangle( xleaf - 26, yleaf + 60 );
        dirt1.setSize( 60, 10 );
        dirt1.setColor( Color.BLACK );
        add( dirt1 );
      
      
      
    }
    /**
     * getColor gets the color.
     * @return flowcol.
     */
    public Color getColor()
    {
        Color flowcol = stem.getColor();
        return flowcol;
    }
    /**
     * coldWeather invokes the cold weather version of the flower.
     */
    public void coldWeather()
    {
        stem.setColor( Color.BLACK );
        flower1.setColor( Color.BLACK );
        flower2.setColor( Color.BLACK );
      
        leaf1.hide();
        leaf2.hide();
        dirt1.hide();
      
      
      
    }

/**
 * main program tests the flower.
 * @param args is the ars.
 */
    public static void main( String[] args ) 
    {
        new Frame();
        new Flower( 100, 100 );
    }
}