
import wheelsunh.users.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Point;

/**
 * PowerRectangle.java. 
 *   This class extends Rectangle to add 
 *    - a peer object (a TextBox)
 *    - code to display the area, circumference, and diagonal length of
 *      the rectangle in the TextBox. 
 *      Use the ShapeFunctions class methods to compute these values.
 *    - Use drag to change size of the rectangle.
 *    - Use mouse clicked to print size info to Interactions pane
 *   
 * @author rdb
 */
public class PowerRectangle extends Rectangle
{
   //--------------- instance variables --------------------
 public String s1, s2, s3;
 private double h, w;
 private Point lastMousePosition;
 private Color color;
   /**-------------------------------------------------------------------------
    * Constructor. requires the x,y location of the rectangle
    *     must pass this on to super constructor
    * It must create a TextBox with a text string.
    *     The string should show the Area, Circumference and Diagonal length
    *     This should be done in the "updateInfo" private method that
    *     should be called from here.
    */
    private TextBox textbox; 
        
   public PowerRectangle( int x, int y )
   {
        
        textbox = new TextBox( x, y - 50 );
        textbox.setText( " PowerRectangle" );
        
   }

   //-------------------------------------------------------------------------
   /**
    * setSize( int, int ) -- defines the width and height of the rectangle. 
    *     We need to override the parent setSize, because we must also use
    *     the new information to update the text field of the associated 
    *     TextBox object, by calling "updateInfo()".
    * 
    *     But, you still must invoke the super class setSize to get the 
    *     size changed!
    **********************************************************************
    ********************** Warning: **************************************
    **********************************************************************
    * setSize is called by the Rectangle constructor BEFORE the
    * PowerRectangle constructor is called!  This means that the first 
    * call to setSize happens BEFORE you have created your TextBox and 
    * initialized the instance variable that references it. 
    * 
    * setSize, however, needs to call "updateInfo()" to change the text
    * in the TextBox, but there is no TextBox yet (only the first time).
    * 
    * Hence, in the setSize code below you must only call "updateInfo" 
    * if your instance variable that references the TextBox is NOT null.
    * 
    * See the class notes from slide set 8.
    **********************************************************************
    */
   public void setSize( int width, int height )
   {
        super.setSize( width, height);
        
        if (textbox != null)
        {
            this.updateInfo();
        }
        
        
        
        
   }

   //------------ utility methods --------------------------
   /**
    * updateInfo -- computes the current area and circumference of the 
    * rectangle (using methods in the ShapeFunctions class) and updates
    * the text string in the TextBox.
    * 
    * Note that the ShapeFunctions methods compute the area and circumference
    * as doubles; this class only needs to show the integer version of that,
    * so you need to coerce (or cast) the value returned from ShapeFunctions to
    * an int before assigning it to the local int variables.
    * 
    * Note: The String object you need to pass to the TextBox
    *       must be constructed from strings of text and numbers. We have
    *       yet covered this in class. If you have variables "area" and
    *       "circumference" with the appropriate values, you can create a
    *       String to give to TextBox with the following line:
    * 
    *    String message = "A: " + area + ", C: " + circumference;
    */
   private void updateInfo()
   {
        String s1 = " A:" + ShapeFunctions.area(this);
        String s2 = " C:" + ShapeFunctions.circumference(this);
        String s3 = " D:" + ShapeFunctions.diagonal(this);
        textbox.setText( s1 + s2 + s3 );
        
   }
   
   //-------------------------------------------------------------------------
   /**
    * changeSizeBy( int, int ) -- update size of Rectangle by an encremental
    *                       amount in x and y. 
    */
   private void changeSizeBy( int dX, int dY )
   {
          int x = this.getWidth();
          int y = this.getHeight();
          this.setSize( x + dX , y + dY);
          
   }
      
   //-------------------------------------------------------------------------
   /**
    * mousePressed - save the position of the mouse and the current color of the 
    * rectangle, and change the color of the rectangle to red.
    */
   public void mousePressed( MouseEvent me )
   {
        color = this.getColor();
        lastMousePosition = me.getPoint();
        
        
   }

   //-------------------------------------------------------------------------
   /**
    * mouseDragged -- change the rectangle size by the same delta that the 
    *                 mouse moved.
    * Use mouse position saved in mousePressed; update the saved mouse position
    * for next drag event.
    */
   public void mouseDragged( MouseEvent me )
   {
         Point currentPoint = me.getPoint();
         int diffX = currentPoint.x - lastMousePosition.x;
         int diffY = currentPoint.y - lastMousePosition.y;
         this.setSize( this.getWidth() + diffX, this.getHeight() + diffY );
         lastMousePosition = currentPoint;
         
         
         this.setColor(Color.RED);
   }

   //-------------------------------------------------------------------------
   /**
    * mouseReleased -- restore the original color.
    */
   public void mouseReleased( MouseEvent me )
   {
        this.setColor( color );
   }

   //-------------------------------------------------------------------------
   /**
    * mouseClicked - print the width/height to System.out
    */
   public void mouseClicked( MouseEvent me )
   {  
        
       System.out.println( " Height is " + this.getHeight() + " Width is " + this.getWidth()); 
        
   }

   //------------------ main ----------------------------------
   // unit test code
   //
   public static void main( String args[] )
   {
      Frame f = new Frame();
      PowerRectangle pr1 = new PowerRectangle( 400, 400 );
      pr1.setColor( Color.BLUE );
      pr1.setLocation( 400, 400 );
      
      
      PowerRectangle pr2 = new PowerRectangle( 100, 100);
      pr2.setLocation( 100, 100 );
      pr2.setColor( Color.GREEN);
      pr2.setSize( 50, 30 );
      
      
      PowerRectangle pr3 = new PowerRectangle( 300, 300);
      pr3.setColor( Color.YELLOW );
      pr3.setSize( 100, 10 );
      pr3.setLocation( 300, 300);
       
      pr1.setSize( 20, 25 );
   }
}
