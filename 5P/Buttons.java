/** 
 * Button.java:
 * 
 * @author Benjamin Miller 5P
 * mb 10/6/15
 * 
 */
import wheelsunh.users.*;
import java.awt.Color;
import javax.swing.*;

 /** 
 * makes a button.
 * @author Benjamin Miller
 */ 
public class Buttons extends Ellipse
{
    private CryptogramApp quotes;
    private int thisbutton;
    private boolean can;
    private int beenPressed = 0;
  
  
    //---------------- instance variables ------------------------------
  
  /**
   * Button is a button made for the bug.
   * @param x is the x coordinate.
   * @param y is the y coordinate.
   * @param b1 is the bug that is the peer of the button.
   */
    public Buttons( int x, int y, CryptogramApp cga, int button )
    {
        super( x, y );
        this.setSize( 20, 20 );
        this.setFillColor( Color.BLUE );
        this.setFrameColor( Color.BLACK );
 
        cga = quotes;
        thisbutton = button;
        
        
        TextBox tb = new TextBox( 200, 200 );
        
        
        
        

 
  

  
  
    }
    
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        
    
        
        
        if( thisbutton == 1 )
        {
            setColor( Color.DARK_GRAY );
            String subs;
            subs = JOptionPane.showInputDialog( null, "Substitute" );
            String a = subs.substring( 0 , 1 ).toUpperCase();
            String b = subs.substring( 1 , 2 ).toUpperCase();
            
        
            quotes.sub( a , b );
            
        }
        else if ( thisbutton == 2 )
        {
            setColor( Color.DARK_GRAY );
            quotes.getNewQuote();
            
            
        }
        else if ( thisbutton == 3 )
        {
            if( beenPressed == 0 )
            {
                quotes.translate();
                beenPressed = 1;
            } else if( beenPressed == 1 )
            {
                beenPressed = 0;
                quotes.translateBack();
            }
            setColor( Color.DARK_GRAY );
            
        }
        
        
    }
    
  /**
   * args is the args.
   */
    public static void main( String[] args ) 
    {
        new Frame();
        
        CryptogramApp cg = new CryptogramApp();
       
      
      
      
      
      
      
      
      
      
    }
}