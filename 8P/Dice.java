/** 
 * Piano.java:
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
public class Dice extends ShapeGroup 
{
  //---------------- instance variables ------------------------------
    private Rectangle dice1, dice2;
    private Ellipse dot1, dot2, dot3, dot4, dot5, dot6, dot7;
    private Ellipse tdot1, tdot2, tdot3, tdot4, tdot5, tdot6, tdot7;
    private Random gen;
    private int randy, randy2;
    private int sum1;
    private Slider slider;
  
  
  
  
  
  /** Constructor. 
    * 
    */
    public Dice(  )
    {
        dice1 = new Rectangle( 100, 100 );
        dice1.setSize( 100, 100 );
        dice1.setFrameColor( Color.BLACK );
        dice1.setFillColor( Color.WHITE );
    
        dice2 = new Rectangle( 250, 100 );
        dice2.setSize( 100, 100 );
        dice2.setFrameColor( Color.BLACK );
        dice2.setFillColor( Color.WHITE );
    
        dot1 = new Ellipse( 140, 138 );
        dot1.setSize( 20, 20 );
        dot1.setColor( Color.BLACK );
    
        dot2 = new Ellipse( 115, 115 );
        dot2.setSize( 20, 20 );
        dot2.setColor( Color.BLACK );
        dot2.hide();
    
        dot3 = new Ellipse( 115, 138 );
        dot3.setSize( 20, 20 );
        dot3.setColor( Color.BLACK );
        dot3.hide();
    
        dot4 = new Ellipse( 165, 115 );
        dot4.setSize( 20, 20 );
        dot4.setColor( Color.BLACK );
        dot4.hide();
    
        dot5 = new Ellipse( 115, 160 );
        dot5.setSize( 20, 20 );
        dot5.setColor( Color.BLACK );
        dot5.hide();
    
        dot6 = new Ellipse( 165, 138 );
        dot6.setSize( 20, 20 );
        dot6.setColor( Color.BLACK );
        dot6.hide();
    
        dot7 = new Ellipse( 165, 160 );
        dot7.setSize( 20, 20 );
        dot7.setColor( Color.BLACK );
        dot7.hide();
    
        tdot1 = new Ellipse( 290, 140 );
        tdot1.setSize( 20, 20 );
        tdot1.setColor( Color.BLACK );
    
        tdot2 = new Ellipse( 265, 115 );
        tdot2.setSize( 20, 20 );
        tdot2.setColor( Color.BLACK );
        tdot2.hide();
    
    
        tdot3 = new Ellipse( 315, 165 );
        tdot3.setSize( 20, 20 );
        tdot3.setColor( Color.BLACK ); 
        tdot3.hide();
    
    
        tdot4 = new Ellipse( 265, 140 );
        tdot4.setSize( 20, 20 );
        tdot4.setColor( Color.BLACK );
        tdot4.hide();
    
    
        tdot5 = new Ellipse( 315, 140 );
        tdot5.setSize( 20, 20 );
        tdot5.setColor( Color.BLACK ); 
        tdot5.hide();
    
    
        tdot6 = new Ellipse( 265, 165 );
        tdot6.setSize( 20, 20 );
        tdot6.setColor( Color.BLACK );
        tdot6.hide();
    
        tdot7 = new Ellipse( 315, 115 );
        tdot7.setSize( 20, 20 );
        tdot7.setColor( Color.BLACK );
        tdot7.hide();
    
    
    
    
    
    
    
    }
  
  /** roll method.
    * 
    */
    public void roll()
    {
        gen = new Random();
        randy = gen.nextInt( 6 ) + 1;
        randy2 = gen.nextInt( 6 ) + 1;
        System.out.println( " random number is: " + randy );
        System.out.println( " second random number is: " + randy2 );
     
        sum1 = randy + randy2;
    //making dice
        if ( randy == 1 )
        {
            dot1.show();
            dot2.hide();
            dot3.hide();
            dot4.hide();
            dot5.hide();
            dot6.hide();
            dot7.hide();
        }
        if ( randy == 2 )
        {
            dot1.hide();
            dot2.show();
            dot7.show();
            dot3.hide();
            dot4.hide();
            dot5.hide();
            dot6.hide();
        }
        else if ( randy == 3 )
        {
            dot2.show();
            dot7.show();
            dot1.show();
            dot3.hide();
            dot4.hide();
            dot5.hide();
            dot6.hide();
        }
    
        else if ( randy == 4 )
        {
            dot1.hide();
            dot2.show();
            dot5.show();
            dot4.show();
            dot7.show();
            dot3.hide();
            dot6.hide();
        }
    
        else if ( randy == 5 )
        {
            dot1.show();
            dot2.show();
            dot5.show();
            dot7.show();
            dot4.show();
            dot3.hide();
            dot6.hide();
      
        }
    
        else if ( randy == 6 )
        {
            dot1.hide();
            dot2.show();
            dot3.show();
            dot4.show();
            dot5.show();
            dot6.show();
            dot7.show();
      
        }
        if ( randy2 == 1 )
        {
            tdot1.show();
            tdot2.hide();
            tdot3.hide();
            tdot4.hide();
            tdot5.hide();
            tdot6.hide();
            tdot7.hide();
        }
        if ( randy2 == 2 )
        {
            tdot1.hide();
            tdot2.show();
            tdot3.show();
            tdot4.hide();
            tdot5.hide();
            tdot6.hide();
            tdot7.hide();
        }
    
        else if ( randy2 == 3 )
        {
            tdot1.show();
            tdot2.show();
            tdot3.show();
            tdot4.hide();
            tdot5.hide();
            tdot6.hide();
            tdot7.hide();
      
        }
    
        else if ( randy2 == 4 )
        {
            tdot1.hide();
            tdot2.show();
            tdot7.show();
            tdot6.show();
            tdot3.show();
            tdot4.hide();
            tdot5.hide();
        }
    
        else if ( randy2 == 5 )
        {
            tdot1.show();
            tdot2.show();
            tdot7.show();
            tdot6.show();
            tdot3.show();
            tdot4.hide();
            tdot5.hide();
        }
    
        else if ( randy2 == 6 )
        {
            tdot1.hide();
            tdot2.show();
            tdot7.show();
            tdot6.show();
            tdot3.show();
            tdot4.show();
            tdot5.show();
        }
    }
  /**
   * getDiceColor gets the color of the dice.
   * @return dicecol is the color of the dice.
   */
    public Color getDiceColor()
    {
        Color dicecol = dice1.getColor();
        return dicecol;
    
    }
  /**
   * getRandomsum gets the sum of the random numbers.
   * @return randum is the random number.
   */
    public int getRandomsum()
    {
        int randum = randy + randy2;
        return randum;
    }
  /**
   * setColor sets the color of the dice.
   * @param c is the color.
   */
    public void setColor( Color c )
    {
        dice1.setFillColor( c );
    
    }
  /**
   * setColor2 sets the color of the second dice.
   * @param c is the color.
   */
    public void setColor2 ( Color c )
    {
        dice2.setFillColor( c );
    }
  
  
  
  
  
  
  /**
   * End of Piano.
   * @author Benjamin Miller.
   * @param args is the args. 
   * 
   */
    public static void main( String[] args ) 
    {
        new Frame();
    
    
    
    
    
    
    
    
    }   
}

