/**
 * draggable is the interface that must be implemented into each class.
 * @author Benjamin Miller
 */
public interface Draggable
{
 /**
  * setColor changes the color.
  * @param aColor is a color.
  */
    public void setColor( java.awt.Color aColor );
 /**
  * setLocation changes the location.
  * @param x is the x location.
  * @param y is the y location.
  */
    public void setLocation( int x, int y );
 /**
  * mousePressed is when the mouse is pressed.
  * @param e is the e.
  */
    public void mousePressed( java.awt.event.MouseEvent e );
 /**
  * mouseDragged is when the mouse is dragged.
  * @param e is the e.
  */
    public void mouseDragged( java.awt.event.MouseEvent e );
 /**
  * mouseReleased is when the mouse is released.
  * @param e is the e.
  */
    public void mouseReleased( java.awt.event.MouseEvent e );
}
