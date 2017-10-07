import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.util.*;

/**
 * Class BlocklLetter, displays letters in bolcks and non-letters. 
 * 
 * 
 *  
 * @author Benjamin Miller
 * 
 */
public class BlockLetter extends TextBox
{
    private String originalLetter = "?";
    public static final int WIDTH = 22;
    public static final int HEIGHT = 26;
    public static final Color CLEAR = new Color( 0 , 0 , 0 , 0 );
    public static final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    
    //--------------------------------------------------------------------------
    /**
     * Construct a BlockLetter at (x,y) with the letter "aLetter".
     * 
     * If aLetter is a Letter it should have a frame around it, if it is 
     * not a letter it should not have a frame. 
     * 
     * @param x int
     * @param y int
     * @param aLetter String
     */
    public BlockLetter( int x, int y, String aLetter )
    {      
        
        super ( x , y );
        setSize( WIDTH , HEIGHT );
        
        originalLetter = aLetter;
        
        if( aLetter == null || aLetter.length() != 1 )
        {
            setText( "?" );
            setFillColor( Color.YELLOW );
            setFrameColor( CLEAR );
            
        }
        else if( aLetter.length() ==  1 )
        {
            setText( aLetter.toUpperCase() );
            
            if( ALPHA.contains( aLetter.toUpperCase() ) )
            {
                setFrameColor( Color.BLACK );
                setFillColor( CLEAR );
            } 
            
            if ( !( ALPHA.contains( aLetter.toUpperCase() ) ) )
            {
                setFillColor( CLEAR );
                setFrameColor( CLEAR );
                
            }
            
            
            
        }
        
        
        
    }
    

    //--------------------------------------------------------------------------
    /**
     * Substitue the letter "target" (in upper-case) if the original letter is 
     * "source" (in upper-case).
     * 
     * @param source String 
     * @param target String 
     * 
     */
    public void substitute( String source, String target )
    {
        String q = originalLetter;
        String st = source;
        
        
        if( q.contains( st ) || q.toUpperCase().contains( st.toUpperCase() ) )
        {
            setFillColor( CLEAR );
            setFrameColor( Color.BLACK );
            setText( target );
            String displayedText = target;
            String sk = displayedText;
            String skip = originalLetter;

            if(  skip.toUpperCase().contains( sk.toUpperCase() )  == false )
            { 
                Color c = new Color( 225 , 175 , 175 );
                setFillColor( c );
                setFrameColor( Color.RED );
                
            }
        }
        
    }
    
    
    
    
  
    
    //--------------------------------------------------------------------------
    /**
     * Runs some tests on BlockLetter.
     * 
     * @param args String[]
     * 
     */
    public static void main( String args[] )
    {
        new Frame();
        
        
        int offset = BlockLetter.WIDTH;
        String testValues = "Panda:Eats,shoots and leaves.";
        
        
        //Basic test, display letters as capitals in blocks, 
        // puntuation is found without blocks
        int y = 10, x = 10;
        for ( int i = 0; i < testValues.length() ; i++ )  
        {
            new BlockLetter( x  + ( offset * i ), y , 
                            testValues.substring( i, i + 1 ) );     
        }
        
        
       
        
        testValues = "ABCDEFGH";
        y = 60;
        
        new BlockLetter( x  + 0, y, "AB" );   // length 2
        new BlockLetter( x  + offset, y, "" );     // length 0 
        new BlockLetter( x  + 2 * offset, y, null );     // null
       
        
        BlockLetter bl = new BlockLetter( 10, 120, "A" );
        
        Utilities.sleep( 1000 );
        bl.substitute( "A", "B" );
        Utilities.sleep( 1000 );
        bl.substitute( "A", "C" );
        Utilities.sleep( 1000 );
        bl.substitute( "a", "d" );
        Utilities.sleep( 1000 );
        bl.substitute( "A", "?" );        
        Utilities.sleep( 1000 );
        bl.substitute( "A", "A" );
    }
}