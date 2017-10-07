/** Ben Miller 4P 
 * Program4.java:
 * Tests out the bug class
 * @author Benjamin Miller
 * 
 * 
 */
import wheelsunh.users.*;
import java.awt.Color;
/**
 * Class Program 4 creates the bug and makes it move upward,
 * while displaying a text box of its y Location.
 * @author Benjamin Miller
 */
public class Program4 
{
     
    //---------------- instance variables ------------------------------
    
    private TextBox locationDisplay;
     
   
    
    
    // -----------------------------------------------------------------
    /** Constructor. 
      */
 
       
    public Program4( )
    {
       
        new Frame( );
        Bug b1 = new Bug( Color.BLUE );
        b1.setLocation( 300, 300 );
        
        locationDisplay = new TextBox ( 450, 400 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
       
        Utilities.sleep( 500 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 ) ;
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp ( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 ) ;
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp ( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 ) ;
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp ( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 ) ;
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        Utilities.sleep( 50 );
        b1.moveUp( 8 );
        locationDisplay.setText( "YLocation is " + b1.getYLocation() );
        
        
      

       
      
       

        
        
        
    } 
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      * @param args is the args.
      */
    public static void main( String[] args )
    {
        new Program4();
        
    }
} //End of Class Program4