import wheelsunh.users.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**--------------------------------------------------------
  * PigLatinApp:
  * Pig Latin Translator.
  * 
  * Lab 18.
  * @author Benjamin Miller
  * 
  * mlb 
  */


public class CryptogramApp
{
    private BlockQuote quote, quote2;
    private Random gen;
    private ArrayList<String> quotes;
    private Buttons b1, b2, b3;
   

  
   
   //--------------------------------------------------------
   //  No argumant constructor
    /**
     * CryptogramApp constructor.
     */
    public CryptogramApp( )
    {   
        quotes = StringUtilities.getQuotes();
        gen = new Random( );
        String randomquote = quotes.get( gen.nextInt( 6 ) );
     
        quote = new BlockQuote( 20 , 50, randomquote );  
        TextBox tb = new TextBox( 320, 300 );
        tb.setText( " Substitute " );
        tb.setSize( 100, 30 );
      
        TextBox tb2 = new TextBox( 320, 350 );
        tb2.setText( " Get New Quote " );
        tb2.setSize( 100, 30 );
                  
        TextBox tb3 = new TextBox( 320, 400 );
        tb3.setText( " Show/Hide Answer " );
        tb3.setSize( 100, 30 );
        b1 = new Buttons( 450, 300, this, 1 );
        b2 = new Buttons ( 450, 350, this, 2 );
        b3 = new Buttons( 450, 400, this, 3 );
    
    }
   /**
    * getNewQuote gets a new quote.
    */
    public void getNewQuote( )
    {
        String randomquote = quotes.get( gen.nextInt( 6 ) );
        quote = new BlockQuote( 20, 50, randomquote );
     
     
    }
   /**
    * hideQuote hides the quote.
    */
    public void hideQuote()
    {
        quote.hide();
    }
   /**
    * sub substitutes the encryped string for your letter of choice.
    * @param a is the first letter.
    * @param b is the second letter.
    */
    public void sub( String a, String b )
    {
        quote.substitute( a, b );
    }
   /**
    * translate translates the encrypted word.
    */
    public void translate(  )
    { 
        quote.translateBack( );
    }
   /** translateBack translates the encrypted word back.
     */
    public void translateBack(  )
    {
        quote.translateBack2( );
    }

   
    
   
  
   //--------------------------------------------------------
   // Creates a Frame and a PigLatinApp 
   /**
    * main tests the program.
    * @param args is the args.
    */
    public static void main( String args[] )
    {
        Frame f = new Frame();
        CryptogramApp c1 = new CryptogramApp( );
    
      
      
    }
}