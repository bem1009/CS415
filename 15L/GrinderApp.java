
/**  GrinderApp
  * Create a collection of coins and rotating grinders
  * 
  * 
  * 
  */


import wheelsunh.users.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Point;
import java.awt.Color;

public class GrinderApp implements Animator 
{  
   
   
   private Rectangle r,r1;
   private Ellipse e;
   private AnimationTimer timer;
   private static int animatecount = 0;
   private ArrayList<Rectangle> grinders;
   private int xloc = 0;
   private ArrayList<Ellipse> coins;
   private static int rot = 0;
   private int xloc2 = 40;
   
   //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   /**
    * 
    * 
    */
   public GrinderApp( ) 
   {  
      
      e = new Ellipse( 55 + 40, 265 );
      e.setSize( 15, 15 );
      e.setFillColor( Color.yellow );
      e.setFrameColor( Color.black );
      
      
      r = new Rectangle( 55 , 250 );
      r.setSize( 40, 40 );
      
      timer = new AnimationTimer( 100, this );
      timer.start( );
      
      grinders = new ArrayList<Rectangle>();
      coins = new ArrayList<Ellipse>();
      
      for ( int i = 0; i <= 13; i++ )
      {
          
          Rectangle r1 = new Rectangle();
          r1.setSize( 40, 40 );
          r1.setLocation( xloc, 250 );
          grinders.add( r1 );
          xloc = xloc + 55;
         
         
      }
      
      for ( int i = 0; i<= 12; i++ )
      {
          
          
          Ellipse e1 = new Ellipse( 95, 265);
          e1.setSize( 15, 15 );
          e1.setLocation( xloc2 , 265 );
          e1.setFillColor( Color.YELLOW );
          e1.setFrameColor( Color.BLACK );
          xloc2 = e1.getXLocation() + 55;
          coins.add( e1 );
      }
   }
   
   public void animate()
   {
       if (animatecount > 50)
       {
           timer.stop();
       }
       //if ( animatecount <= 50 )
       {
       r.setRotation( r.getRotation() + 2 );
       animatecount++;
       }
       
       for ( int i = 0; i < 13; i++ )
       {
           
           r1 = grinders.get( i );
           r1.setRotation( r1.getRotation() + 2 );
       }
   }
   
   
   
   
   //--------------------------- main -----------------------------------
   /*
    * 
    */
   public static void main( String args[ ] )
   {
      Frame f = new Frame( );
      GrinderApp  m = new GrinderApp(  ); 
   }
}
