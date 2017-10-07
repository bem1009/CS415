
import wheelsunh.users.*;
import java.util.*;
import java.awt.Point;
import java.awt.Color;


/**
 * IntersectApp.java.
 * @author MB
 * 
 */
public class Intersect implements Animator
{
    
    private Rectangle rectangle;
    private BouncingBall ball, b, bouncy;
    private AnimationTimer timer;
    private ArrayList<BouncingBall> balls;
    
    
    //-------------------------------  Intersect -----------------------
    /**
     *  Draw a rectangle and a ball then animate.
     * 
     * 
     */ 
    public Intersect (   )
    {      
        rectangle = new Rectangle( 200, 200 );
        rectangle.setSize( 200, 200 );
        rectangle.setColor( Color.blue );
        
        balls = new ArrayList<BouncingBall>();
        
        for ( int i = 0; i < 20; i++ )
        {
        BouncingBall b1 = new BouncingBall();
        balls.add( b1 );
        
        }
        
        //ball =  new BouncingBall( ) ;
        timer = new AnimationTimer( 50, this );
        timer.start();
        animate( );
        
    }
    
    
    
    //-------------------------------  animate -------------------------
    /**
     * This will animate a ball forever
     * when the ball and rectangle intersect then make the ball yellow.
     * 
     */ 
    public void animate( )
    {
        //ball.move();
        for ( int i = 0; i < 20; i++ )
        {
            
            balls.get( i ).move();
         
        
        if ( balls.get( i ).boundsIntersects( rectangle ))
        
            balls.get( i ).setColor( Color.YELLOW );
        
        else 
        
            balls.get( i ).setColor( Color.RED );
        }
    }
        


    
    
    //-------------------------------  main ----------------------------
    /**
     *  Get the ball rolling.
     * @param a String[]
     * 
     */ 
    public static void main( String a[] )
    {
        new Frame( );
        new Intersect( );
    }
}
