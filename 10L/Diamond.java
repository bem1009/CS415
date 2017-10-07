import java.awt.Color;
import wheelsunh.users.*;

public class Diamond extends ShapeGroup implements Faller
{  
  private Rectangle level0, level1;
  private int size0 = 80;  
   
  private int dx1   = 10;    
  private int dy1   = 10;
  private int size1 = 60;
   
      
  
  
  
  
  
  public Diamond( int x, int y)
   {
      level0 = new Rectangle( x, y );
      level0.setSize( size0, size0 );
      level0.setColor( Color.BLACK );
      add( level0 );
      level0.setRotation( 45 );
      
      level1 = new Rectangle( x + dx1, y + dy1 );
      level1.setSize( size1, size1 );
      level1.setColor( Color.RED );
      add( level1);
      level1.setRotation( 45 );
      
}

 public void setLocation( int x, int y )
 {
   
 }
    
  
    
  
  
  
  public void mouseClicked( java.awt.event.MouseEvent e)
  {
    
    
    
  }
    
  
  
  
  public void setFallIncrement( int y )
  {
    
  }

   public static void main( String[] args )
   {
      new Frame();
      Diamond d1 = new Diamond( 100, 30);
      Diamond d2 = new Diamond( 300, 30);
      
      
      
      
     
   }
}

  