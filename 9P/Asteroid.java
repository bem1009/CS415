

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
public class Asteroid extends Ellipse
{
  //---------------- instance variables ------------------------------
    private Ellipse a;
    private Random gen;
    private int xstart, speed, size;
    private Buildings b1;
    private ArrayList<Buildings> bdgroup;
    private int xbloc = 0;
    
    
      
      
    /**
     * CrapsApp makes the button.
     */
    public Asteroid()
    {
      
        super( 335 , 0 );
        gen = new Random();
        xstart = gen.nextInt( 200 ) + 200;
      
      
      
        size = gen.nextInt( 30 ) + 10;
      
      
        setSize( size, size );
        setColor( Color.BLACK );
      
     
        int deltaX = gen.nextInt( 8 ) - 4 ;
        int deltaY = gen.nextInt( 5 ) + 10;
     
      
    }
    
    
    /**
     * boomboom is a thing i don't use.
     */
    public void boomboom()
    {
        for ( int i = 0; i < 0; i++ )
        {
        
            b1 = new Buildings( );
            b1.setLocation( xbloc, b1.getYLocation() );
            xbloc = xbloc + 50;
            bdgroup.add( b1 );
        
       
     
    
        }
    }
    /**
     * fall makes the asteroid fall.
     * @param deltaX is the x fall.
     * @param deltaY is the y fall.
     */
    public void fall( int deltaX, int deltaY )
    {
         //deltaX = gen.nextInt( 8 ) - 4 ;
         //deltaY = gen.nextInt( 5 ) + 10;
         //speed = gen.nextInt( 100 ) + 30;
         
        
        
         
        int xloc = getXLocation();
        int yloc = getYLocation();
        setLocation( xloc + deltaX, yloc + deltaY );
        
         
         
         
         
        
         
         
         
         
         
         
      
    }
}