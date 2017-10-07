/** 
 * Button.java:
 * 
 * @author Benjamin Miller 5P
 * mb 10/6/15
 * 
 */
import wheelsunh.users.*;
import java.awt.Color;

 /** 
 * makes a button.
 * @author Benjamin Miller
 */ 
public class Button extends TextBox
{
    private Bug bug;
    private Bughat bughat;
    private Buglaser buglaser;
 
  
  
    //---------------- instance variables ------------------------------
  
  /**
   * Button is a button made for the bug.
   * @param x is the x coordinate.
   * @param y is the y coordinate.
   * @param b1 is the bug that is the peer of the button.
   */
    public Button( int x, int y, Bug b1 )
    {
        super( x, y );
        this.setText( "Normal Bug " );
        this.setWidth( 100 );
        this.setFillColor( Color.YELLOW );
 
        bug = b1;

 
  

  
  
    }
  /**
   * Button is the button made for the bug.
   * @param x is the x coordinate.
   * @param y is the y coordinate.
   * @param b2 is the bughat which is the peer to the button.
   */
    public Button( int x, int y, Bughat b2 )
    {
        super( x , y );
        this.setText( " TopHat Bug " );
        this.setWidth( 100 );
        this.setFillColor( Color.YELLOW );
   
        bug = b2;
    }
  /**
   * Button is the button made for the bug.
   * @param x is the x coordinate.
   * @param y is the y coordinate.
   * @param b3 is the laserbug which is the peer to the button.
   */
    public Button( int x, int y, Buglaser b3 )
    {
        super( x , y );
        this.setText( " Laser Bug " );
        this.setWidth( 100 );
        this.setFillColor( Color.YELLOW );
    
        bug = b3;
    
    
    }
  /**
   * mousePressed is the method that activates the bug when mouse is pressed.
   * @param e is the mouse when pressed.
   */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
    
        bug.activate();
   
    
    
    }
/**
 * mouseReleased is the method that deactivates te bug when mouse is pressed.
 * @param e is the mouse when released.
 */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
    
        bug.deactivate();
   
    }

  

        
    
    
  
  
  
  
  
  /**
   * main tests the bug and the button correlating to it.
   * @param args is the args.
   */
    public static void main( String[] args ) 
    {
        new Frame();
        Bug b1 = new Bug( 100, 100 );
        new Button ( 90, 300, b1 );
      
      
      
      
      
      
      
      
      
    }
}