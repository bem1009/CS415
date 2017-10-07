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
public class Slider extends ShapeGroup 
{
  //---------------- instance variables ------------------------------
    private Rectangle slider1;
    private Rectangle slider2;
    private TextBox textbox;
    private Point lastMousePosition;
    private Rectangle button1;
    private int bet1, totalbet;
    private Dice dice1;
    

  /**
   * Slider is constructer.
   */
    public Slider( )
    {
        slider1 = new Rectangle( 160, 270 );
        slider1.setSize( 100, 30 );
        slider1.setColor( Color.GRAY );
         
        slider2 = new Rectangle( 160, 270 );
        slider2.setSize( 100, 30 );
        slider2.setColor( Color.RED );
        add( slider2 );
         
         
         
         
        textbox = new TextBox( 150, 320 );
        textbox.setText( " $100/100 " );
         
         
        
         
        button1 = new Rectangle( 90, 270 );
        button1.setSize( 40, 30 );
         
         
         
         
    }
    
     /**
     * mousePressed changes the color of the bug when the mouse is pressed.
     * @param e is the e.
     */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        lastMousePosition = e.getPoint();
        

        
        
    }
    /**
     * mouseDragged changes the location as the bug is being dragged.
     * @param e is the e.
     */
    public void mouseDragged( java.awt.event.MouseEvent e )
    {
        Point currentPoint = e.getPoint();
        int diffX = currentPoint.x - lastMousePosition.x;
        int sliderposition = slider2.getWidth() + diffX;
        if ( sliderposition >= 100 )
        {
            sliderposition = 100;
        }
        if ( sliderposition <= 0 )
        {
            sliderposition = 0;
        }
        int height = slider2.getHeight();
        slider2.setSize( sliderposition , height );
        lastMousePosition = currentPoint;
        
         //TextBox textbox = new TextBox( 150, 320 );
        textbox.setText( "$ " + slider2.getWidth() + "/ $" + slider1.getWidth()
        );
        
        
        slider1.setColor( Color.BLUE );
                 //textbox.setText( " $100/100 " );
        bet1 = slider2.getWidth();
        totalbet = slider1.getWidth();  
        
        
        
        
        
    }
    
   
    /** 
     * getSlidebefore gets the width of the slider before the bet takes place.
     * @return width is the width.
     */
    public int getSlideBefore()
    {
        int width = slider2.getWidth();
        return width;
    }
    /**
     * getGraySlider gets the non movable part of the slider.
     * @return width is the width.
     */
    public int getGraySlider()
    {
        int width = slider1.getWidth();
        return width;
    }
    /**
     * setSlider sets the width of the slider.
     * @param w is the width.
     */
    public void setSlider( int w )
    {
        slider1.setSize( w , 30 );
        slider2.setSize( w , 30 );
    }
   /**
    * getTextBox gets the text box.
    * @return tb is a textbox.
    */
    public TextBox getTextBox()
    {
        TextBox tb = textbox;
        return tb;
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
        new Slider();
        
        
      
      
      
      
      
    }   
}