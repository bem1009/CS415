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
import java.io.*;

 /** 
 * makes a button.
 * @author Benjamin Miller
 */ 
public class Button extends TextBox
{
    
    private int thisbutton;
    
    private int newtextloc = 1;
    private ArrayList<TextBox> textboxes;
    private String template = "";
    private Scanner scan;
    private MailMergeApp mailzmergez;
    private ArrayList<MailRecord> mailrecordz;
  
  
    //---------------- instance variables ------------------------------
  
  /**
   * Button is a button made for the bug.
   * @param x is the x coordinate.
   * @param y is the y coordinate.
   * 
   * @param buttonis indicates which type of button it is.
   * 
   */
    public Button( int x, int y, String buttonis )
    {
        super( x, y );
        this.setSize( 220, 30 );
        this.setFrameColor( Color.BLACK );
        this.setFillColor( Color.WHITE );
 
     
      
      
      
    }

    /**
     * mousePressed changes the color.
     * @param e is the e.
     */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        this.setFillColor( Color.BLUE );
    }
    /**mouseReleased changes the color back.
      * @param e is the e.
      */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        this.setFillColor( Color.WHITE );
    }
    /** main tests the button.
      * @param args is the args.
      */
    public static void main( String[] args ) 
    {
        new Frame();
        new Button( 100, 100, "thisisatest" );
 
      
      
      
      
      
      
      
      
      
    }
}

    
    