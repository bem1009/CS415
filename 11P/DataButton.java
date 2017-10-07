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
public class DataButton extends Button
{
    private MailMergeApp mainpeer;
    public static final String DATATEXT = "Load Data";
  
  /**
   * DataButton makes a button that loads the data.
   * @param x is the x coordinate.
   * @param y is the y coordinate.
   * @param mma is the peer.
   */
    public DataButton( int x, int y, MailMergeApp mma )
    {
        super( x, y, DATATEXT );
        this.setText( " DataButton " );
        mainpeer = mma;
    }
  /**
   * mouseReleased gets the data.
   * @param e is the e.
   */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        super.mouseReleased( e );
        mainpeer.getData();
    }
}