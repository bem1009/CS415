
import wheelsunh.users.*;
import java.awt.Color;
import java.util.*;

/**
 * BouncingBall.java.
 * @author CS415
 * 
 */
public class BouncingBall extends Ellipse
{
    private int deltaX, deltaY;
    private int size;
    private boolean _test = true; 
    
    //-------------------------------  BouncingBall -------------------
    /**
     * Create a bouncingBall with random size, deltaX and deltaY.
     *  The size is between 5 and 35, 
     *  the deltaX and deltaY are between -15 and +15.
     * 
     */ 
    public BouncingBall (  )
    {    
        Random rand = new Random( );
     size = rand.nextInt( 30 ) + 5;  //  5 <= size <= 35
     setSize( size, size );
 
     deltaX = rand.nextInt( 30 ) - 15;  //  -15 <= delta <= +15
     deltaY = rand.nextInt( 30 ) - 15;




        
    }
    
    //-------------------------------  move ----------------------------
    /**
     * This will move the ball by deltaX and deltaY
     * and bounce the ball off the edges of the Frame.
     * 
     */ 
    public void move( ) 
    {
        int thisx = getXLocation();
        int thisy = getYLocation();
        setLocation( thisx + deltaX, thisy + deltaY );
        
        if ( thisy <= 0 )
        {
            setLocation( getXLocation() , 0 );
            deltaY*=-1;
            setLocation( thisx + deltaX, thisy + deltaY );
        }
        else if ( thisy >= 485 )
        {
            setLocation( getXLocation() , 485 );
            deltaY*=-1;
            setLocation( thisx + deltaX, thisy + deltaY );
        }
        else if (thisx <= 0 )
        {
            setLocation( 0, getYLocation() );
            deltaX*=-1;
            setLocation( thisx + deltaX, thisy + deltaY );
        }
        else if ( thisx >= 685 )
        {
            setLocation( 685, getYLocation() );
            deltaX*=-1;
            setLocation( thisx + deltaX, thisy + deltaY );
        }
     
        
        
        
        
        
        
    }
    
    
    //-------------------------------  main ----------------------------
    /**
     * Get the ball rolling.
     * @param arg String[]
     * 
     * 
     */ 
    public static void main( String arg[] )
    {
        new Frame( );
        BouncingBall bb1 = new BouncingBall();
        int x = 0;
         for ( int i = 0; i >= 0; i++ )
        {
            bb1.move();
            Utilities.sleep( 20 );
            
        }

        
        
        
    }
}
