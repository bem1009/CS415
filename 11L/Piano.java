import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.*;

public class Piano extends ShapeGroup implements draggable
{

 private Rectangle r1, r2;
 private Color picol, picol2, picol3;
 private Point lastMousePosition;
 private int lastx, lasty;
 
  
  public Piano( Color b )
  {
    r1 = new Rectangle( 100, 100);
    r1.setSize( 100, 60);
    r1.setColor( b );
    add( r1 );
    
    r2 = new Rectangle( 110, 130 );
    r2.setSize( 80, 30);
    r2.setFillColor(Color.WHITE);
    add( r2 );
    
    
    
        
     }
  
  public Piano( int x, int y)
  {
    r1 = new Rectangle( x, y);
    r1.setSize( 100, 60);
    r1.setColor(Color.BLACK);
    add( r1 );
    
    r2 = new Rectangle( x + 10, y + 30 );
    r2.setSize( 80, 30);
    r2.setFillColor(Color.WHITE);
    add( r2 );
    
  }
  
  public void setColor( Color c )
  {
   r1.setColor( c ); 
  }
  
  public Color getColor()
  {
    Color pianocolor = r1.getColor();
    return pianocolor;
  }
  
  Color lastColor;
  
  public void mousePressed( java.awt.event.MouseEvent e)
  {
    picol = r1.getColor();
    lastColor = getColor();
    r1.setColor( Color.GRAY );

    lastMousePosition = e.getPoint();
    lastx = r1.getXLocation();
    lasty = r1.getYLocation();
    
    
  }
  
  public void mouseDragged( java.awt.event.MouseEvent e)
  {
    Point currentPoint = e.getPoint();
   int diffX = currentPoint.x - lastMousePosition.x;
   int diffY = currentPoint.y - lastMousePosition.y;
   setLocation( getLocation().x + diffX, getLocation().y + diffY );
   lastMousePosition = currentPoint;
  }
  
  public void mouseReleased( java.awt.event.MouseEvent e)
  {
    
    r1.setColor( picol );
    Piano s = new Piano( picol );
   
    s.setLocation( lastx, lasty );
    s.setColor( lastColor.darker() );
    
  }
  

  
  
   public static void main( String[] args ) 
    {
        new Frame();
        Piano p1 = new Piano(Color.BLACK);
        Piano p2 = new Piano(200, 200);
        Piano p3 = new Piano(300, 300);
        p3.setColor(Color.GREEN);
        p2.setColor(Color.BLUE);
        
        
   }
}
               
