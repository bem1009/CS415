import wheelsunh.users.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Color;


/**
 * Lab2Db - practice some 2D array methods.
 *
 * @author cs415 and ???
 */
public class Tile extends TextBox
{
    private int itsvalue;
    private int valueoftext;
    
    public Tile( int x, int y )
    {
        super( x, y );
        this.setWidth( 40 );
        
        
    } 
    
    public int getValue()
    {
        
        return valueoftext; 
    }
    
    public void setValue( int n )
    {
        String numstring = "" + n;
        this.setText( numstring );
        valueoftext = n;
        
        if( n == 0 )
        {
            this.setText( "" );
            this.setFillColor( Color.WHITE );
        }
            
        
        else if( n == 2 )
        {
            this.setFillColor( Color.WHITE );
        }
        
        else if( n == 4 )
        {
            this.setFillColor( new Color( 255, 255, 155 ) );
        }
        
        else if( n == 8 )
        {
            this.setFillColor( new Color( 255, 255, 102 ));
        }
        
        else if( n == 16 )
        {
            this.setFillColor( new Color( 255, 178, 102 ));
        }
        
        else if( n == 32 )
        {
            this.setFillColor( new Color( 204, 204, 0 ));
        }
        
        else if ( n == 64 )
        {
            this.setFillColor( new Color( 255, 51, 51 ) );
        }
        
        else if( n == 128 )
        {
            this.setFillColor( new Color( 51, 153, 255 ));
        }
        
        else if( n == 256 )
        {
            this.setFillColor( new Color( 51, 255, 51 ) );
        }
        
        else if( n == 512 )
        {
            this.setFillColor( new Color( 255, 51, 255 ) ); 
        }
        
        else if( n == 1024 )
        {
            this.setFillColor( new Color( 153, 153, 0 ));
           
        }
        
        else if( n == 2048 )
        {
            this.setFillColor( new Color( 0, 204, 204 ));
        }
        
    }
    
    public static void main( String arg[] )
    {
        new Frame();
        Tile t1 = new Tile( 100, 100 );
        t1.setValue( 4 );
        Tile t2 = new Tile( 200, 200 );
        t2.setValue( 512 );
        Tile t3 = new Tile( 300, 300 );
        t3.setValue( 2048 );
        System.out.println( t3.getValue() );
        
    }
}