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
import java.util.*;

 /** 
 * makes a button.
 * @author Benjamin Miller
 */ 
public class Buttons extends Ellipse
{
    private CryptogramApp quotes;
    private int thisbutton;
    private boolean can;
    private TextBox tb10;
    private int beenPressed = 0;
    private Color clear = Color.WHITE;
    private int newtextloc = 1;
    private ArrayList<TextBox> textboxes;
  
  
    //---------------- instance variables ------------------------------
  
  /**
   * Button is a button made for the bug.
   * @param x is the x coordinate.
   * @param y is the y coordinate.
   * @param cga is the peer, the main CryptogramApp.
   * @param whatbutton indicates which type of button it is.
   * 
   */
    public Buttons( int x, int y, CryptogramApp cga, int whatbutton )
    {
        super( x, y );
        this.setSize( 20, 20 );
        this.setFillColor( Color.BLUE );
        this.setFrameColor( Color.BLACK );
 
        quotes = cga;
        thisbutton = whatbutton;
        TextBox tb11 = new TextBox( 590, 0 );
        tb11.setText( " Substitutions: " );
        
        textboxes = new ArrayList<TextBox>();
        
        
        
       
        
        
        
    
 
  

  
  
    }
    /**
     * mousePressed make the button do certain stuff when it is pressed.
     * @param e is the button pressed.
     */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        
    
        
        
        if( thisbutton == 1 )
        {
            newtextloc += 1;
            setColor( Color.RED );
            String subs = new String();;
            subs = JOptionPane.showInputDialog( null, "Substitute" );
            String a = subs.substring( 0 , 1 ).toUpperCase();
            String b = subs.substring( 1 , 2 ).toUpperCase();
            
        
            quotes.sub( a , b );
            
            tb10 = new TextBox( 650, newtextloc * 20 );
            tb10.setFillColor( Color.WHITE );
            tb10.setFrameColor( Color.WHITE );
            
            tb10.setText( a + " -> " + b );
            
            textboxes.add( tb10 );
            
            
            
            
        }
        else if ( thisbutton == 2 )
        {
            setColor( Color.RED );
            quotes.hideQuote();
            quotes.getNewQuote();
            
            Rectangle rect = new Rectangle( 650, 20 );
            rect.setColor( Color.WHITE );
            rect.setSize( 100, 600 );
            
            newtextloc = 1;
            
            
        }
        else if ( thisbutton == 3 )
        {
            if( beenPressed == 0 )
            {
                quotes.translate();
                beenPressed = 1;
                setColor( Color.RED );
                
                
            }
            else if( beenPressed == 1 )
            {
                beenPressed = 0;
                quotes.translateBack();
                setColor( Color.BLUE );
            }
            setColor( Color.RED );
            
        }
        
        
    }
    
  /**
   * main tests the buttons.
   * @param args is the args.
   */
    public static void main( String[] args ) 
    {
        new Frame();
        
        CryptogramApp cg = new CryptogramApp();
       
      
      
      
      
      
      
      
      
      
    }
}