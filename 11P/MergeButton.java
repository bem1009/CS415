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
public class MergeButton extends Button
{
    
    private MailMergeApp mainpeer;
    private static final String MERGETEXT = "             Merge";
    
    /**
     * Constructor.
     * @param x is the x coordinate.
     * @param y is the y coordinate.
     * @param mma is the main program.
     */
    public MergeButton( int x, int y, MailMergeApp mma )
    {
        
        super( x, y, MERGETEXT );
        this.setText( " Merge Button " );
        mainpeer = mma;
    }
    /**
     * mouseReleased merges the two texts.
     * @param e is the mouse.
     */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        super.mouseReleased( e );
        mainpeer.merge();
    }
}