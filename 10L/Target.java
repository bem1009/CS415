/** 
 * Target.java
 *    Initial implementation where grouping is done "by hand".
 *    Used in 09-Interface notes
 * 
 * rdb - September 2009 
 *    derived from earlier targets
 */

import java.awt.Color;
import wheelsunh.users.*;

public class Target extends ShapeGroup implements Faller
{
   //---------------- instance variables --------------------------------
   private Ellipse level0, level1, level2;  // 3 circles comprise the target
   
   //---------------- magic constants -----------------------------------
   private int size0 = 80;  // outer circle constants
   
   private int dx1   = 10;    // next inner circle constands
   private int dy1   = 10;
   private int size1 = 60;
   
   private int dx2   = 20;    // innermost circle constants
   private int dy2   = 20;
   private int size2 = 40;
   
   int fallinc = 50;
   

   
   private TextBox textbox;
   
  
   
   
   //----------------- constructor ------------------------------
   public Target( int x, int y )
   {
      level0 = new Ellipse( x, y );
      level0.setSize( size0, size0 );
      level0.setColor( Color.BLACK );
      add( level0 );
      
      level1 = new Ellipse( x + dx1, y + dy1 );
      level1.setSize( size1, size1 );
      level1.setColor( Color.RED );
      add( level1);
      
      level2 = new Ellipse( x + dx2, y + dy2 );
      level2.setSize( size2, size2 );
      level2.setColor( Color.GREEN );
      add( level2);
      
      this.setLocation( x, y );
      
      textbox = new TextBox (  x - 50, y - 50 );
      textbox.setText( "Loc: " + x + ", " + y);
      
      
      
      
      
      
      
      
      
   }
   //------------------- setLocation( int, int ) ------------------------
   /**
    * set the target's location by setting each of the component circles.
    *
   public void setLocation( int x, int y )
   {
      level0.setLocation( x, y );
      level1.setLocation( x + dx1, y + dy1 );
      //level2.setLocation( x + dx2, y + dy2 );
   }
   /********************************************************************/
   //----------------- main --------------------------------------------
   /**
    * Unit test code for Target
    */
   
   public void setFallIncrement( int y ) 
   {
     fallinc = y;
    
     
  
   }
   
   public void mouseClicked( java.awt.event.MouseEvent e)
   {
     
     int dx = getXLocation();
     int dy = getYLocation();
     setLocation( dx, dy + fallinc);
     
     textbox.setText( "Loc: " + dx + ", " + dy);
     
     
     
      
   }
   
 
     
   
   public static void main( String[] args )
   {
      new Frame();
      Target t1 = new Target( 50, 50 );
      Target t2 = new Target( 300, 50 );
      
      //t1.setLocation( 150, 50 );
      //t2.setLocation( 300, 300 );
      t1.setFallIncrement( 50 );
      t2.setFallIncrement( 100 );
      
      
      
      
      
     
   }
}
