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
public class TextBoxButton extends Button
{
    
    private MailMergeApp mainpeer;
    public static final String TEMPTEXT = "             Load Template";
    
    /** 
     * Constructor.
     * @param x is the x coordinate.
     * @param y is the y coordinate.
     * @param mma is the main program.
     */
    public TextBoxButton( int x, int y, MailMergeApp mma )
    {
        super( x, y, TEMPTEXT );
        this.setText( " Template Button " );
        mainpeer = mma;
    }
    /**
     * mouseReleased gets the template of the text.
     * @param e is the e.
     */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        super.mouseReleased( e );
        mainpeer.getTemplate();
    }
}
