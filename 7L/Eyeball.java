
// ---------------       imports          ------------------------------
import wheelsunh.users.*;
import java.awt.Color;

// ----------------------   class Eyeball    ---------------------------
/** 
 * This class inplements a simple Eyeball.
 * 
 * @author CS415
 * 
 */
public class Eyeball
{
    //---------------- instance variables ------------------------------
    // variables are used to references the  objects
    // used to draw the eyeball.
    private Ellipse    iris, iris2, iris3;
    private Ellipse    sclera, sclera2, sclera3;
    private Color      irisColor = Color.BLUE;
    
   
    
    // -----------------------------------------------------------------
    /** 
     * Default constructor for the Eyeball class.
     */
    public Eyeball( )
    {
        sclera = new Ellipse( 0, 0);
        sclera.setSize( 50, 50);
        sclera.setFrameColor( Color.BLACK);
        sclera.setFillColor(Color.WHITE);
        
        iris = new Ellipse( 10, 10);
        iris.setSize( 30, 30);
        iris.setColor( Color.BLUE);
        
        sclera2 = new Ellipse( 0, 0);
        sclera2.setSize( 50, 50);
        sclera2.setFrameColor( Color.BLACK);
        sclera2.setFillColor(Color.WHITE);
        
        iris2 = new Ellipse( 10, 10);
        iris2.setSize( 30, 30);
        iris2.setColor( Color.BLUE);
        
        sclera3 = new Ellipse( 0, 0);
        sclera3.setSize( 50, 50);
        sclera3.setFrameColor( Color.BLACK);
        sclera3.setFillColor(Color.WHITE);
        
        iris3 = new Ellipse( 10, 10);
        iris3.setSize( 30, 30);
        iris3.setColor( Color.BLUE);
        
        setLocation( 100, 100);
        
        setColor( Color.GREEN);
        
       
        getMad();
        
       
        
        
        
        
    } 
    

  
    // -----------------------------------------------------------------
    /**
     *   Change the location of the eyeball.
     * 
     * @param x int
     * @param y 
     */
    public void setLocation( int x, int y )
    {
    
      
      sclera2.setLocation( x + 50, y + 50);
      iris2.setLocation( x + 60, y + 60);
      
      sclera3.setLocation( x + 100, y + 100);
      iris3.setLocation( x + 110, y + 110);
      

        
        
        
        
    }
    // -----------------------------------------------------------------
    /**
     *   Change the color of the iris of the eyeball.
     * 
     * @param iColor Color
     */
    public void setColor( Color iColor )
    {

       iris.setColor( iColor );
       iris.getColor();
       
       
       
       
      
        
        
        
    }
    // -----------------------------------------------------------------

    public void getMad( )
    {

      Utilities.sleep( 1000);
      iris2.setColor(Color.RED);
      Utilities.sleep( 1000);
      iris2.setColor( irisColor);
     
      
      
      
      
        
        
        
       }

    

} //End of Class Eyeball
