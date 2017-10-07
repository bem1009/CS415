
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
public class AsteroidApp implements Animator
{  
  
  //instance variables // 
    private Buildings b1;
    private ArrayList<Buildings> bdgroup;
    private int xloc = 0;
    private AnimationTimer timer;
    private Asteroid a;
    private int deltaX, deltaY, newX;
    private int count = 0;
    private int score = 0;
    private Random gen;
    private Shield s1;
    private TextBox tbscore, tb2, tbdest;
    private Rectangle r1;
    private Color lightblue = new Color( 0, 0, 60 );
    private int destroy = 0;
    private double percent;
  
  /**
   * Asteroid app tests the program.
   */
    public AsteroidApp()
    {
        timer = new AnimationTimer( 50 , this );
        bdgroup = new ArrayList<Buildings>();
        r1 = new Rectangle( -300, - 300 );
        r1.setSize( 1000, 1000 );
        r1.setColor( lightblue );
        a = new Asteroid();
        a.setColor( Color.RED );
        s1 = new Shield();
       
     
        gen = new Random();
        newX = gen.nextInt( 200 ) + 200;
        deltaX = gen.nextInt( 20 ) - 10 ;
        deltaY = gen.nextInt( 25 ) + 10;
        tbdest = new TextBox( 570, 60 );
        tbdest.setText( "Destroyed: 0.0% " );
      
      
        
        for ( int f = 0; f < 24; f++ )
        {
            b1 = new Buildings( );
            b1.setLocation( xloc, b1.getYLocation() );
            xloc = xloc + 30;
            bdgroup.add( b1 );
        }
        
        tbscore = new TextBox( 630, 20 );
        tbscore.setText( "SCORE: " + count );
        tb2 = new TextBox( 80, 100 );
        tb2.setText( "DEFEND YOUR CITY FROM THE ASTEROIDS!" );
        tb2.setWidth( 290 );
        r1.setColor( Color.RED );
        Utilities.sleep( 100 );
        r1.setColor( lightblue );
        Utilities.sleep( 100 );
        r1.setColor( Color.RED );
        Utilities.sleep( 100 );
        r1.setColor( lightblue );
        Utilities.sleep( 500 );
        timer.start();
      
        
       //a.fall();
      
       
       
        animate();
         
         
       
       
       
        
    }
        
      
    /**
     * animate makes the objects move.
     */
    public void animate()
    {
       
        count++;
        if ( count < 25 )
        {
         
            tb2.setLocation( tb2.getXLocation(), tb2.getYLocation() - 4 );
        }
        else
        {
            a.fall( deltaX, deltaY );
      
      
      
           
        
            for ( int i = 0; i < bdgroup.size(); i++ )
            {
                if ( bdgroup.get( i ).boundsIntersects( a ) )
                {
                    int size = gen.nextInt( 30 ) + 10;
            
         
                    bdgroup.get( i ).hide();
         
                    bdgroup.remove( i );
                    gen = new Random();
                    newX = gen.nextInt( 200 ) + 200;
            
                    destroy = destroy + 1;
            
                    percent = ( destroy / 22.0 ) * 100;
                    percent = ( int ) ( percent );
                    tbdest.setText( "Destroyed: " + percent + "%" );
                    a.setLocation( newX, 0 );  
                    a.setSize( size, size );
                    deltaX = gen.nextInt( 20 ) - 10 ;
                    deltaY = gen.nextInt( 25 ) + 10;
                    a.fall( deltaX ,  deltaY );
                }
        
                else if ( s1.boundsIntersects( a ) )
                {
                    gen = new Random();
                    newX = gen.nextInt( 200 ) + 200;
                    a.setLocation( newX, 0 );
                    int size = gen.nextInt( 30 ) + 10;
                    a.setSize( size, size );
                    deltaX = gen.nextInt( 20 ) - 10 ;
                    deltaY = gen.nextInt( 25 ) + 10;
                    a.fall( deltaX ,  deltaY );
                    score = score + 1;
                    tbscore.setText( "SCORE: " + score );
                }
            }
           
            int ybottom = a.getYLocation();
       
            if ( ybottom > 500 )
            {
                int newxx = gen.nextInt( 200 ) + 200;
                a.setLocation( newxx, 0 );
                int size = gen.nextInt( 30 ) + 10;
                a.setSize( size, size );
                deltaX = gen.nextInt( 20 ) - 10 ;
                deltaY = gen.nextInt( 25 ) + 10;
                a.fall( deltaX ,  deltaY );
            }
       
            if ( bdgroup.size() < 14 )
            {
                TextBox tb = new TextBox ( 270, 200 );
                tb.setText( "GAME OVER" );
                a.setLocation( 1000, 1000 );
                a.hide();
            }
        }
    }
    
           
    
     
      
    
    
    
/**
 * main tests the program.
 * @param a is idk.
 */
    public static void main( String a[] )
    {
        new Frame( );
        
        new AsteroidApp();
        
       
    }
}