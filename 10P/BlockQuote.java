import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.util.*;


//import javax.swing.text.Utilities;





/**
 * Displays a quote with letters in blocks and punctuation without blocks.
 * If a letter has been changed from the original then it is highlighted.
 * Displayed lines must be broken to stay on frame.
 * 
 * 
 * @author Benjamin Miller
 */
public class BlockQuote extends ShapeGroup
{
    private ArrayList< BlockLetter > blockQuote;
    private int oldint;
    private int oldinty;
    private int og;
    private String randomkey;
    private String storedText;
    
    /**
     * Creates a block-quote with first letter at initialX,initialY
     * with the text from quote.
     * 
     * @param initialX int
     * @param initialY int
     * @param quote String
     */
    //--------------------------------------------------------------------------
    public BlockQuote( int initialX , int initialY , String quote )
    {      
        create(  initialX ,  initialY ,  quote );
        
        
    }
    
    
    /**creates a blockquote.
      * 
      * @param initialX int
      * @param initialY int
      * @param quote1 string
      */
    public void create( int initialX , int initialY, String quote1 )
    {
        storedText = quote1;
        randomkey = StringUtilities.getRandomKey();
        String transla = StringUtilities.translate( quote1 , randomkey );
        String quote = transla;
        blockQuote = new ArrayList< BlockLetter >();
        int oldInitialX = initialX;
        oldint = initialX;
        oldinty = initialY;
        
        
        for( int i = 0; i < quote.length(); i++ )
        {
            
            String letter = Character.toString( quote.charAt( i ) );
            String space = " ";
            BlockLetter b1 = new BlockLetter( initialX , initialY , letter );
            
            
            
            if ( letter.contains( space ) && b1.getXLocation() > 450 )
            {
                initialX = oldInitialX;
                initialY = initialY + 40;
            } else
            {
                initialX = initialX + b1.WIDTH;
                
            }
            blockQuote.add( b1 );
            
        }
        
    }
    
    /** create2.
      * 
      * @param initialX int.
      * @param initialY int.
      * @param quote1 String.
      */
    public void create2( int initialX , int initialY , String quote1 )
    {
        
        String quote = quote1;
        blockQuote = new ArrayList< BlockLetter >();
        int oldInitialX = initialX;
        oldint = initialX;
        oldinty = initialY;
        
        
        for( int i = 0; i < quote.length(); i++ )
        {
            String letter = Character.toString( quote.charAt( i ) );
            String space = " ";
            BlockLetter b1 = new BlockLetter( initialX , initialY, letter );
            
            
            
            if ( letter.contains( space ) && b1.getXLocation() > 450 )
            {
                initialX = oldInitialX;
                initialY = initialY + 40;
            } else
            {
                initialX = initialX + b1.WIDTH;
                
            }
            blockQuote.add( b1 );
            
        }
        
    }
    
    /**translateBack.
      * 
      */
    public void translateBack()
    {
        
        for( int i = 0; i < blockQuote.size(); i++ )
        {
            blockQuote.get( i ).hide();
            blockQuote.get( i ).setLocation( -1000 , -1000 );
            
        }
        blockQuote.clear();
        
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String translated = StringUtilities.translate( storedText , alpha );
        create2(  oldint ,  oldinty ,  translated );
        
        
    }
    
    /** translateBack2.
      * 
      */
    public void translateBack2()
    {
        
        for( int i = 0; i < blockQuote.size(); i++ )
        {
            blockQuote.get( i ).hide();
            blockQuote.get( i ).setLocation( -1000 , -1000 );
            
        }
        blockQuote.clear();
        
        String translated = StringUtilities.translate( storedText , randomkey );
        create2(  oldint ,  oldinty ,  translated );
        
        
    }
    
    
    /**hide.
      * 
      */
    public void hide()
    {
        for( int i = 0; i < blockQuote.size(); i++ )
        {
            blockQuote.get( i ).hide();
            blockQuote.get( i ).setLocation( -1000 , -1000 );
            
        }
    }
    
    
    /**
     * Call the substitute method for all block letters 
     * to substitute "B" for "a".
     * 
     * @param a String
     * @param b String
     */
    public void substitute( String a , String b )
    {
        
        for( int i = 0; i < blockQuote.size(); i++ )
        {
            System.out.println( "block quote is" + blockQuote.get( i ) );
            
            blockQuote.get( i ).substitute( a , b );
           
            
        }
        
        
    }
    
    
    
    /**
     * Runs a simple test of BlockQuote.
     * 
     * @param args String[]
     */
    public static void main( String args[] )
    {
        new Frame();
        BlockQuote quote;
        quote =  new BlockQuote( 20,  50, 
                                "Life is full of misery, loneliness, and " +
                                "suffering -- and it's all over much too" + 
                                " soon.  Woody Allen" );
        
        
    }
}