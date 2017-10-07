import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;


/** 
 * Program6.java. Puts some WeatherSensitive objects 
 * through a yearly cycle.
 * Fall 2015
 * 
 *  @author cs415 
 */
public class Program6  extends ShapeGroup
{  
    //---------------- instance variables -------------------------------------
    private Rectangle _background;   // the sky
    private Color _warmBackgroundColor;
    private Color _coldBackgroundColor;
    private int season;
    
    
    // Three WeatherSensitive objects 
    private WeatherSensitive _seasonal1;  
    private WeatherSensitive _seasonal2;
    private WeatherSensitive _seasonal3;
    private TextBox _text;
    
    //------------------- Program6( )------------------------------------------
    /**
     *  Create a background and three draggable WeatherSensitives and
     *  run them through a daily cycle.
     */
    public Program6(  )
    {
        // create the background
        _warmBackgroundColor = new Color( 200, 200, 255 ); // summery blue
        _coldBackgroundColor = new Color( 200, 200, 200 ); // wintery gray
        _background = new Rectangle( 0, 0 );
        _background.setSize( 700, 500 );
        
        _text = new TextBox( 300, 10 );
        _text.setWidth ( 120 );
        _text.setColor( new Color( 0, 0, 0, 0 ) );
        
        add( _background );
        add( _text );

        
        ////////////////////////////////////////////
        // Change the three lines below:
        // replace the nulls with your objects:
        // Construct your three WeatherSensitive objects
        // and assign them to these instance variables.
        // For example:
        // _seasonable1 = new Bug( 100, 100 );
        ////////////////////////////////////////////
        
        _seasonal1 = new Bug( 100, 100 );  
        _seasonal2 = new Tree( 200, 200 );
        _seasonal3 = new Flower( 300, 100 );;
        
        ////////////////////////////////////////////
        // Do not change any other code in 
        // Program6
        ////////////////////////////////////////////
        changeSeason();
    }
    
    //--------------------------------------------------------------------
    /**
     *   Change the season.
     * 
     *  
     */ 
    public void changeSeason (  )
    {
        season++;
        
        if( season % 2 == 0 )  // winter
        {
            _background.setColor( _coldBackgroundColor );
            _text.setText( "Cold Weather" );
            
            if( _seasonal1 != null )
                _seasonal1.coldWeather( );  
            if( _seasonal2 != null )
                _seasonal2.coldWeather( ); 
            if( _seasonal3 != null )
                _seasonal3.coldWeather( );
        }          
        else // summer
        {
            _text.setText( "Warm Weather" );
            _background.setColor( _warmBackgroundColor );
            
            if( _seasonal1 != null )  
                _seasonal1.warmWeather( );
            if( _seasonal2 != null )
                _seasonal2.warmWeather( );   
            if( _seasonal3 != null )
                _seasonal3.warmWeather( );
        }               
    }
    
    
    //-------------------------------------------------------------------------
    /**
     * Toggle the season on a mouse click event.
     * 
     * @param me MouseEvent
     */
    public void mouseClicked( MouseEvent me )
    {
        changeSeason( );
    }
    
    
    
    //-------------------------- main ( String [ ] ) --------------------------
    /** 
     * Start the program.
     * 
     * @param args String[]
     */
    public static void main( String[ ] args )
    {      
        new Frame( );
        new Program6( ); 
    }  
} //End of Class Program6



