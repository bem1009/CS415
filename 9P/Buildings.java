

/** 

 * slider.java:
 * Displays a pad for building a Piano.
 * @author Benjamin Miller 3P
 * mb 9/15
 * 
 */
import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.util.*;

/**
 * Bug is a shapegroup that implements weathersensitive and draggable.
 * @author Benjamin Miller.
 */
public class Buildings extends ShapeGroup
{
  
// instance variables // 
  
    private Rectangle b1, b2, b3, b4, b5, b6;
    private Rectangle w1, w2, w3, w4, w5, w6;
    private int xbloc = 0;
    private Random gen;
    
    
    
  /**
   * Buildings is.
   */
    public Buildings(  )
    {
       
        gen = new Random();
        int height = gen.nextInt( 60 ) + 40;
        int width = gen.nextInt( 25 ) + 25;
        
        
        b1 = new Rectangle( 0, 500 - height );
        b1.setSize( width, height );
        b1.setFrameColor( Color.RED );
        b1.setFillColor( Color.BLACK );
        add( b1 );
        
        b2 = new Rectangle( 15, 460 );
        b2.setSize( 8, 8 );
        b2.setFrameColor( Color.BLACK );
        b2.setFillColor( Color.YELLOW );
        add( b2 );
        
        b3 = new Rectangle( 10, 470 );
        b3.setSize( 6, 10 );
        b3.setFrameColor( Color.BLACK );
        b3.setFillColor( Color.YELLOW );
        add( b3 );
        
      
        
        
        
        
        
        
        
        
    }
    /**
     * hide make the buildings hide.
     */
    public void hide()
    {
        b1.hide();
        b2.hide();
        b3.hide();
      
    }
/**
 * setColor changes the color.
 * @param c is the color.
 */
    public void setColor( Color c )
    {
        b1.setColor( c );
    }
      
    
    
/**
 * main tests the program.
 * @param args is the args.
 */
    public static void main( String[] args ) 
    {
        Frame f1 = new Frame();
        


        new Buildings( );
       
        
        
      
      
      
      
      
    }   
}