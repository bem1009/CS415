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
public class CrapsApp extends ShapeGroup
{
  //---------------- instance variables ------------------------------
    private Rectangle button1;
    private Dice d1;
    private Slider s1;
    private TextBox roll, bet, youlose;
    private int randsum, beforewidth, grayslider, newwidth;
      
      
    /**
     * CrapsApp makes the button.
     */
    public CrapsApp(  )
    {
        button1 = new Rectangle( 90, 270 );
        button1.setSize( 40, 30 );
        add( button1 );
    
        
        roll = new TextBox( 90 , 230 );
        roll.setText( " Roll: " );
        roll.setWidth( 50 );
        
        bet = new TextBox( 170, 230 );
        bet.setText( "Bet: " );
        bet.setWidth( 40 );
        
        s1 = new Slider();
        d1 = new Dice();
        
                                     
        
    }
      
      
     /**
      * mousePresed rolls the dice and places your bet.
      * @param e is the e.
      */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
       
        d1.roll();
        randsum = d1.getRandomsum();
        beforewidth = s1.getSlideBefore();
        grayslider = s1.getGraySlider();
        
        if ( randsum >= 5 && randsum <= 9 )
        {
            d1.setColor( Color.RED );
            d1.setColor2( Color.RED );
            newwidth = grayslider - beforewidth;
            s1.setSlider( newwidth );
            System.out.println( "Lose" );
          
        }
      
        else if ( randsum == 2 )
        {
            d1.setColor( Color.GREEN );
            d1.setColor2( Color.GREEN );
            newwidth = grayslider + ( beforewidth * 3 );
            s1.setSlider( newwidth );
            System.out.println( "Win! " );
        
        }
      
        else if ( randsum == 3 || randsum == 4 )
        {
            d1.setColor( Color.GREEN );
            d1.setColor2( Color.GREEN );
            newwidth = grayslider + beforewidth;
            s1.setSlider( newwidth );
            System.out.println ( "Win! " );
        
        }
      
        else if ( randsum == 10 || randsum == 11 )
        {
            d1.setColor( Color.GREEN );
            d1.setColor2( Color.GREEN );
            newwidth = grayslider + ( beforewidth * 2 ); 
            s1.setSlider( newwidth );
            System.out.println( "Win! " );
        }
      
        else if ( randsum == 12 )
        {
            d1.setColor( Color.GREEN );
            d1.setColor2( Color.GREEN );
            newwidth = grayslider + ( beforewidth * 5 );
            s1.setSlider( newwidth );
            System.out.println ( " Win! " );
        }
         
        if ( newwidth <= 0 )
        {
            youlose = new TextBox( 250, 30 );
            youlose.setText( " GAME OVER " );
        }
         
        
      
    }
      
        
   
      
      
     
      
      
      
       /**
       * End of slider.
       * @author Benjamin Miller.
       * @param args is the args. 
       * 
       */
    public static void main( String[] args ) 
    {
        new Frame();


        new CrapsApp();
       
        
        
      
      
      
      
      
    }   
}